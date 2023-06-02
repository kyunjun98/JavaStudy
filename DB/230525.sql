-- 테이블 생성
CREATE TABLE MEMBER01(
    ID NUMBER NOT NULL PRIMARY KEY,
    M_ID VARCHAR2(50),
    M_PW VARCHAR2(50),
    M_NAME VARCHAR2(50),
    M_AGE NUMBER(3),
    M_REG DATE
);
    
CREATE TABLE MEMBER02(
    ID NUMBER NOT NULL,
    M_ID VARCHAR2(50),
    M_PW VARCHAR2(50),
    M_NAME VARCHAR2(50),
    M_AGE NUMBER(3),
    M_REG DATE,
    PRIMARY KEY(ID)
);  
    
CREATE TABLE MEMBER03(
    ID NUMBER NOT NULL,
    M_ID VARCHAR2(50) NOT NULL,
    M_PW VARCHAR2(50),
    M_NAME VARCHAR2(50),
    M_AGE NUMBER(3),
    M_REG DATE,
    PRIMARY KEY(ID, M_ID)
);
    
-- 테이블 삭제
DROP TABLE MEMBER01;
DROP TABLE MEMBER03;

INSERT INTO MEMBER01 VALUES(3, '이길동', '1111', '홍길동', 30, SYSDATE);
COMMIT; -- 커밋을 해야지 데이터베이스에 저장이 됨 하지 않으면 날라감
SELECT * FROM MEMBER01;

-- 테이블 복사(MEMBER01 테이블을 구조와 내용 복사해서 C_MEM01 테이블 생성) - 단 KEY는 복사가 안됨`
CREATE TABLE C_MEM01 AS SELECT * FROM MEMBER01;
-- 테이블 복사(MEMBER01 테이블을 구조만 복사해서 C_MEM02 테이블 생성)
CREATE TABLE C_MEM02 AS SELECT * FROM MEMBER01 WHERE 1 = 2;

-- 고객 테이블(고개아이디(pk)), 고객이름, 나이, 등급, 직업, 적립금)
CREATE TABLE 고객(
    고객아이디 VARCHAR2(50) NOT NULL PRIMARY KEY,
    고객이름 VARCHAR2(50),
    나이 NUMBER(3),
    등급 VARCHAR2(50),
    직업 VARCHAR2(50),
    적립금 NUMBER
);

-- book 테이블 만들기
-- 도서번호(bookid, pk), 도서이름(bookname, 99), 출판사(publisher, 50), 가격(price, 7)
CREATE TABLE BOOK (
    bookid NUMBER NOT NULL PRIMARY KEY,
    bookname VARCHAR2(99),
    publisher VARCHAR2(50),
    price NUMBER(7)
);

-- 제약조건
-- NOT NULL: 널을 허용하지 않음
-- DEFAULT: 기본값을 지정하는 키워드
-- 적립금 NUMBER DEFAULT 0 -> 값을 입력할 때 입력하지 않으면 0으로 채워진다.
-- CHECK: 테이블에 정확하고 유효한 데이터를 유지하기 위해 특정 속성에 대한 제약조건을 지정
-- AGE NUMBER CHECK >= 19 -> AGE가 19이상인 숫자만 받는다
-- 재고량 NUMBER CHECK(재고량 >= 0 AND 재고량 <= 1000) -> 재고량이 0~1000까지 숫자만 받는다
    
--테이블 구조 변경: ALTER
-- 컬럼 추가(ADD): ALTER TABLE 테이블이름 ADD 컬럼명 자료형(크기) [제약조건]
ALTER TABLE MEMBER01 ADD M_ADDR1 VARCHAR2(100);
COMMIT;
-- MEMBER01 테이블에 주소를 넣자(M_ADDR VARCHAR2(100) DEFAULT '서울';
ALTER TABLE MEMBER01 ADD M_ADDR2 VARCHAR2(100) DEFAULT '서울';
COMMIT;
SELECT * FROM MEMBER01;

-- 컬럼 삭제(DROP): ALTER TABLE 테이블이름 DROP COLUMN 컬럼명;
ALTER TABLE MEMBER01 DROP COLUMN M_ADDR1;
COMMIT;
-- ADDR2는 데이터가 있었지만 삭제됨 조심해야함...
ALTER TABLE MEMBER01 DROP COLUMN M_ADDR2;
COMMIT;

-- 컬럼 변경(MODIFY):  ALTER TABLE 테이블이름 MODIFY 컬럼명 자료형(크기) [제약조건]
-- 데이터가 없는 경우: 컬럼의 자료형과 크기를 마음대로 변경할 수 있다.

-- M_ADDR1은 데이터가 없으므로 같은 자료형의 크기 마음대로 변경
ALTER TABLE MEMBER01 MODIFY M_ADDR1 VARCHAR2(50);
COMMIT;
-- M_ADDR1은 데이터가 없으므로 자료형을 변경 할 수 있다.
ALTER TABLE MEMBER01 MODIFY M_ADDR1 NUMBER(7);
COMMIT;

-- 데이터가 있는 경우 같은 자료형의 크기 변경은 가능(단, 기존에 있는 데이터의 크기보다는 커야 된다.)
ALTER TABLE MEMBER01 MODIFY M_ADDR2 VARCHAR2(50);

-- 데이터가 있는데 다른 자료형으로 변경 할 때(비추천)
-- 문자를 숫자로 변경할 때(안됨)
ALTER TABLE MEMBER01 MODIFY M_ADDR2 NUMBER;
-- 숫자를 문자로 변경할 때(안됨)
ALTER TABLE MEMBER01 MODIFY M_AGE VARCHAR(40);