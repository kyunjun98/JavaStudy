-- 1.��� ������ �̸��� ������ �˻��Ͻÿ�.
SELECT bookname, price FROM BOOK;

-- 2.��� ������ ���ݰ� �̸��� �˻��Ͻÿ�.
SELECT price, bookname FROM BOOK;

-- 3.��� ������ ������ȣ, �����̸�, ���ǻ�, ������ �˻��Ͻÿ�.
SELECT bookid, bookname, publisher, price FROM BOOK;

-- 4.���� ���̺� �ִ� ��� ���ǻ縦 �˻��Ͻÿ�.
SELECT publisher FROM BOOK;

-- 5.���� ���̺� �ִ� ��� ���ǻ縦 �˻��Ͻÿ�.(�ߺ�����)
SELECT DISTINCT publisher FROM BOOK;

-- 6.������ 10,000�� �̻� 20,000 ������ ������ �˻��Ͻÿ�.
SELECT * FROM BOOK WHERE price>=10000 AND price<=20000;

-- 7.���ǻ簡 ���½������� Ȥ�� �����ѹ̵��� ������ �˻��Ͻÿ�.
SELECT * FROM BOOK WHERE publisher='�½�����' OR publisher='���ѹ̵��';

-- 8.'�౸�� ���硯�� �Ⱓ�� ���ǻ縦 �˻��Ͻÿ�.
SELECT publisher FROM BOOK WHERE bookname='�౸�� ����';

-- 9.�����̸��� ���౸���� ���Ե� ���ǻ縦 �˻��Ͻÿ�.
SELECT publisher FROM BOOK WHERE bookname LIKE '%�౸%';

-- 10.�����̸��� ���� �� ��° ��ġ�� ��������� ���ڿ��� ���� ������ �˻��Ͻÿ�
SELECT bookname FROM BOOK WHERE bookname LIKE '_��%';

-- 11.�౸�� ���� ���� �� ������ 20,000�� �̻��� ������ �˻��Ͻÿ�.
SELECT bookname FROM BOOK WHERE bookname LIKE '%�౸%' AND price >= 20000;

-- 12.���ǻ簡 ���½������� Ȥ�� �����ѹ̵��� ������ �˻��Ͻÿ�
SELECT bookname FROM BOOK WHERE publisher IN ('�½�����', '���ѹ̵��');

-- 13.������ �̸������� �˻��Ͻÿ�.
SELECT * FROM BOOK ORDER BY bookname;

-- 14.������ ���ݼ����� �˻��ϰ�, ������ ������ �̸������� �˻��Ͻÿ�.
SELECT * FROM BOOK ORDER BY price, bookname;

-- 15.������ ������ ������������ �˻��Ͻÿ�. ���� ������ ���ٸ� ���ǻ��� ������������ �˻��Ѵ�.
SELECT * FROM BOOK ORDER BY price DESC, publisher;