DROP TABLE ����;
CREATE TABLE ����(
    ���̵� VARCHAR(15) NOT NULL PRIMARY KEY,
    ��й�ȣ VARCHAR2(20),
    �̸��� VARCHAR2(30),
    ��ȭ��ȣ1 NUMBER,
    ��ȭ��ȣ2 NUMBER,
    ��ȭ��ȣ3 NUMBER,
    ���� VARCHAR2(6)
);
insert into ���� values('dsd','sad','asdasd',010,5128,3539,'����');
insert into ���� values('d2sd','sad','asdasd',010,5128,3539,'����');
insert into ���� values('ds3d','sad','asdasd',010,5128,3539,'����');
insert into ���� values('d4sd','sad','asdasd',010,5128,3539,'����');

SELECT * FROM ����;
COMMIT;
update customer set address='���ѹα� ���ֵ�', phone = '000-9000-0001' where name ='�ڼ���'