-- PL/SQL: 오라클에서 지원하는 프로그래밍 언어의 특성을 수용한 SQL의 확장
--         SQL의 쿼리문 + 제어문(IF, LOOP, FOR)을 사용
--         절차적 프로그램이 가능하게 하는 오라클 SQL 전용언어
-- 참조: https://www.tutorialspoint.com/plsql/index.htm

-- 1.프로시져: RETURN 예약어를 사용하지 않는 함수와 같음(메소드)
--           작업순서가 정해진 독립된 프로그램의 수행 단위
--           결과를 가지고 되돌아 가려면 OUT 예약어를 사용해야 한다.
-- 기본구조: [선언절], 실행절, [예외절]
--  1.선언절: DECLARE
--           변순선언;
--  2.실행절: BEGIN ~ 
--           SQL 문장들
--           END;
--  3.예외절: EXCEPTION
-- Hello, World! 출력하기
--              자바                               오라클
-- String msg = "Hello, World!"; => msg varchar2(20) := 'Hello, World!';
-- System.out.println(msg);      => dbms_output.put_line(msg);
-- 단, dbms_output.put_line() 사용하기 위해서는 set serveroutput on;

-- A) 익명 프로시져: 일회용, 저장되지 않는다.
SET SERVEROUTPUT ON;
DECLARE
msg VARCHAR2(20) := 'Hello, World!';
BEGIN
dbms_output.put_line(msg);
END;

-- 익명 프로시져를 활용한 제어문 연습
-- 1) IF 조건식 THEN
--      조건식이 참일 때 실행할 문장;
--    END IF;
-- 변수 i가 10이면 데이터 값을 출력하자
DECLARE
i NUMBER := 10;
BEGIN
IF (i=10) THEN 
dbms_output.put_line('i는 ' || i || '입니다');
END IF;
END;

-- 2) IF 조건식 THEN
--      조건식이 참일 때 실행할 문장;
--      ELSE
--      조건식이 거짓일 때 실행할 문장;
--   END IF;
-- 변수 i 홀짝 판별하는 익명 프로시져
DECLARE
i NUMBER := 57;
res VARCHAR2(30);
BEGIN
IF (MOD(i,2) = 0) THEN
res := '짝수';
ELSE
res := '홀수';
END IF;
dbms_output.put_line(res);
END;

-- 3) IF 조건식 THEN
--      1번째 조건식이 참일 때 실행할 문장;
--    ELSIF 조건식 THEN
--      2번째 조건식이 참일 때 실행 할 문장;
--    ELSIF 조건식 THEN
--      3번째 조건식이 참일 때 실행 할 문장;
--    [ELSE 실행문;]
--    END IF;
DECLARE
i NUMBER := 80;
hak VARCHAR2(5);
BEGIN
IF (i>=90) THEN
hak := 'A';
ELSIF (i>=80) THEN
hak := 'B';
ELSIF (i>=70) THEN
hak := 'C';
END IF;
dbms_output.put_line(hak);
END;

--------------------------------------------------------------------------------

-- 반복문: FOR문, WHILE문, LOOP문
-- 1) FOR문
--  FOR 변수 IN 초기값 .. 최종값 LOOP
--      반복실행할 문장;
--  END LOOP;
-- 1~10까지 출력하는 프로시져
DECLARE
i NUMBER;
BEGIN
FOR i IN 1 .. 10 LOOP
    dbms_output.put_line(i);
END LOOP;
END;

DECLARE
BEGIN
FOR i NUMBER IN 1 .. 10 LOOP
    dbms_output.put_line(i);
END LOOP;
END;

-- 1~10까지 짝수만 출력
DECLARE
BEGIN
FOR i NUMBER IN 1 .. 10 LOOP
IF MOD(i,2) = 0 THEN 
dbms_output.put_line(i);
END IF;
END LOOP;
END;

-- 1~10까지 짝수의 합 출력
DECLARE
A NUMBER := 0;
i NUMBER ;
BEGIN
FOR i IN 1 .. 10 LOOP
IF (MOD(i,2) = 0) THEN
A := A + i;
END IF;
END LOOP;
dbms_output.put_line(A);
END;

-- 2) WHILE 문
-- DECLARE
-- 변수(초기식)
-- BEGIN
-- WHILE 조건식 LOOP
--      실행할 문장;
--      증감식;
-- END LOOP;
-- END;
-- 1~10까지 출력
DECLARE
A NUMBER := 1;
BEGIN
WHILE A<=10 LOOP
dbms_output.put_line(A);
A := A + 1;
END LOOP;
END;

-- 1~10까지 짝수만 출력
DECLARE
A NUMBER := 1;
BEGIN
WHILE A<=10 LOOP
IF (MOD(A,2)=0) THEN
dbms_output.put_line(A);
END IF;
A := A + 1;
END LOOP;
END;

DECLARE
A NUMBER := 1;
B NUMBER := 0;
BEGIN
WHILE A<=10 LOOP
IF (MOD(A,2)=0) THEN
B := B + A;
END IF;
A := A + 1;
END LOOP;
dbms_output.put_line(B);
END;

-- 3-1) LOOP
--DECLARE
-- 변수명(초기식)
-- BEGIN
--  LOOP
--      실행할 문장;
--      증감식;
--      IF (빠져나갈 조건식) THEN
--      EXIT;
--      END IF;
--  END LOOP;
-- END;
DECLARE
i NUMBER := 1;
BEGIN
LOOP
dbms_output.put_line(i);
IF (i=10) THEN
EXIT;
END IF;
i := i + 1;
END LOOP;
END;

-- 3-2) LOOP
--DECLARE
-- 변수명(초기식)
-- BEGIN
--  LOOP
--      실행할 문장;
--      EXIT WHEN 조건식; -빠져나가는 조건식
--      증감식;
--  END LOOP;
-- END;

DECLARE
i NUMBER := 1;
BEGIN
LOOP
dbms_output.put_line(i);
EXIT WHEN i=10;
i := i + 1;
END LOOP;
END;

-- B) 저장 프로시져
-- 형식) CREATE [OR REPLACE] PROCEDURE 이름 AS
--       BEGIN
--          내용;(UPDATE, INSERT, DELETE는 일반 SQL과 같지만 SELECT는 다르다.
--       END;
-- CUSTOMER테이블에서 CUSTID가 2인 자료의 이름을 '둘리'로 변경
-- 1.프로시져 생성
CREATE PROCEDURE ch_name AS
BEGIN
UPDATE CUSTOMER SET NAME = '둘리' WHERE CUSTID = '2';
END;
-- 2.프로시져 실행: EXEC 프로시져이름;
EXEC ch_name;
SELECT * FROM CUSTOMER;

-- 외부에서 CUSTID와 이름을 받아서 CUSTOMER테이블을 수정하는 프리시져를 만들자
-- 외부에서 정보를 받는다 => 매계변수, 인자 => IN 생략가능
-- 정보가 외부로 나간다 => RETURN        => OUT
-- 만약에 특정테이블의 데이터타입을 모를 때: 테이블.칼럼명%TYPE
CREATE PROCEDURE ch_name3(p_name IN customer.name%TYPE, p_custid IN customer.custid%TYPE) AS
BEGIN
UPDATE CUSTOMER SET NAME = p_name WHERE custid = p_custid;
END;

-- 실행
EXEC CH_NAME3('임꺽정', 1);
EXEC CH_NAME3('마이콜', 4);

-- CUSTOMER테이블에 6번 손흥민 대한민국 경기도 000-1414-1414의 정보를 삽입하는 프로시져 생성
CREATE PROCEDURE ins_customer AS
BEGIN
INSERT INTO CUSTOMER(custid, name, address, phone) VALUES (14, '손흥민', '대한민국 경기도', '010-1111-2222');
END;
EXEC ins_customer;

-- CUSTOMER테이블에 번호, 이름, 주소, 전화번호를 입력받아 저장하는 프로시져 생성
CREATE PROCEDURE ins_customer2(p_custid IN customer.custid%TYPE, p_name IN customer.name%TYPE, p_address IN customer.address%TYPE, p_phone IN customer.phone%TYPE) AS
BEGIN
INSERT INTO CUSTOMER(custid, name, address, phone) VALUES (p_custid, p_name, p_address, P_phone);
END;
EXEC ins_customer2(14, '권연준', '인천', '010-5128-3539');

-- CUSTOMER테이블에 번호를 받아서 삭제하는 프로시져 생성
CREATE PROCEDURE del_customer(p_custid IN customer.custid%TYPE) AS
BEGIN
DELETE FROM CUSTOMER WHERE custid = p_custid;
END;
EXEC del_customer(14);

-- 중요! BEGIN ~ ENG; 블록안에서 사용되는 SELECT문
-- SELECT 컬럼
-- INTO 저장변수(결과값 저장)
-- FROM 테이블이름
-- WHERE 조건식
-- 특징: WHERE 조건식을 사용하여 결과값이 하나만 나오게 하자
--      나온 결과는 INTO 다음에 있는 저장변수에 저장하자
DECLARE 
v_name customer.name%TYPE;
BEGIN
SELECT NAME INTO v_name
FROM customer
where custid = 2;
dbms_output.put_line(v_name);
END;

DECLARE 
v_customer customer%rowtype;
BEGIN
SELECT * INTO v_customer
FROM customer
where custid = 2;
dbms_output.put_line(v_customer.custid);
dbms_output.put_line(v_customer.name);
dbms_output.put_line(v_customer.address);
dbms_output.put_line(v_customer.phone);
END;

-- EXEC로 실행 안됨
-- EXEC AVG_PRICE();
-- 익명 프로시져로 실행 시킨다.
DECLARE

BEGIN
END;
