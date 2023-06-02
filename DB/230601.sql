-- �� ���̺��� ������ ����� 1000�� �̻��� ��޿� ���� �� ��
SELECT ���, COUNT(*) AS ���� FROM �� GROUP BY ��� HAVING AVG(������) >= 1000;

-- ORDERS ���̺��� ������ �ֹ��� ������ �� ������ �� �Ǹž� ���Ͻÿ�.
SELECT CUSTID, COUNT(CUSTID), SUM(SALEPRICE) FROM ORDERS
GROUP BY CUSTID;

-- ������ 8000�� �̻��� ������ ������ ���� ���ؿ� ���� �ֹ� ������ �� ������ ���Ͻÿ�
SELECT CUSTID, COUNT(*) FROM ORDERS WHERE SALEPRICE >=8000
GROUP BY CUSTID;

-- ������ 8000�� �̻��� ������ ������ ���� ���ؿ� ���� �ֹ� ������ �� ������ ���Ͻÿ�
-- �� �α� �̻� ������ ���� ���Ѵ�.
SELECT CUSTID, COUNT(*) FROM ORDERS WHERE SALEPRICE >=8000
GROUP BY CUSTID HAVING COUNT(*)>=2;

-- orders ���̺��� �������� �� ���ž�(�������� ����ȣ�� 1������ ���� �ۼ�)
SELECT SUM(SALEPRICE) FROM ORDERS WHERE CUSTID=1;
-- �������� ������ ������ ��(�������� ����ȣ�� 1������ ���� �ۼ�)
SELECT COUNT(*) AS ������ FROM ORDERS WHERE CUSTID IN (SELECT CUSTID FROM CUSTOMER WHERE NAME = '������');
-- BOOK ���̺����� ���ǻ��� �� ����(�ߺ�����)
SELECT COUNT(DISTINCT publisher) AS ���� FROM BOOK;

-- ����(JOIN) �˻�: 2�� �̻��� ���̺��� �����Ͽ� �����͸� �˻��ϴ� ��
-- �Ϲ������� �ܷ�Ű�� �̿��ؼ� ���� �Ѵ�.
-- �����Ϸ��� ���̺��� �Ӽ��� �̸��� �޶� ������ ������(������Ÿ��=ũ��)�� ���ƾ� �Ѵ�.
-- FROM ������ �˻��� �ʿ��� ��� ���̺��� ����
-- WHERE ���� ���� �Ӽ��� ���� ���ƾ� ���� �ǹ��ϴ� ���������� ����
-- ��Ī�� �̿��� SQL�� �ۼ��ϴ� ���� ����.
-- ��������(INNER JOIN)
-- SELECT A���̺��.�÷���, A���̺��.�÷���, B���̺��.�÷���, B���̺��.�÷���
-- FROM A���̺��, B���̺��
-- WHERE A���̺�.Į���� = B���̺�.Į���� -> �߿�) �� �� �÷��� �ܷ�Ű�� �⺻�̴�.
-- �߿�) �� ���̺��� ��� ���� �÷��� ������ ������ ���

-- BANANA ���� �ֹ��� ��ǰ�� �̸��� �˻��� ����.
SELECT * FROM ��ǰ, �ֹ� WHERE ��ǰ.��ǰ��ȣ = �ֹ�.�ֹ���ǰ and �ֹ�.�ֹ��� = 'banana';
SELECT P.��ǰ�� FROM ��ǰ P INNER JOIN �ֹ� O ON P.��ǰ��ȣ = O.�ֹ���ǰ
WHERE O.�ֹ��� = 'banana';
-------------------------------------------------------------

-- ���̰� 30���̻��� ���� �ֹ��� ��ǰ�� ��ȣ�� �ֹ�����, ���̸��� �˻�����
SELECT ��.���̸�, �ֹ�.�ֹ���ǰ, �ֹ�.�ֹ�����
FROM ��, �ֹ� WHERE ��.�����̵� = �ֹ�.�ֹ��� AND ��.����>=30;

-- ���̰� 30���̻��� ���� �ֹ��� ��ǰ�� ��ȣ�� �ֹ�����, ���̸�, ��ǰ���� �˻�����
SELECT c.���̸�, c.����, o.�ֹ���ǰ, p.��ǰ��, o.�ֹ�����
FROM �� c, �ֹ� o, ��ǰ p where c.�����̵� = o.�ֹ��� AND o.�ֹ���ǰ = P.��ǰ��ȣ AND c.���� >= 30;

-- ��� ���� �ֹ��� ��ǰ�� ��ǰ���� �˻�����
SELECT C.���̸�, P.��ǰ�� FROM �� C, �ֹ� O, ��ǰ P WHERE C.�����̵� = O.�ֹ��� AND O.�ֹ���ǰ = P.��ǰ��ȣ AND C.���̸� = '���';

-- ���� �̸��� ���� �ֹ��� ������ �ǸŰ����� �˻��Ͻÿ�. ����
SELECT C.NAME, B.BOOKNAME, B.PRICE FROM CUSTOMER C, BOOK B, ORDERS O WHERE C.CUSTID = O.CUSTID AND O.BOOKID = B.BOOKID; 

-- ��ID�� �ֹ��� ��� ������ �� �Ǹž��� ���ϱ�
SELECT C.NAME , SUM(O.SALEPRICE) FROM CUSTOMER C, BOOK B, ORDERS O WHERE C.CUSTID = O.CUSTID AND O.BOOKID = B.BOOKID GROUP BY C.NAME;

-- ��ID�� �ֹ��� ��� ������ �� �Ǹž��� ���ϰ�, ���̸����� �����Ͻÿ�.
SELECT C.NAME, SUM(O.SALEPRICE) FROM CUSTOMER C, BOOK B, ORDERS O WHERE C.CUSTID = O.CUSTID AND O.BOOKID = B.BOOKID GROUP BY C.NAME ORDER BY C.NAME ASC;

-- ���� �̸��� ���� �ֹ��� ������ �̸�, �ֹ� ��¥�� ���Ͻÿ�.
SELECT C.NAME, B.BOOKNAME, O.ORDERDATE FROM CUSTOMER C, BOOK B, ORDERS O WHERE C.CUSTID = O.CUSTID AND O.BOOKID = B.BOOKID;

-- ������ 20000�� �̻��� ������ �ֹ��� ���� �̸��� ������ �̸��� ���Ͻÿ�.
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

insert into BBB values(1,'��');
insert into BBB values(2,'��');
insert into BBB values(4,'��');
insert into BBB values(5,'��');
commit;

-- LEFT JOIN: ���� ���̺� �ִ°� ���ο� �ߺ��Ǵ� �κ�(������ NULL)
-- SELECT �÷���,...,�÷��� FROM ���̺�1 LEFT JOIN ���̺�2 ON �������� [WHERE �˻�����];
SELECT AAA.ENAME, BBB.KNAME FROM AAA LEFT JOIN BBB ON AAA.ID = BBB.ID;

-- RIGHT JOIN: ������ ���̺� �ִ°� ���ο� �ߺ��Ǵ� �κ�(������ NULL)
-- ���̺� ��ġ�� �ٲٸ� �װ� LEFT JOIN�̶� �Ȱ���
-- SELECT �÷���,...,�÷��� FROM ���̺�1 LEFT JOIN ���̺�2 ON �������� [WHERE �˻�����];
SELECT AAA.ENAME, BBB.KNAME FROM AAA RIGHT JOIN BBB ON AAA.ID = BBB.ID;

-- �����̺��� �������� ���̸�, �ֹ���ǰ, �ֹ����ڸ� �˻�����.
SELECT C.���̸�, O.�ֹ���ǰ, O.�ֹ����� FROM �� C LEFT JOIN �ֹ� O ON C.�����̵� = O.�ֹ��� ORDER BY C.���̸�;

-- ������ �������� ���� ���� �����Ͽ� ���� �̸��� ���� �ֹ��� ������ �ǸŰ����� ���Ͻÿ�.
SELECT C.NAME, O.SALEPRICE FROM CUSTOMER C LEFT JOIN ORDERS O ON C.CUSTID = O.CUSTID;

select * from customer ;