-- ���۾�(DML): ����(INSERT ~ INTO), ����(DELETE FROM), ����(UPDATE ~ SET), �˻�(SELECT ~FROM)
-- �����(DCL): GRANT, REVOKE, COMMIT, ROLLBACK
-- COMMIT: ���� ���¸� DB�� ����(����)
-- ROLLBACK: COMMIT �������·� �ǵ�����.
-- COMMIT - �۾�1 - �۾�2 - �۾�3 - COMMIT - �۾�4 - �۾�5 -COMMIT - ROLLBACK(�۾�4, �۾�5 �������·� �ǵ�����.)

-- ������ ����(INSERT INTO ~ VALUES ~ )
-- ���1) INSERT INTO ���̺��̸� VALUES (��1,��2,��3...��4);
-- ���� ������� ��� ä���� �Ѵ�.
-- ��� ä���� ������ �����̴�.
-- ���� �ֱ� ������ NULL�� ���� �� �ִ�.
-- ��, �Ӽ� NOT NULL�̸� ���� ������ �־�� �Ѵ�.
-- ��¥�� ���ڴ� �ݵ�� '' ���
-- SYSDATE�� ���� ��¥�� ���ϴ� ����Ŭ ��ɾ��̴�.
INSERT INTO MEMBER01 
VALUES(1, 'KIM', 'K111', '�赹��', 24, SYSDATE, 02, '����');

--INSERT INTO MEMBER01 
--VALUES(1, 'KIM', 'K111', '�赹��');

INSERT INTO MEMBER01 
VALUES(2, 'KIM', 'K111', '�赹��', 24, SYSDATE, NULL, NULL);

INSERT INTO MEMBER01
VALUES(3, 'KIM', 'K111', '�赹��', 24, '2023/01/22', 02, '����');

-- ���2) INSERT INTO ���Ϻ��(�÷���1, �÷���2,...)
-- VALUES (�÷���1�� ��, �÷���2�� ��,...)
-- �÷���� �� ���� �ݵ�� 1:1 ��Ī
-- �Ӽ��� NOT NULL�� ��� �ݵ�� �־�� �ȴ�.
INSERT INTO MEMBER01(ID)
VALUES(7);

SELECT * FROM MEMBER01;
--------------------------------------
INSERT INTO �� VALUES ('apple', '����ȭ', 20, 'GOLD', '�л�', 1000);
INSERT INTO �� VALUES ('BANANA', '�輱��', 25, 'VIP', '��ȣ��', 2500);
INSERT INTO �� VALUES ('CARROT', '���', 28, 'GOLD', '����', 4500);
INSERT INTO �� VALUES ('ORANGE', '����', 22, 'SILVER', '�л�', 0);
INSERT INTO �� VALUES ('MELON', '������', 22, 'GOLD', 'ȸ���', 500);
INSERT INTO �� VALUES ('PEAR', 'ä����', 31, 'SLIVER', 'ȸ���', 500);

COMMIT;

INSERT INTO �����̺� VALUES ('123', '', 311, 'SLIVER1', '1ȸ���', 5100);
SELECT * FROM �����̺�;

CREATE TABLE ��ǰ(
    ��ǰ��ȣ VARCHAR2(50) NOT NULL,
    ��ǰ�� VARCHAR2(50),
    ��� NUMBER,
    �ܰ� NUMBER, 
    ������ü VARCHAR2(50),
    PRIMARY KEY(��ǰ��ȣ)
);

CREATE TABLE �ֹ�(
    �ֹ���ȣ VARCHAR2(50) NOT NULL,
    �ֹ��� VARCHAR2(50),
    �ֹ���ǰ VARCHAR2(50) NOT NULL,
    ���� NUMBER,
    ����� VARCHAR2(50),
    �ֹ����� DATE,
    PRIMARY KEY(�ֹ���ȣ)
    --FOREIGN KEY(�ֹ���ǰ) REFERENCES ��ǰ(��ǰ��ȣ) -- �� �ּ� ���ַ��� ���� , �����
);

INSERT INTO ��ǰ VALUES ('p01', '�׳ɸ���', 5000, 4500, '���ѽ�ǰ');
INSERT INTO ��ǰ VALUES ('p02', '�ſ��̸�', 2500, 5500, '�α�Ǫ��');
INSERT INTO ��ǰ VALUES ('p03', '��������', 3600, 2600, '�Ѻ�����');
INSERT INTO ��ǰ VALUES ('p04', '�������ݸ�', 1250, 2500, '�Ѻ�����');
INSERT INTO ��ǰ VALUES ('p05', '��ū���', 2200, 1200, '���ѽ�ǰ');
INSERT INTO ��ǰ VALUES ('p06', '����쵿', 1000, 1550, '�α�Ǫ��');
INSERT INTO ��ǰ VALUES ('p07', '���޺�Ŷ', 1650, 1500, '�Ѻ�����');

INSERT INTO �ֹ� VALUES('o01', 'apple', 'p03', 10, '����� ������', '2022-01-01');
INSERT INTO �ֹ� VALUES('o02', 'melon', 'p01', 5, '��õ�� ��籸', '2022-01-10');
INSERT INTO �ֹ� VALUES('o03', 'banana', 'p06', 45, '��⵵ ��õ��', '2022-01-11');
INSERT INTO �ֹ� VALUES('o04', 'carrot', 'p02', 8, '��õ�� ������', '2022-02-01');
INSERT INTO �ֹ� VALUES('o05', 'melon', 'p06', 36, '��⵵ ���ν�', '2022-02-20');
INSERT INTO �ֹ� VALUES('o06', 'banana', 'p01', 19, '��û�ϵ� ������', '2022-03-02');
INSERT INTO �ֹ� VALUES('o07', 'apple', 'p03', 22, '����� ��������', '2022-03-15');
INSERT INTO �ֹ� VALUES('o08', 'pear', 'p02', 50, '������ ��õ��', '2022-04-10');
INSERT INTO �ֹ� VALUES('o09', 'banana', 'p02', 15, '���󳲵� ������', '2022-04-11');
INSERT INTO �ֹ� VALUES('o10', 'carrot', 'p03', 20, ' ��⵵ �Ⱦ��', '2022-05-22');

COMMIT;

-- ����, ������ �ݵ�� ���ǽ��� �־�� �Ѵ�.
-- ���ǽ��� ���� ������ ��ü�� �����ǰų� ��ü�� ���� �ȴ�.
-- ������ ����(DELETE FROM ���̺��̸� [WHERE ���ǽ�]);
-- ���ǽ��� ������ ���ǽ��� ���� �͸� ����ȴ�.
-- ���ǽ��� ������ ��ü�� �����ȴ�.
-- ���ǽ�( �÷��� �񱳿�����)
DELETE FROM �����̺�;
SELECT * FROM �����̺�;

-- ������ü�� '�Ѻ�����'�� �ุ ����
DELETE FROM ��ǰ WHERE ������ü = '�Ѻ�����';
-- ������ü�� '�α�Ǫ��'�̸鼭 �ܰ� 3000������ �ุ ����
DELETE FROM ��ǰ WHERE ������ü = '�α�Ǫ��' AND �ܰ� <= 3000;
SELECT * FROM ��ǰ;
ROLLBACK;

-- ������ ����(UPDATE ���̺��̸� SET ���泻�� [WHERE ���ǽ�]);
-- ���ǽ��� ������ ���ǽ��� ���� �͸� ����ȴ�.
-- ���ǽ��� ������ ��ü�� �����ȴ�.

-- ������ü�� ����Ǫ��� ����
UPDATE ��ǰ SET ������ü = '����Ǫ��';
-- �ܰ��� 2000�̻��� �ุ ������ü�� �Ѻ������� ����
UPDATE ��ǰ SET ������ü = '�Ѻ�����' WHERE �ܰ� >= 2000;
-- ��ǰ��ȣ�� p01 OR p05 �ุ ����� 1000, ������ü�� ���ѽ�ǰ���� ����
UPDATE ��ǰ SET  ������ü = '���ѽ�ǰ', ��� = 1000 WHERE ��ǰ��ȣ = 'p01' OR ��ǰ��ȣ = 'p05';
ROLLBACK;

-- ��ǰ ���̺��� ��ǰ��ȣ�� p03�� ��ǰ�� ��ǰ���� ��ū���̷� ��������
UPDATE ��ǰ SET ��ǰ�� = '��ū����' WHERE ��ǰ��ȣ = 'p02';
-- ��ǰ ���̺� �ִ� ��� ��ǰ�� �ܰ��� 10% �λ��غ���
UPDATE ��ǰ SET �ܰ� = �ܰ�*1.1;
-- �ֹ� ���̺��� �ֹ����ڰ� 2022-05-22�� �ֹ������� ��������
DELETE FROM �ֹ� WHERE �ֹ����� = '2022-05-22';
-- �ֹ� ���̺��� �ֹ����ڰ� 2022-03~2022-04�� �ֹ������� ��������
DELETE FROM �ֹ� WHERE �ֹ����� >= '2022-03-01' AND �ֹ����� <= '2022-04-30';

-- �ֹ� ���̺� �ֹ����ڸ� ��� 5�� �߰�����
UPDATE �ֹ� SET �ֹ����� = �ֹ����� + '5';
-- �ֹ� ���̺��� ����ȭ ���� �ֹ��� ��ǰ�� �ֹ� ������ 5���� �����غ���
UPDATE �ֹ� SET ���� = 5 WHERE �ֹ�.�ֹ��� 
IN(SELECT ��.�����̵� FROM �� WHERE ��.���̸� = '����ȭ');

SELECT * FROM �ֹ�;
SELECT * FROM ��;
COMMIT;
