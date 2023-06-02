-- 조작어(DML): 삽입(INSERT ~ INTO), 삭제(DELETE FROM), 수정(UPDATE ~ SET), 검색(SELECT ~FROM)
-- 제어어(DCL): GRANT, REVOKE, COMMIT, ROLLBACK
-- COMMIT: 현재 상태를 DB에 적용(저장)
-- ROLLBACK: COMMIT 이전상태로 되돌린다.
-- COMMIT - 작업1 - 작업2 - 작업3 - COMMIT - 작업4 - 작업5 -COMMIT - ROLLBACK(작업4, 작업5 이전상태로 되돌린다.)

-- 데이터 삽입(INSERT INTO ~ VALUES ~ )
-- 방법1) INSERT INTO 테이블이름 VALUES (값1,값2,값3...값4);
-- 값은 순서대로 모두 채워야 한다.
-- 모두 채우지 않으면 오류이다.
-- 값을 넣기 싫으면 NULL을 넣을 수 있다.
-- 단, 속성 NOT NULL이면 값이 무조건 있어야 한다.
-- 날짜와 문자는 반드시 '' 사용
-- SYSDATE는 오늘 날짜를 뜻하는 오라클 명령어이다.
INSERT INTO MEMBER01 
VALUES(1, 'KIM', 'K111', '김돌리', 24, SYSDATE, 02, '서울');

--INSERT INTO MEMBER01 
--VALUES(1, 'KIM', 'K111', '김돌리');

INSERT INTO MEMBER01 
VALUES(2, 'KIM', 'K111', '김돌리', 24, SYSDATE, NULL, NULL);

INSERT INTO MEMBER01
VALUES(3, 'KIM', 'K111', '김돌리', 24, '2023/01/22', 02, '서울');

-- 방법2) INSERT INTO 테일블명(컬럼명1, 컬럼명2,...)
-- VALUES (컬럼명1의 값, 컬럼명2의 값,...)
-- 컬럼명과 들어갈 값은 반드시 1:1 매칭
-- 속성이 NOT NULL인 경우 반드시 넣어야 된다.
INSERT INTO MEMBER01(ID)
VALUES(7);

SELECT * FROM MEMBER01;
--------------------------------------
INSERT INTO 고객 VALUES ('apple', '정소화', 20, 'GOLD', '학생', 1000);
INSERT INTO 고객 VALUES ('BANANA', '김선우', 25, 'VIP', '간호사', 2500);
INSERT INTO 고객 VALUES ('CARROT', '고명석', 28, 'GOLD', '교사', 4500);
INSERT INTO 고객 VALUES ('ORANGE', '김용욱', 22, 'SILVER', '학생', 0);
INSERT INTO 고객 VALUES ('MELON', '성원용', 22, 'GOLD', '회사원', 500);
INSERT INTO 고객 VALUES ('PEAR', '채광주', 31, 'SLIVER', '회사원', 500);

COMMIT;

INSERT INTO 고객테이블 VALUES ('123', '', 311, 'SLIVER1', '1회사원', 5100);
SELECT * FROM 고객테이블;

CREATE TABLE 제품(
    제품번호 VARCHAR2(50) NOT NULL,
    제품명 VARCHAR2(50),
    재고량 NUMBER,
    단가 NUMBER, 
    제조업체 VARCHAR2(50),
    PRIMARY KEY(제품번호)
);

CREATE TABLE 주문(
    주문번호 VARCHAR2(50) NOT NULL,
    주문고객 VARCHAR2(50),
    주문제품 VARCHAR2(50) NOT NULL,
    수량 NUMBER,
    배송지 VARCHAR2(50),
    주문일자 DATE,
    PRIMARY KEY(주문번호)
    --FOREIGN KEY(주문제품) REFERENCES 제품(제품번호) -- 이 주석 없애려면 윗줄 , 줘야함
);

INSERT INTO 제품 VALUES ('p01', '그냥만두', 5000, 4500, '대한식품');
INSERT INTO 제품 VALUES ('p02', '매운쫄면', 2500, 5500, '민국푸드');
INSERT INTO 제품 VALUES ('p03', '쿵떡파이', 3600, 2600, '한빛제과');
INSERT INTO 제품 VALUES ('p04', '맛난초콜릿', 1250, 2500, '한빛제과');
INSERT INTO 제품 VALUES ('p05', '얼큰라면', 2200, 1200, '대한식품');
INSERT INTO 제품 VALUES ('p06', '통통우동', 1000, 1550, '민국푸드');
INSERT INTO 제품 VALUES ('p07', '달콤비스킷', 1650, 1500, '한빛제과');

INSERT INTO 주문 VALUES('o01', 'apple', 'p03', 10, '서울시 마포구', '2022-01-01');
INSERT INTO 주문 VALUES('o02', 'melon', 'p01', 5, '인천시 계양구', '2022-01-10');
INSERT INTO 주문 VALUES('o03', 'banana', 'p06', 45, '경기도 부천시', '2022-01-11');
INSERT INTO 주문 VALUES('o04', 'carrot', 'p02', 8, '부천시 금정구', '2022-02-01');
INSERT INTO 주문 VALUES('o05', 'melon', 'p06', 36, '경기도 용인시', '2022-02-20');
INSERT INTO 주문 VALUES('o06', 'banana', 'p01', 19, '충청북도 보은군', '2022-03-02');
INSERT INTO 주문 VALUES('o07', 'apple', 'p03', 22, '서울시 영등포구', '2022-03-15');
INSERT INTO 주문 VALUES('o08', 'pear', 'p02', 50, '강원도 춘천시', '2022-04-10');
INSERT INTO 주문 VALUES('o09', 'banana', 'p02', 15, '전라남도 목포시', '2022-04-11');
INSERT INTO 주문 VALUES('o10', 'carrot', 'p03', 20, ' 경기도 안양시', '2022-05-22');

COMMIT;

-- 수정, 삭제는 반드시 조건식을 넣어야 한다.
-- 조건식을 넣지 않으면 전체가 삭제되거나 전체가 수정 된다.
-- 데이터 삭제(DELETE FROM 테이블이름 [WHERE 조건식]);
-- 조건식이 있으면 조건식이 참인 것만 실행된다.
-- 조건식이 없으면 전체가 삭제된다.
-- 조건식( 컬럼명 비교연산자)
DELETE FROM 고객테이블;
SELECT * FROM 고객테이블;

-- 제조업체가 '한빛제과'인 행만 삭제
DELETE FROM 제품 WHERE 제조업체 = '한빛제과';
-- 제조업체가 '민국푸드'이면서 단가 3000이하인 행만 삭제
DELETE FROM 제품 WHERE 제조업체 = '민국푸드' AND 단가 <= 3000;
SELECT * FROM 제품;
ROLLBACK;

-- 데이터 수정(UPDATE 테이블이름 SET 변경내용 [WHERE 조건식]);
-- 조건식이 있으면 조건식이 참인 것만 실행된다.
-- 조건식이 없으면 전체가 수정된다.

-- 제조업체를 대한푸드로 변경
UPDATE 제품 SET 제조업체 = '대한푸드';
-- 단가가 2000이상인 행만 제조업체를 한빛제과로 변경
UPDATE 제품 SET 제조업체 = '한빛제과' WHERE 단가 >= 2000;
-- 제품번호가 p01 OR p05 행만 재고량을 1000, 제조업체를 대한식품으로 변경
UPDATE 제품 SET  제조업체 = '대한식품', 재고량 = 1000 WHERE 제품번호 = 'p01' OR 제품번호 = 'p05';
ROLLBACK;

-- 제품 테이블에서 제품번호가 p03인 제품의 제품명을 통큰파이로 수정하자
UPDATE 제품 SET 제품명 = '통큰파이' WHERE 제품번호 = 'p02';
-- 제품 테이블에 있는 모든 제품의 단가를 10% 인상해보자
UPDATE 제품 SET 단가 = 단가*1.1;
-- 주문 테이블에서 주문일자가 2022-05-22인 주문내역을 삭제하자
DELETE FROM 주문 WHERE 주문일자 = '2022-05-22';
-- 주문 테이블에서 주문일자가 2022-03~2022-04인 주문내역을 삭제하자
DELETE FROM 주문 WHERE 주문일자 >= '2022-03-01' AND 주문일자 <= '2022-04-30';

-- 주문 테이블에 주믄일자를 모두 5일 추가하자
UPDATE 주문 SET 주문일자 = 주문일자 + '5';
-- 주문 테이블에서 정소화 고객이 주문한 제품의 주문 수량을 5개로 수정해보자
UPDATE 주문 SET 수량 = 5 WHERE 주문.주문고객 
IN(SELECT 고객.고객아이디 FROM 고객 WHERE 고객.고객이름 = '정소화');

SELECT * FROM 주문;
SELECT * FROM 고객;
COMMIT;
