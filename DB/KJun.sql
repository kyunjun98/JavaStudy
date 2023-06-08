ALTER TABLE �� ADD PRIMARY KEY(�����̵�);

-- ������� ���̺��� ������ �ܷ�Ű�� ������
-- ALTER TABLE ���̺�� ADD CONSTRAINT FK�� FOREIGN KEY (�÷���)
-- REFERENCES PK�� ���� ���̺��

ALTER TABLE �ֹ� ADD CONSTRAINT FK_�ֹ��� FOREIGN KEY (�ֹ���)
REFERENCES ��(�����̵�);

ALTER TABLE �ֹ� ADD CONSTRAINT FK_�ֹ���ǰ FOREIGN KEY (�ֹ���ǰ)
REFERENCES ��ǰ(��ǰ��ȣ);

-- FK�� �����ϸ� ������� ���� / ���� �Ҽ� ����.
-- ���Ἲ ���� ���ǿ� ���� �ȴ� - �θ�Ű�� �����ϴ�.
INSERT INTO �ֹ� VALUES ('o11', 'banana2', 'p07', 15, '���ֵ�','2023-05-06');
INSERT INTO �ֹ� VALUES ('o12', 'melon', 'p07', 15, '���ֵ�','2023-05-06');

-- ORA-02292: ���Ἲ ��������(C##KJUN.FK_�ֹ���)�� ����Ǿ����ϴ�- �ڽ� ���ڵ尡 �߰ߵǾ����ϴ�
DELETE FROM �� WHERE �����̵� = 'apple';
DELETE FROM ��ǰ WHERE ��ǰ��ȣ = 'p03';

-- ��������: �ֹ����̺��� �������� �ʾ����Ƿ� ���� ����
DELETE FROM ��ǰ WHERE ��ǰ��ȣ = 'p05';

-- ���̺� �����ϸ� �ܷ�Ű �����
CREATE TABLE CLIENTINFO (
    NAME VARCHAR2(20),
    AGE NUMBER -- ���̴� 0 ���� ũ�� 150 ���ٴ� �۴� 
        CONSTRAINT CHECK_AGE CHECK(AGE > 0 AND AGE < 150),
    GENDER VARCHAR2(3) -- ������ ���ĺ� M �Ǵ� W�� �Է� �޴´�.
        CONSTRAINT CHECK_GENDER CHECK(GENDER IN('M', 'W')),
    INFONO NUMBER -- ������ȣ�� INFO ���̺��� �⺻Ű��.
        CONSTRAINT PK_INFONO PRIMARY KEY
);

INSERT INTO CLIENTINFO VALUES('ȫ�浿', 30, 'M', 1);
INSERT INTO CLIENTINFO VALUES('ȫ����', 20, 'W', 2);
INSERT INTO CLIENTINFO VALUES('�谭', 25, 'M', 3);
INSERT INTO CLIENTINFO VALUES('��ȫ��', 40, 'M', 4);
INSERT INTO CLIENTINFO VALUES('����', 44, 'M', 5);
INSERT INTO CLIENTINFO VALUES('�̳���', 42, 'W', 6);

INSERT INTO CLIENTINFO VALUES('1', 1231, 'W', 6);
INSERT INTO CLIENTINFO VALUES('2', 2313, 'W', 6);
INSERT INTO CLIENTINFO VALUES('3', 12312312, 'W', 6);

-- �ܷ�Ű�� ���� ���̺�
CREATE TABLE CLIENTJOIN(
    ID VARCHAR2(40) NOT NULL PRIMARY KEY,
    PW VARCHAR2(40),
    INFONO NUMBER CONSTRAINT FK_INFONO FOREIGN KEY(INFONO) REFERENCES CLINETINFO(INFONO)
    );
-- rownum: ����Ŭ ���ο��� �����ϴ� ���� �÷�, SQL ��ȸ ����� ������ ��Ÿ����.
SELECT ROWNUM, K.* FROM (SELECT * FROM ��) K WHERE ROWNUM BETWEEN 1 AND 3;

COMMIT;