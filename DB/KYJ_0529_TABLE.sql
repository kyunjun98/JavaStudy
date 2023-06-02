DROP TABLE BOOK;
CREATE TABLE BOOK(
bookid VARCHAR2(50) NOT NULL PRIMARY KEY,
bookname VARCHAR2(50),
publisher VARCHAR2 (50),
price NUMBER
);
INSERT INTO BOOK VALUES('1','�౸�� ����','�½�����',7000);
INSERT INTO BOOK VALUES('2','�౸�ƴ� ����','������',13000);
INSERT INTO BOOK VALUES('3','�౸�� ����','���ѹ̵��',22000);
INSERT INTO BOOK VALUES('4','���� ���̺�','���ѹ̵��',35000);
INSERT INTO BOOK VALUES('5','�ǰ� ����','�½�����',8000);
INSERT INTO BOOK VALUES('6','���� �ܰ躰���','�½�����',6000);
INSERT INTO BOOK VALUES('7','�߱��� �߾�','�̻�̵��',20000);
INSERT INTO BOOK VALUES('8','�߱��� ��Ź��','�̻�̵��',13000);
INSERT INTO BOOK VALUES('9','�ø��� �̾߱�','�Ｚ��',7500);
INSERT INTO BOOK VALUES('10','Clympic Champions','������',13000);

---------------------------------------------------------------------
DROP TABLE CUSTOMER;
CREATE TABLE CUSTOMER(
custid VARCHAR2(50) NOT NULL PRIMARY KEY,
name VARCHAR2(50),
address VARCHAR2 (50),
phone VARCHAR2(50)
);
INSERT INTO CUSTOMER VALUES('1','������','���� ��ü��Ÿ','000-5000-0001');
INSERT INTO CUSTOMER VALUES('2','�迬��','���ѹα� ����','000-6000-0001');
INSERT INTO CUSTOMER VALUES('3','��̶�','���ѹα� ������','000-7000-0001');
INSERT INTO CUSTOMER VALUES('4','�߽ż�','�̱� Ŭ��������','000-8000-0001');
INSERT INTO CUSTOMER VALUES('5','�ڼ���','���ѹα� ����', '');

---------------------------------------------------------------------
DROP TABLE ORDERS;
CREATE TABLE ORDERS(
orderid VARCHAR2(50) NOT NULL PRIMARY KEY,
custid VARCHAR2(50) NOT NULL,
bookid VARCHAR2(50) NOT NULL,
saleprice NUMBER,
orderdate VARCHAR2(50),
FOREIGN KEY(custid) REFERENCES CUSTOMER(custid),
FOREIGN KEY(bookid) REFERENCES BOOK(bookid)
);
INSERT INTO ORDERS VALUES('1','1','1',6000,'2014-07-01');
INSERT INTO ORDERS VALUES('2','1','3',21000,'2014-07-03');
INSERT INTO ORDERS VALUES('3','2','5',8000,'2014-07-03');
INSERT INTO ORDERS VALUES('4','3','6',6000,'2014-07-04');
INSERT INTO ORDERS VALUES('5','4','7',20000,'2014-07-05');
INSERT INTO ORDERS VALUES('6','1','2',12000,'2014-07-07');
INSERT INTO ORDERS VALUES('7','4','8',13000,'2014-07-07');
INSERT INTO ORDERS VALUES('8','3','10',12000,'2014-07-08');
INSERT INTO ORDERS VALUES('9','2','10',7000,'2014-07-09');
INSERT INTO ORDERS VALUES('10','3','8',13000,'2014-07-10');

COMMIT;