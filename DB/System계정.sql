-- 일반 계정 만들기
CREATE USER C##KJun IDENTIFIED BY 1111;

-- 계정에 권한 부여: GRANT
GRANT CONNECT, RESOURCE TO C##KJun;

-- 테이플 스페이스 권한 부여
ALTER USER C##KJun DEFAULT TABLESPACE USERS QUOTA UNLIMITED ON USERS;

SELECT * FROM TAB;