-- PL/SQL: ����Ŭ���� �����ϴ� ���α׷��� ����� Ư���� ������ SQL�� Ȯ��
--         SQL�� ������ + ���(IF, LOOP, FOR)�� ���
--         ������ ���α׷��� �����ϰ� �ϴ� ����Ŭ SQL ������
-- ����: https://www.tutorialspoint.com/plsql/index.htm

-- 1.���ν���: RETURN ���� ������� �ʴ� �Լ��� ����(�޼ҵ�)
--           �۾������� ������ ������ ���α׷��� ���� ����
--           ����� ������ �ǵ��� ������ OUT ���� ����ؾ� �Ѵ�.
-- �⺻����: [������], ������, [������]
--  1.������: DECLARE
--           ��������;
--  2.������: BEGIN ~ 
--           SQL �����
--           END;
--  3.������: EXCEPTION
-- Hello, World! ����ϱ�
--              �ڹ�                               ����Ŭ
-- String msg = "Hello, World!"; => msg varchar2(20) := 'Hello, World!';
-- System.out.println(msg);      => dbms_output.put_line(msg);
-- ��, dbms_output.put_line() ����ϱ� ���ؼ��� set serveroutput on;

-- A) �͸� ���ν���: ��ȸ��, ������� �ʴ´�.
SET SERVEROUTPUT ON;
DECLARE
msg VARCHAR2(20) := 'Hello, World!';
BEGIN
dbms_output.put_line(msg);
END;

-- �͸� ���ν����� Ȱ���� ��� ����
-- 1) IF ���ǽ� THEN
--      ���ǽ��� ���� �� ������ ����;
--    END IF;
-- ���� i�� 10�̸� ������ ���� �������
DECLARE
i NUMBER := 10;
BEGIN
IF (i=10) THEN 
dbms_output.put_line('i�� ' || i || '�Դϴ�');
END IF;
END;

-- 2) IF ���ǽ� THEN
--      ���ǽ��� ���� �� ������ ����;
--      ELSE
--      ���ǽ��� ������ �� ������ ����;
--   END IF;
-- ���� i Ȧ¦ �Ǻ��ϴ� �͸� ���ν���
DECLARE
i NUMBER := 57;
res VARCHAR2(30);
BEGIN
IF (MOD(i,2) = 0) THEN
res := '¦��';
ELSE
res := 'Ȧ��';
END IF;
dbms_output.put_line(res);
END;

-- 3) IF ���ǽ� THEN
--      1��° ���ǽ��� ���� �� ������ ����;
--    ELSIF ���ǽ� THEN
--      2��° ���ǽ��� ���� �� ���� �� ����;
--    ELSIF ���ǽ� THEN
--      3��° ���ǽ��� ���� �� ���� �� ����;
--    [ELSE ���๮;]
--    END IF;
DECLARE
i NUMBER := 80;
hak VARCHAR2(5);
BEGIN
IF (i>=90) THEN
hak := 'A';
ELSIF (i>=80) THEN
hak := 'B';
ELSIF (i>=70) THEN
hak := 'C';
END IF;
dbms_output.put_line(hak);
END;

--------------------------------------------------------------------------------

-- �ݺ���: FOR��, WHILE��, LOOP��
-- 1) FOR��
--  FOR ���� IN �ʱⰪ .. ������ LOOP
--      �ݺ������� ����;
--  END LOOP;
-- 1~10���� ����ϴ� ���ν���
DECLARE
i NUMBER;
BEGIN
FOR i IN 1 .. 10 LOOP
    dbms_output.put_line(i);
END LOOP;
END;

DECLARE
BEGIN
FOR i NUMBER IN 1 .. 10 LOOP
    dbms_output.put_line(i);
END LOOP;
END;

-- 1~10���� ¦���� ���
DECLARE
BEGIN
FOR i NUMBER IN 1 .. 10 LOOP
IF MOD(i,2) = 0 THEN 
dbms_output.put_line(i);
END IF;
END LOOP;
END;

-- 1~10���� ¦���� �� ���
DECLARE
A NUMBER := 0;
i NUMBER ;
BEGIN
FOR i IN 1 .. 10 LOOP
IF (MOD(i,2) = 0) THEN
A := A + i;
END IF;
END LOOP;
dbms_output.put_line(A);
END;

-- 2) WHILE ��
-- DECLARE
-- ����(�ʱ��)
-- BEGIN
-- WHILE ���ǽ� LOOP
--      ������ ����;
--      ������;
-- END LOOP;
-- END;
-- 1~10���� ���
DECLARE
A NUMBER := 1;
BEGIN
WHILE A<=10 LOOP
dbms_output.put_line(A);
A := A + 1;
END LOOP;
END;

-- 1~10���� ¦���� ���
DECLARE
A NUMBER := 1;
BEGIN
WHILE A<=10 LOOP
IF (MOD(A,2)=0) THEN
dbms_output.put_line(A);
END IF;
A := A + 1;
END LOOP;
END;

DECLARE
A NUMBER := 1;
B NUMBER := 0;
BEGIN
WHILE A<=10 LOOP
IF (MOD(A,2)=0) THEN
B := B + A;
END IF;
A := A + 1;
END LOOP;
dbms_output.put_line(B);
END;

-- 3-1) LOOP
--DECLARE
-- ������(�ʱ��)
-- BEGIN
--  LOOP
--      ������ ����;
--      ������;
--      IF (�������� ���ǽ�) THEN
--      EXIT;
--      END IF;
--  END LOOP;
-- END;
DECLARE
i NUMBER := 1;
BEGIN
LOOP
dbms_output.put_line(i);
IF (i=10) THEN
EXIT;
END IF;
i := i + 1;
END LOOP;
END;

-- 3-2) LOOP
--DECLARE
-- ������(�ʱ��)
-- BEGIN
--  LOOP
--      ������ ����;
--      EXIT WHEN ���ǽ�; -���������� ���ǽ�
--      ������;
--  END LOOP;
-- END;

DECLARE
i NUMBER := 1;
BEGIN
LOOP
dbms_output.put_line(i);
EXIT WHEN i=10;
i := i + 1;
END LOOP;
END;

-- B) ���� ���ν���
-- ����) CREATE [OR REPLACE] PROCEDURE �̸� AS
--       BEGIN
--          ����;(UPDATE, INSERT, DELETE�� �Ϲ� SQL�� ������ SELECT�� �ٸ���.
--       END;
-- CUSTOMER���̺��� CUSTID�� 2�� �ڷ��� �̸��� '�Ѹ�'�� ����
-- 1.���ν��� ����
CREATE PROCEDURE ch_name AS
BEGIN
UPDATE CUSTOMER SET NAME = '�Ѹ�' WHERE CUSTID = '2';
END;
-- 2.���ν��� ����: EXEC ���ν����̸�;
EXEC ch_name;
SELECT * FROM CUSTOMER;

-- �ܺο��� CUSTID�� �̸��� �޾Ƽ� CUSTOMER���̺��� �����ϴ� ���������� ������
-- �ܺο��� ������ �޴´� => �Ű躯��, ���� => IN ��������
-- ������ �ܺη� ������ => RETURN        => OUT
-- ���࿡ Ư�����̺��� ������Ÿ���� �� ��: ���̺�.Į����%TYPE
CREATE PROCEDURE ch_name3(p_name IN customer.name%TYPE, p_custid IN customer.custid%TYPE) AS
BEGIN
UPDATE CUSTOMER SET NAME = p_name WHERE custid = p_custid;
END;

-- ����
EXEC CH_NAME3('�Ӳ���', 1);
EXEC CH_NAME3('������', 4);

-- CUSTOMER���̺� 6�� ����� ���ѹα� ��⵵ 000-1414-1414�� ������ �����ϴ� ���ν��� ����
CREATE PROCEDURE ins_customer AS
BEGIN
INSERT INTO CUSTOMER(custid, name, address, phone) VALUES (14, '�����', '���ѹα� ��⵵', '010-1111-2222');
END;
EXEC ins_customer;

-- CUSTOMER���̺� ��ȣ, �̸�, �ּ�, ��ȭ��ȣ�� �Է¹޾� �����ϴ� ���ν��� ����
CREATE PROCEDURE ins_customer2(p_custid IN customer.custid%TYPE, p_name IN customer.name%TYPE, p_address IN customer.address%TYPE, p_phone IN customer.phone%TYPE) AS
BEGIN
INSERT INTO CUSTOMER(custid, name, address, phone) VALUES (p_custid, p_name, p_address, P_phone);
END;
EXEC ins_customer2(14, '�ǿ���', '��õ', '010-5128-3539');

-- CUSTOMER���̺� ��ȣ�� �޾Ƽ� �����ϴ� ���ν��� ����
CREATE PROCEDURE del_customer(p_custid IN customer.custid%TYPE) AS
BEGIN
DELETE FROM CUSTOMER WHERE custid = p_custid;
END;
EXEC del_customer(14);

-- �߿�! BEGIN ~ ENG; ��Ͼȿ��� ���Ǵ� SELECT��
-- SELECT �÷�
-- INTO ���庯��(����� ����)
-- FROM ���̺��̸�
-- WHERE ���ǽ�
-- Ư¡: WHERE ���ǽ��� ����Ͽ� ������� �ϳ��� ������ ����
--      ���� ����� INTO ������ �ִ� ���庯���� ��������
DECLARE
  v_name customer.name%type;
  v_phone customer.phone%type;
BEGIN
    select name, phone into v_name, v_phone
    from customer
    where custid = 2;
    dbms_output.put_line('customer name : ' || v_name);
    dbms_output.put_line('customer phone : ' || v_phone);
END;

DECLARE
 v_customer customer%rowtype;
BEGIN
    select * into v_customer
    from customer
    where custid = 2;
    dbms_output.put_line('customer name : ' || v_customer.name);
    dbms_output.put_line('customer phone : ' || v_customer.phone);
    dbms_output.put_line('customer address : ' || v_customer.address);
    dbms_output.put_line('customer custid : ' || v_customer.custid);
END;

select * from customer ;

-- customer ���̺� �����͸� �Է��ؼ� ���� ������ ������ �������͸� ������ ������ ���� .
-- ( �⺻Ű�� �������� ������ �־�� �Ѵ�.)
 
 create PROCEDURE chk_customer(
   p_name in customer.name%type,
   p_address in customer.address%type, 
   p_phone in customer.phone%type
   )as
   cnt number ;
 BEGIN
   select count(*)
   into cnt
   from customer
   where name=p_name  and phone=p_phone  ;
   
   if(cnt = 0)then
      insert into customer(custid, name, address, phone)
      values(customer_seq.nextval, p_name, p_address, p_phone);
   else
      update customer set name =?, address=?, phone=?  where name=p_name  and phone=p_phone ;
   end if;   
 END;
 select * from customer;
exec chk_customer('�Ѹ�','���ֵ�','000-6000-0001');
exec chk_customer('�Ѹ�','�︪��','000-1004-0001');

-- out �� �̿��ؼ� ���ν��� ����� �������� 
--  book ���̺��� ����Ǿ� �ִ� ������ ��� ������ ��ȯ�ϴ� ���ν��� 
select * from book ;
select avg(price) from book ;

create procedure avg_price(avg_val out number)as
begin
    select avg(price)
    into avg_val
    from book
    where price is not null;
end;

-- exec �� ���� �ȵ�
-- exec avg_price();
-- �͸� ���ν����� ���� ��Ų��.
DECLARE
 a_val number;
BEGIN
  -- �̸�������� ���ν��� ȣ��
  avg_price(a_val);
  dbms_output.put_line('å ��ձݾ� : ' || trunc(a_val));
END;

--  bookid�� �Է¹޾Ƽ� å�̸�, ������ ����ϴ� ���ν��� (���1)
CREATE PROCEDURE book_test01(p_id book.bookid%TYPE, v_name OUT book.bookname%TYPE,
v_price OUT book.price%TYPE) AS
BEGIN
SELECT bookname, price
INTO v_name, v_price
FROM book
WHERE bookid = p_id;
END;

-- EXEC book_test01(3); ���ȵ�

-- �͸� ���ν���
SET SERVEROUTPUT ON;
DECLARE
k_book book.bookname%TYPE;
k_price book.price%TYPE;
BEGIN
--���ν����� ȣ��
book_test01(1, k_book, k_price);
dbms_output.put_line(k_book);
dbms_output.put_line(k_price);
END;

--  bookid�� �Է¹޾Ƽ� å�̸�, ������ ����ϴ� ���ν��� (���2)
CREATE PROCEDURE book_test2(v_id book.bookid%TYPE) AS
v_name book.bookname%TYPE;
v_price book.price%TYPE;
BEGIN
SELECT bookname, price
INTO v_name, v_price
FROM book
WHERE bookid = v_id;
dbms_output.put_line(k_name);
dbms_output.put_line(k_price);
END;
EXEC book_test2(15);