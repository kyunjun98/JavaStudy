-- ���̺� ����
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
    
-- ���̺� ����
DROP TABLE MEMBER01;
DROP TABLE MEMBER03;

INSERT INTO MEMBER01 VALUES(3, '�̱浿', '1111', 'ȫ�浿', 30, SYSDATE);
COMMIT; -- Ŀ���� �ؾ��� �����ͺ��̽��� ������ �� ���� ������ ����
SELECT * FROM MEMBER01;

-- ���̺� ����(MEMBER01 ���̺��� ������ ���� �����ؼ� C_MEM01 ���̺� ����) - �� KEY�� ���簡 �ȵ�`
CREATE TABLE C_MEM01 AS SELECT * FROM MEMBER01;
-- ���̺� ����(MEMBER01 ���̺��� ������ �����ؼ� C_MEM02 ���̺� ����)
CREATE TABLE C_MEM02 AS SELECT * FROM MEMBER01 WHERE 1 = 2;

-- �� ���̺�(�����̵�(pk)), ���̸�, ����, ���, ����, ������)
CREATE TABLE ��(
    �����̵� VARCHAR2(50) NOT NULL PRIMARY KEY,
    ���̸� VARCHAR2(50),
    ���� NUMBER(3),
    ��� VARCHAR2(50),
    ���� VARCHAR2(50),
    ������ NUMBER
);

-- book ���̺� �����
-- ������ȣ(bookid, pk), �����̸�(bookname, 99), ���ǻ�(publisher, 50), ����(price, 7)
CREATE TABLE BOOK (
    bookid NUMBER NOT NULL PRIMARY KEY,
    bookname VARCHAR2(99),
    publisher VARCHAR2(50),
    price NUMBER(7)
);

-- ��������
-- NOT NULL: ���� ������� ����
-- DEFAULT: �⺻���� �����ϴ� Ű����
-- ������ NUMBER DEFAULT 0 -> ���� �Է��� �� �Է����� ������ 0���� ä������.
-- CHECK: ���̺� ��Ȯ�ϰ� ��ȿ�� �����͸� �����ϱ� ���� Ư�� �Ӽ��� ���� ���������� ����
-- AGE NUMBER CHECK >= 19 -> AGE�� 19�̻��� ���ڸ� �޴´�
-- ��� NUMBER CHECK(��� >= 0 AND ��� <= 1000) -> ����� 0~1000���� ���ڸ� �޴´�
    
--���̺� ���� ����: ALTER
-- �÷� �߰�(ADD): ALTER TABLE ���̺��̸� ADD �÷��� �ڷ���(ũ��) [��������]
ALTER TABLE MEMBER01 ADD M_ADDR1 VARCHAR2(100);
COMMIT;
-- MEMBER01 ���̺� �ּҸ� ����(M_ADDR VARCHAR2(100) DEFAULT '����';
ALTER TABLE MEMBER01 ADD M_ADDR2 VARCHAR2(100) DEFAULT '����';
COMMIT;
SELECT * FROM MEMBER01;

-- �÷� ����(DROP): ALTER TABLE ���̺��̸� DROP COLUMN �÷���;
ALTER TABLE MEMBER01 DROP COLUMN M_ADDR1;
COMMIT;
-- ADDR2�� �����Ͱ� �־����� ������ �����ؾ���...
ALTER TABLE MEMBER01 DROP COLUMN M_ADDR2;
COMMIT;

-- �÷� ����(MODIFY):  ALTER TABLE ���̺��̸� MODIFY �÷��� �ڷ���(ũ��) [��������]
-- �����Ͱ� ���� ���: �÷��� �ڷ����� ũ�⸦ ������� ������ �� �ִ�.

-- M_ADDR1�� �����Ͱ� �����Ƿ� ���� �ڷ����� ũ�� ������� ����
ALTER TABLE MEMBER01 MODIFY M_ADDR1 VARCHAR2(50);
COMMIT;
-- M_ADDR1�� �����Ͱ� �����Ƿ� �ڷ����� ���� �� �� �ִ�.
ALTER TABLE MEMBER01 MODIFY M_ADDR1 NUMBER(7);
COMMIT;

-- �����Ͱ� �ִ� ��� ���� �ڷ����� ũ�� ������ ����(��, ������ �ִ� �������� ũ�⺸�ٴ� Ŀ�� �ȴ�.)
ALTER TABLE MEMBER01 MODIFY M_ADDR2 VARCHAR2(50);

-- �����Ͱ� �ִµ� �ٸ� �ڷ������� ���� �� ��(����õ)
-- ���ڸ� ���ڷ� ������ ��(�ȵ�)
ALTER TABLE MEMBER01 MODIFY M_ADDR2 NUMBER;
-- ���ڸ� ���ڷ� ������ ��(�ȵ�)
ALTER TABLE MEMBER01 MODIFY M_AGE VARCHAR(40);