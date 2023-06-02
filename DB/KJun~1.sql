-- 시퀀스: 자동으로 고유 숫자값을 생성해 주는 역할을 한다.
--        보통 기본키값에서 사용된다.
-- 참고: MYSQL이나 MariaDB에서는 auto_increment가 존재한다.

-- 생성방법:
-- CREATE SEQUENCE 이름(테이블이름_SEQ)
-- INCREMENT BY 증가숫자(보통은 1)
-- START WITH 초기숫자(보통은 1)
-- NOCYCLE;
-- NOCYCLE => 번호가 끝까지 간 후 다시 초기숫자로 돌아오지 않음

-- 사용방법: INSERT 할 때 시퀀스이름.NEXTVAL을 사용하면 자동으로 삽입 할 때 번호가 증가 된다.
SELECT * FROM CUSTOMER;
DELETE FROM CUSTOMER;
COMMIT;

CREATE SEQUENCE CUSTOMER_SEQ 
INCREMENT BY 1
START WITH 1
NOCYCLE;

INSERT INTO CUSTOMER(CUSTID, NAME, ADDRESS, PHONE) VALUES(CUSTOMER_SEQ.NEXTVAL, '박지성', '영국', '010-0000-0123');
INSERT INTO CUSTOMER(CUSTID, NAME, ADDRESS, PHONE) VALUES(CUSTOMER_SEQ.NEXTVAL, '김연아', '서울', '010-0000-0123');
INSERT INTO CUSTOMER(CUSTID, NAME, ADDRESS, PHONE) VALUES(CUSTOMER_SEQ.NEXTVAL, '장미란', '강원도', '010-0000-0123');
INSERT INTO CUSTOMER(CUSTID, NAME, ADDRESS, PHONE) VALUES(CUSTOMER_SEQ.NEXTVAL, '추신수', '미국', '010-0000-0123');
INSERT INTO CUSTOMER(CUSTID, NAME, ADDRESS, PHONE) VALUES(CUSTOMER_SEQ.NEXTVAL, '박세리', '대전', '010-0000-0123');
COMMIT;

SELECT * FROM CUSTOMER ORDER BY CUSTID;
--------------------------------------------------------------------------------
-- 뷰(VIEW): 다른 테이블을 기반으로 만들어진 가상 테이블
--              데이터를 실제로 저장하지 않고 논리적으로만 존재하는 테이블이다.
--              일반 사용자는 뷰를 만들 수 없다.
--              권한을 받아야 한다. (System계정에서 GRANT CREATE VIEW TO 일반계정)
--              뷰는 삽입, 삭제, 수정이 목적이 아니라 검색(SELECT)이 목적이다.
--              여러 테이블을 하나로 합쳐서 하나의 뷰로 만들 수도 있고
--              하나의 테이블의 여러개의 뷰를 만들 수도 있다.
--              같은 이름의 뷰가 존재하면 오류 발생

-- 만드는 방법:
--       같은 이름의 뷰가 있으면 생성되지 않는다
-- 방법1) CREATE VIEW 뷰이름
--        AS SELECT문;
--       같은 이름의 뷰가 있으면 기존 뷰를 삭제하고 새로 생성한다.
-- 방법2) CREATE OR REPLACE VIEW 뷰이름
--        AS SELECT문;

-- banana 고객이 주문한 제품의 이름을 검색해 보자.
SELECT P.제품명 FROM 제품 P, 주문 O WHERE P.제품번호 = O.주문제품 AND O.주문고객 = 'banana';

-- 위 내용을 뷰로 만들어 보자
CREATE VIEW banana_select AS SELECT P.제품명 FROM 제품 P, 주문 O WHERE P.제품번호 = O.주문제품 AND O.주문고객 = 'banana';
SELECT * FROM banana_select;

-- 고객의 이름과 고객이 주문한 도서의 이름을 구하시오.
CREATE VIEW V_BOOK 
AS SELECT C.NAME, B.BOOKNAME, B.PRICE FROM CUSTOMER C, ORDERS O, BOOK B
WHERE C.CUSTID = O.CUSTID AND O.BOOKID = B.BOOKID;

SELECT * FROM V_BOOK;

-- 이상미디어에서 출판한 도서를 구매한 고객의 이름을 보이시오
    -- SUBQUERY
CREATE VIEW 이상미디어_고객
AS SELECT NAME FROM CUSTOMER WHERE CUSTID IN (SELECT CUSTID FROM ORDERS WHERE BOOKID IN(SELECT BOOKID FROM BOOK WHERE PUBLISHER = '이상미디어'));

SELECT * FROM 이상미디어_고객;
--------------------------------------------------------------------------------
-- 오라클 내장 함수: 오라클 자체에서 가지고 있는 함수
-- DUAL: 출력결과를 보기 위해 오라클에서 제공하는 가상 테이블
-- 1. 숫자관련 내장 함수들
--  1) 절대값: ABS(숫자)
SELECT ABS(-75), ABS(+75), ABS(3.157), ABS(-3.157) FROM DUAL;
-- 2. 올림: CEIL(숫자), 소수점 기준으로 올림
SELECT CEIL(-75.41), CEIL(75.41), CEIL(75.61), CEIL(-75.61) FROM DUAL;
-- 3. 내림: FLOOR(숫자), 소수점 기준으로 내림
SELECT FLOOR(-75.41), FLOOR(75.41), FLOOR(75.61), FLOOR(-75.61) FROM DUAL;
-- 4. 내림: TRUNC(숫자), TRUNC(숫자, 자릿수), 소수점을 자릿수위치에서 삭제
SELECT TRUNC(-75.41), TRUNC(75.41), TRUNC(75.61), TRUNC(-75.61) FROM DUAL;
SELECT TRUNC(-75.41, 0), TRUNC(75.41, 0), TRUNC(75.61, 0), TRUNC(-75.61, 0) FROM DUAL;
SELECT TRUNC(-75.41, 1), TRUNC(75.41, 1), TRUNC(75.61, 1), TRUNC(-75.61, 1) FROM DUAL;
SELECT TRUNC(-75.41, -1), TRUNC(75.41, -1), TRUNC(75.61, -1), TRUNC(-75.61, -1) FROM DUAL;
-- 5. 반올림: ROUND(숫자), ROUND(숫자, 자릿수), 자릿수 이하만 올림
SELECT ROUND(-13.4441), ROUND(13.4441), ROUND(-13.5541), ROUND(13.5541) FROM DUAL;