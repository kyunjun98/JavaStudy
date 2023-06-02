-- ������: �ڵ����� ���� ���ڰ��� ������ �ִ� ������ �Ѵ�.
--        ���� �⺻Ű������ ���ȴ�.
-- ����: MYSQL�̳� MariaDB������ auto_increment�� �����Ѵ�.

-- �������:
-- CREATE SEQUENCE �̸�(���̺��̸�_SEQ)
-- INCREMENT BY ��������(������ 1)
-- START WITH �ʱ����(������ 1)
-- NOCYCLE;
-- NOCYCLE => ��ȣ�� ������ �� �� �ٽ� �ʱ���ڷ� ���ƿ��� ����

-- �����: INSERT �� �� �������̸�.NEXTVAL�� ����ϸ� �ڵ����� ���� �� �� ��ȣ�� ���� �ȴ�.
SELECT * FROM CUSTOMER;
DELETE FROM CUSTOMER;
COMMIT;

CREATE SEQUENCE CUSTOMER_SEQ 
INCREMENT BY 1
START WITH 1
NOCYCLE;

INSERT INTO CUSTOMER(CUSTID, NAME, ADDRESS, PHONE) VALUES(CUSTOMER_SEQ.NEXTVAL, '������', '����', '010-0000-0123');
INSERT INTO CUSTOMER(CUSTID, NAME, ADDRESS, PHONE) VALUES(CUSTOMER_SEQ.NEXTVAL, '�迬��', '����', '010-0000-0123');
INSERT INTO CUSTOMER(CUSTID, NAME, ADDRESS, PHONE) VALUES(CUSTOMER_SEQ.NEXTVAL, '��̶�', '������', '010-0000-0123');
INSERT INTO CUSTOMER(CUSTID, NAME, ADDRESS, PHONE) VALUES(CUSTOMER_SEQ.NEXTVAL, '�߽ż�', '�̱�', '010-0000-0123');
INSERT INTO CUSTOMER(CUSTID, NAME, ADDRESS, PHONE) VALUES(CUSTOMER_SEQ.NEXTVAL, '�ڼ���', '����', '010-0000-0123');
COMMIT;

SELECT * FROM CUSTOMER ORDER BY CUSTID;
--------------------------------------------------------------------------------
-- ��(VIEW): �ٸ� ���̺��� ������� ������� ���� ���̺�
--              �����͸� ������ �������� �ʰ� �������θ� �����ϴ� ���̺��̴�.
--              �Ϲ� ����ڴ� �並 ���� �� ����.
--              ������ �޾ƾ� �Ѵ�. (System�������� GRANT CREATE VIEW TO �Ϲݰ���)
--              ��� ����, ����, ������ ������ �ƴ϶� �˻�(SELECT)�� �����̴�.
--              ���� ���̺��� �ϳ��� ���ļ� �ϳ��� ��� ���� ���� �ְ�
--              �ϳ��� ���̺��� �������� �並 ���� ���� �ִ�.
--              ���� �̸��� �䰡 �����ϸ� ���� �߻�

-- ����� ���:
--       ���� �̸��� �䰡 ������ �������� �ʴ´�
-- ���1) CREATE VIEW ���̸�
--        AS SELECT��;
--       ���� �̸��� �䰡 ������ ���� �並 �����ϰ� ���� �����Ѵ�.
-- ���2) CREATE OR REPLACE VIEW ���̸�
--        AS SELECT��;

-- banana ���� �ֹ��� ��ǰ�� �̸��� �˻��� ����.
SELECT P.��ǰ�� FROM ��ǰ P, �ֹ� O WHERE P.��ǰ��ȣ = O.�ֹ���ǰ AND O.�ֹ��� = 'banana';

-- �� ������ ��� ����� ����
CREATE VIEW banana_select AS SELECT P.��ǰ�� FROM ��ǰ P, �ֹ� O WHERE P.��ǰ��ȣ = O.�ֹ���ǰ AND O.�ֹ��� = 'banana';
SELECT * FROM banana_select;

-- ���� �̸��� ���� �ֹ��� ������ �̸��� ���Ͻÿ�.
CREATE VIEW V_BOOK 
AS SELECT C.NAME, B.BOOKNAME, B.PRICE FROM CUSTOMER C, ORDERS O, BOOK B
WHERE C.CUSTID = O.CUSTID AND O.BOOKID = B.BOOKID;

SELECT * FROM V_BOOK;

-- �̻�̵��� ������ ������ ������ ���� �̸��� ���̽ÿ�
    -- SUBQUERY
CREATE VIEW �̻�̵��_��
AS SELECT NAME FROM CUSTOMER WHERE CUSTID IN (SELECT CUSTID FROM ORDERS WHERE BOOKID IN(SELECT BOOKID FROM BOOK WHERE PUBLISHER = '�̻�̵��'));

SELECT * FROM �̻�̵��_��;
--------------------------------------------------------------------------------
-- ����Ŭ ���� �Լ�: ����Ŭ ��ü���� ������ �ִ� �Լ�
-- DUAL: ��°���� ���� ���� ����Ŭ���� �����ϴ� ���� ���̺�
-- 1. ���ڰ��� ���� �Լ���
--  1) ���밪: ABS(����)
SELECT ABS(-75), ABS(+75), ABS(3.157), ABS(-3.157) FROM DUAL;
-- 2. �ø�: CEIL(����), �Ҽ��� �������� �ø�
SELECT CEIL(-75.41), CEIL(75.41), CEIL(75.61), CEIL(-75.61) FROM DUAL;
-- 3. ����: FLOOR(����), �Ҽ��� �������� ����
SELECT FLOOR(-75.41), FLOOR(75.41), FLOOR(75.61), FLOOR(-75.61) FROM DUAL;
-- 4. ����: TRUNC(����), TRUNC(����, �ڸ���), �Ҽ����� �ڸ�����ġ���� ����
SELECT TRUNC(-75.41), TRUNC(75.41), TRUNC(75.61), TRUNC(-75.61) FROM DUAL;
SELECT TRUNC(-75.41, 0), TRUNC(75.41, 0), TRUNC(75.61, 0), TRUNC(-75.61, 0) FROM DUAL;
SELECT TRUNC(-75.41, 1), TRUNC(75.41, 1), TRUNC(75.61, 1), TRUNC(-75.61, 1) FROM DUAL;
SELECT TRUNC(-75.41, -1), TRUNC(75.41, -1), TRUNC(75.61, -1), TRUNC(-75.61, -1) FROM DUAL;
-- 5. �ݿø�: ROUND(����), ROUND(����, �ڸ���), �ڸ��� ���ϸ� �ø�
SELECT ROUND(-13.4441), ROUND(13.4441), ROUND(-13.5541), ROUND(13.5541) FROM DUAL;