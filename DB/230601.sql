-- 고객 테이블에서 적립금 평균이 1000원 이상인 등급에 대한 고객 수
SELECT 등급, COUNT(*) AS 고객수 FROM 고객 GROUP BY 등급 HAVING AVG(적립금) >= 1000;

-- ORDERS 테이블에서 고객별로 주문한 도서의 총 수량과 총 판매액 구하시오.
SELECT CUSTID, COUNT(CUSTID), SUM(SALEPRICE) FROM ORDERS
GROUP BY CUSTID;

-- 가격이 8000원 이상인 도서를 구매한 고객에 대해여 고객별 주문 도서의 총 수량을 구하시오
SELECT CUSTID, COUNT(*) FROM ORDERS WHERE SALEPRICE >=8000
GROUP BY CUSTID;

-- 가격이 8000원 이상인 도서를 구매한 고객에 대해여 고객별 주문 도서의 총 수량을 구하시오
-- 단 두권 이상 구매한 고객만 구한다.
SELECT CUSTID, COUNT(*) FROM ORDERS WHERE SALEPRICE >=8000
GROUP BY CUSTID HAVING COUNT(*)>=2;

-- orders 테이블에서 박지성의 총 구매액(박지성의 고객번호는 1번으로 놓고 작성)
SELECT SUM(SALEPRICE) FROM ORDERS WHERE CUSTID=1;
-- 박지성이 구매한 도서의 수(박지성의 고객번호는 1번으로 놓고 작성)
SELECT COUNT(*) AS 박지성 FROM ORDERS WHERE CUSTID IN (SELECT CUSTID FROM CUSTOMER WHERE NAME = '박지성');
-- BOOK 테이블에서의 출판사의 총 개수(중복제거)
SELECT COUNT(DISTINCT publisher) AS 도서 FROM BOOK;

-- 조인(JOIN) 검색: 2개 이상의 테이블을 연결하여 데이터를 검색하는 것
-- 일반적으로 외래키를 이용해서 조인 한다.
-- 연결하려는 테이블간의 속성의 이름은 달라도 되지만 도메인(데이터타입=크기)은 같아야 한다.
-- FROM 절에서 검색에 필요한 모든 테이블을 나열
-- WHERE 절에 조인 속성이 값이 같아야 함을 의미하는 조인조건을 제시
-- 별칭을 이용해 SQL을 작성하는 것이 좋다.
-- 내부조인(INNER JOIN)
-- SELECT A테이블명.컬럼명, A테이블명.컬럼명, B테이블명.컬럼명, B테이블명.컬럼명
-- FROM A테이블명, B테이블명
-- WHERE A테이블.칼럼명 = B테이블.칼럼명 -> 중요) 이 때 컬럼은 외래키가 기본이다.
-- 중요) 두 테이블이 모두 같은 컬럼을 가지고 있을때 사용

-- BANANA 고객이 주문한 제품의 이름을 검색해 보자.
SELECT * FROM 제품, 주문 WHERE 제품.제품번호 = 주문.주문제품 and 주문.주문고객 = 'banana';
SELECT P.제품명 FROM 제품 P INNER JOIN 주문 O ON P.제품번호 = O.주문제품
WHERE O.주문고객 = 'banana';
-------------------------------------------------------------

-- 나이가 30세이상인 고객이 주문한 제품의 번호와 주문일자, 고객이름을 검색하자
SELECT 고객.고객이름, 주문.주문제품, 주문.주문일자
FROM 고객, 주문 WHERE 고객.고객아이디 = 주문.주문고객 AND 고객.나이>=30;

-- 나이가 30세이상인 고객이 주문한 제품의 번호와 주문일자, 고객이름, 제품명을 검색하자
SELECT c.고객이름, c.나이, o.주문제품, p.제품명, o.주문일자
FROM 고객 c, 주문 o, 제품 p where c.고객아이디 = o.주문고객 AND o.주문제품 = P.제품번호 AND c.나이 >= 30;

-- 고명석 고객이 주문한 제품의 제품명을 검색하자
SELECT C.고객이름, P.제품명 FROM 고객 C, 주문 O, 제품 P WHERE C.고객아이디 = O.주문고객 AND O.주문제품 = P.제품번호 AND C.고객이름 = '고명석';

-- 고객의 이름과 고객이 주문한 도서의 판매가격을 검색하시오. 조인
SELECT C.NAME, B.BOOKNAME, B.PRICE FROM CUSTOMER C, BOOK B, ORDERS O WHERE C.CUSTID = O.CUSTID AND O.BOOKID = B.BOOKID; 

-- 고객ID로 주문한 모든 도서의 총 판매액을 구하기
SELECT C.NAME , SUM(O.SALEPRICE) FROM CUSTOMER C, BOOK B, ORDERS O WHERE C.CUSTID = O.CUSTID AND O.BOOKID = B.BOOKID GROUP BY C.NAME;

-- 고객ID로 주문한 모든 도서의 총 판매액을 구하고, 고객이름으로 정렬하시오.
SELECT C.NAME, SUM(O.SALEPRICE) FROM CUSTOMER C, BOOK B, ORDERS O WHERE C.CUSTID = O.CUSTID AND O.BOOKID = B.BOOKID GROUP BY C.NAME ORDER BY C.NAME ASC;

-- 고객의 이름과 고객이 주문한 도서의 이름, 주문 날짜를 구하시오.
SELECT C.NAME, B.BOOKNAME, O.ORDERDATE FROM CUSTOMER C, BOOK B, ORDERS O WHERE C.CUSTID = O.CUSTID AND O.BOOKID = B.BOOKID;

-- 가격이 20000원 이상인 도서를 주문한 고객의 이름과 도서의 이름을 구하시오.
SELECT C.NAME, B.BOOKNAME, O.ORDERDATE FROM CUSTOMER C, BOOK B, ORDERS O WHERE C.CUSTID = O.CUSTID AND O.BOOKID = B.BOOKID AND B.PRICE>=20000;

--------------------------------------------------
create table AAA(
    id number PRIMARY key ,
    ename VARCHAR2(50)
);
create table BBB(
    id number PRIMARY key ,
    kname VARCHAR2(50)
);

insert into AAA values(1,'AAA');
insert into AAA values(2,'BBB');
insert into AAA values(3,'CCC');

insert into BBB values(1,'가');
insert into BBB values(2,'나');
insert into BBB values(4,'라');
insert into BBB values(5,'마');
commit;

-- LEFT JOIN: 왼쪽 테이블에 있는거 전부와 중복되는 부분(없으면 NULL)
-- SELECT 컬럼명,...,컬럼명 FROM 테이블1 LEFT JOIN 테이블2 ON 조인조건 [WHERE 검색조건];
SELECT AAA.ENAME, BBB.KNAME FROM AAA LEFT JOIN BBB ON AAA.ID = BBB.ID;

-- RIGHT JOIN: 오른쪽 테이블에 있는거 전부와 중복되는 부분(없으면 NULL)
-- 테이블 위치를 바꾸면 그게 LEFT JOIN이랑 똑같음
-- SELECT 컬럼명,...,컬럼명 FROM 테이블1 LEFT JOIN 테이블2 ON 조인조건 [WHERE 검색조건];
SELECT AAA.ENAME, BBB.KNAME FROM AAA RIGHT JOIN BBB ON AAA.ID = BBB.ID;

-- 고객테이블을 기준으로 고객이름, 주문제품, 주문일자를 검색하자.
SELECT C.고객이름, O.주문제품, O.주문일자 FROM 고객 C LEFT JOIN 주문 O ON C.고객아이디 = O.주문고객 ORDER BY C.고객이름;

-- 도서를 구매하지 않은 고객을 포함하여 고객의 이름과 고객이 주문한 도서의 판매가격을 구하시오.
SELECT C.NAME, O.SALEPRICE FROM CUSTOMER C LEFT JOIN ORDERS O ON C.CUSTID = O.CUSTID;

select * from customer ;