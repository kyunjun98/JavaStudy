-- �����ͺ��̽� �˻�(SELECT ~ FROM): �ش� ���̺����� ���ϴ� ������ �˻��� �� ���
--  - ���� ���̺��� ������ ���� ���� �ʴ´�(COMMIT�� �� �ʿ� ����.)
--  - ����� ���̺����·� ���´�.(JAVA���� ResultSet)
--  - ��/�ҹ��� �������� �ʴ´�.(��, ���ǿ����� ��ҹ��ڸ� �����Ѵ�)
--  - ����, ��¥, ������ Ȧ����ǥ�� ����Ѵ�.
-- SELECT [ALL | DISTINCT] �÷���1, �÷���2, �÷���3 
-- FROM ���̺��� [WHERE ������];

-- Ư�� �÷��� �ƴ� ��� �÷��� �����Ҷ��� *�� ���
-- �������̺��� ��� ���� �˻�
SELECT * FROM ����;

-- �������̺����� �������̵�, �����̸�, ��� �Ӽ��� �˻�
SELECT �������̵�, �����̸�, ��� FROM ����;

-- �������̺����� ��޸� �˻�(�ߺ�����)
SELECT DISTINCT ��� FROM ����;

-- ��Ī: �Ӽ����� �ٲپ� ���(���� ������ �ȵȴ�)
--  �Ӽ��� AS ��Ī �Ǵ� �Ӽ�����Ī
-- ��ǰ ���̺����� ��ǰ���� �ܰ��� �˻��ϵ�, �ܰ��� �����̶�� �� �̸����� ����غ���
SELECT ��ǰ��, �ܰ� AS ���� FROM ��ǰ;

-- �Ӽ��� Ÿ���� ��¥�� NUMBER�̸� ��������� �����ϴ�.
-- ��ǰ ���̺����� ��ǰ��, �ܰ�, �ܰ�+500�� ���������̶�� �÷������� �˻�����.
SELECT ��ǰ��, �ܰ�, �ܰ�+500 AS �������� FROM ��ǰ;

-- �ֹ� ���̺��� �ֹ����ڿ� �ֹ�����+5 AS �������ڶ�� �÷������� �˻�����
SELECT �ֹ�����, �ֹ�����+5 AS �������� FROM �ֹ�;

-- [WHERE ����]: ������ �����ϴ� �����͸� �˻�(�÷��� ������)
--  1. �񱳿���(=(����), <>(���� �ʴ�), >=, <=, >, <)
--  2. ��������(AND, OR, NOT)
--  3. LIKE: �κ������� ��ġ�ϴ� ������ �˻�
--      %: 0�� �̻��� ����(������ ����� ������ �������)
--      _: 1���� ����(������ �������, ������ �ݵ�� 1:1 ��Ī)
--  4. NULL �˻�: �񱳿����� ���x, IS NULL, IS NOT NULL ���
--      �÷��� IS NULL: ���� NULL�� �÷� ã��
--      �÷��� IS NOT NULL: ���� NULL�� �ƴ� �÷� ã��

-- ���� ���̺����� ������ �л��� ����� �˻�����
SELECT * FROM ���� WHERE ���� = '�л�';

-- ���� ���̺����� ������ �л��� ������ ����� ��� ������ �˻�����
SELECT * FROM ���� WHERE ����<> '�л�';

-- ���� ���̺����� �������� 3000�̻��� ����� ��� ���� �˻�
SELECT * FROM ���� WHERE ������ >= 3000;

-- ���� ���̺����� �������� 3000�̸��� ����� ��� ���� �˻�
SELECT * FROM ���� WHERE ������ < 3000;

-- ���� ���̺����� �������� 1000~3000�� ����� ��� ���� �˻�
SELECT * FROM ���� WHERE ������ >=1000 AND ������ <=3000;
SELECT * FROM ���� WHERE ������ BETWEEN 1000 AND 3000;

-- ���� ���̺����� ������ �л��̰ų� ������ ����� ��� ���� �˻�
SELECT * FROM ���� WHERE ���� = '�л�' OR ���� = '����';
SELECT * FROM ���� WHERE ���� IN ('�л�', '����');

-- ���� ���̺����� ���� �达�� ������ ��� ������ �˻�
SELECT * FROM ���� WHERE �����̸� LIKE '��%';

-- ��ǰ ���̺����� ��ǰ�� '����'�� ������ ��ǰ�� ��� ���� �˻�
SELECT * FROM ��ǰ WHERE ��ǰ�� LIKE '%����';

-- ��ǰ ���̺����� ������ü �� '��'�� ������ ��ǰ�� ��� ���� �˻�
SELECT * FROM ��ǰ WHERE ������ü LIKE '%��%';

-- ���� ���̺����� ���� ���̵� 5���� ������ �������̵�, �����̸�, ����� �˻�
SELECT �������̵�, �����̸�, ��� FROM ���� WHERE �������̵� LIKE '_____';

-- ���� ���̺����� ���̰� �Էµ��� ���� ������ ��� ������ �˻�����
SELECT * FROM ���� WHERE ���� IS NULL;

-- ���� ���̺����� ���̰� �Էµ� ������ ��� ������ �˻�����
SELECT * FROM ���� WHERE ���� IS NOT NULL;

-- ����: ������ �� ������ �ٿ� �ִ´�.
-- ORDER BY Ű���� �̿�, ASC ��������(��������), DESC ��������
-- NULL�� �������� �� �� �Ǹ�����, �������� �� �� ������ ���
-- ����) ORDER BY �÷��� [ASC | DESC];
-- ���� ���̺����� �����̸�, ���, ���̸� �˻��ϵ�, ���̸� �������� �������� ���� �غ���
SELECT �����̸�, ���, ���� FROM ���� ORDER BY ���� DESC; -- ����
SELECT �����̸�, ���, ���� FROM ���� ORDER BY ���� ASC; -- ����
SELECT �����̸�, ���, ���� FROM ���� ORDER BY ����; -- ����

-- �ֹ� ���̺����� �ֹ�����, �ֹ���ǰ, ����, �ֹ����ڸ� �˻��غ���
-- (��, �ֹ���ǰ�� �������� �������� �����ϰ�, ���� ��ǰ�� ������ �������� �������� ����)
SELECT �ֹ�����, �ֹ���ǰ, ����, �ֹ����� FROM �ֹ� ORDER BY �ֹ���ǰ ASC, ���� DESC;