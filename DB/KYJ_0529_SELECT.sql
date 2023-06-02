-- 1.모든 도서의 이름과 가격을 검색하시오.
SELECT bookname, price FROM BOOK;

-- 2.모든 도서의 가격과 이름을 검색하시오.
SELECT price, bookname FROM BOOK;

-- 3.모든 도서의 도서번호, 도서이름, 출판사, 가격을 검색하시오.
SELECT bookid, bookname, publisher, price FROM BOOK;

-- 4.도서 테이블에 있는 모든 출판사를 검색하시오.
SELECT publisher FROM BOOK;

-- 5.도서 테이블에 있는 모든 출판사를 검색하시오.(중복제거)
SELECT DISTINCT publisher FROM BOOK;

-- 6.가격이 10,000원 이상 20,000 이하인 도서를 검색하시오.
SELECT * FROM BOOK WHERE price>=10000 AND price<=20000;

-- 7.출판사가 ‘굿스포츠’ 혹은 ‘대한미디어’인 도서를 검색하시오.
SELECT * FROM BOOK WHERE publisher='굿스포츠' OR publisher='대한미디어';

-- 8.'축구의 역사’를 출간한 출판사를 검색하시오.
SELECT publisher FROM BOOK WHERE bookname='축구의 역사';

-- 9.도서이름에 ‘축구’가 포함된 출판사를 검색하시오.
SELECT publisher FROM BOOK WHERE bookname LIKE '%축구%';

-- 10.도서이름의 왼쪽 두 번째 위치에 ‘구’라는 문자열을 갖는 도서를 검색하시오
SELECT bookname FROM BOOK WHERE bookname LIKE '_구%';

-- 11.축구에 관한 도서 중 가격이 20,000원 이상인 도서를 검색하시오.
SELECT bookname FROM BOOK WHERE bookname LIKE '%축구%' AND price >= 20000;

-- 12.출판사가 ‘굿스포츠’ 혹은 ‘대한미디어’인 도서를 검색하시오
SELECT bookname FROM BOOK WHERE publisher IN ('굿스포츠', '대한미디어');

-- 13.도서를 이름순으로 검색하시오.
SELECT * FROM BOOK ORDER BY bookname;

-- 14.도서를 가격순으로 검색하고, 가격이 같으면 이름순으로 검색하시오.
SELECT * FROM BOOK ORDER BY price, bookname;

-- 15.도서를 가격의 내림차순으로 검색하시오. 만약 가격이 같다면 출판사의 오름차순으로 검색한다.
SELECT * FROM BOOK ORDER BY price DESC, publisher;