DROP TABLE 유저;
CREATE TABLE 유저(
    아이디 VARCHAR(15) NOT NULL PRIMARY KEY,
    비밀번호 VARCHAR2(20),
    이메일 VARCHAR2(30),
    전화번호1 NUMBER,
    전화번호2 NUMBER,
    전화번호3 NUMBER,
    성별 VARCHAR2(6)
);
insert into 유저 values('dsd','sad','asdasd',010,5128,3539,'남자');
insert into 유저 values('d2sd','sad','asdasd',010,5128,3539,'남자');
insert into 유저 values('ds3d','sad','asdasd',010,5128,3539,'남자');
insert into 유저 values('d4sd','sad','asdasd',010,5128,3539,'남자');

SELECT * FROM 유저;
COMMIT;
update customer set address='대한민국 제주도', phone = '000-9000-0001' where name ='박세리'