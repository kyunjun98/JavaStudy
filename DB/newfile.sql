
/* Drop Triggers */

DROP TRIGGER TRI_NEW_TABLE_123;
DROP TRIGGER TRI_NEW_TABLE_1234;



/* Drop Tables */

DROP TABLE NEW_TABLE CASCADE CONSTRAINTS;
DROP TABLE NEW_TABLE CASCADE CONSTRAINTS;
DROP TABLE NEW_TABLE CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE SEQ_NEW_TABLE_123;
DROP SEQUENCE SEQ_NEW_TABLE_1234;




/* Create Sequences */

CREATE SEQUENCE SEQ_NEW_TABLE_123 INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_NEW_TABLE_1234 INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE NEW_TABLE
(
	-- 1312
	123 float(24) NOT NULL,
	PRIMARY KEY (123)
);


CREATE TABLE NEW_TABLE
(
	1234 float NOT NULL,
	PRIMARY KEY (1234)
);


CREATE TABLE NEW_TABLE
(
	-- 1312
	123 float(24) NOT NULL,
	1234 float NOT NULL
);



/* Create Foreign Keys */

ALTER TABLE NEW_TABLE
	ADD FOREIGN KEY (123)
	REFERENCES NEW_TABLE (123)
;


ALTER TABLE NEW_TABLE
	ADD FOREIGN KEY (1234)
	REFERENCES NEW_TABLE (1234)
;



/* Create Triggers */

CREATE OR REPLACE TRIGGER TRI_NEW_TABLE_123 BEFORE INSERT ON NEW_TABLE
FOR EACH ROW
BEGIN
	SELECT SEQ_NEW_TABLE_123.nextval
	INTO :new.123
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_NEW_TABLE_1234 BEFORE INSERT ON NEW_TABLE
FOR EACH ROW
BEGIN
	SELECT SEQ_NEW_TABLE_1234.nextval
	INTO :new.1234
	FROM dual;
END;

/




/* Comments */

COMMENT ON COLUMN NEW_TABLE.123 IS '1312';
COMMENT ON COLUMN NEW_TABLE.123 IS '1312';



