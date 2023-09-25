REM   Script: activity_5
REM   update and set value

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

CREATE TABLE saleman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

DESCRIBE saleman


CREATE TABLE salesexe ( 
    salesman_id NotNull int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

CREATE TABLE salesexe ( 
    salesman_id int primary key, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

DESCRIBE salesexe


INSERT ALL 
    INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13) 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

INSERT ALL 
    INTO salesexe VALUES(5002, 'Nail Knite', 'Paris', 13) 
    INTO salesexe VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesexe VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesexe VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesexe VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

INSERT ALL 
    INTO salesexe VALUES(5002, 'Nail Knite', 'Paris', 13) 
    INTO salesexe VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesexe VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesexe VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesexe VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

INSERT INTO salesexe VALUES(5001, 'James Hoog', 'New York', 15);

SELECT * FROM salesexe;

SELECT salesman_id, salesman_city FROM salesexe;

SELECT * FROM salesexe WHERE salesman_city='Paris';

SELECT salesman_id, salesman_city FROM salesexe;

SELECT * FROM salesexe WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesexe WHERE salesman_name='Paul Adam';

ALTER TABLE salesexe ADD grade int;

UPDATE salesexe SET grade=100;

SELECT * FROM salesexe;

UPDATE salesexe SET grade=200 WHERE salesman_city='Rome';

UPDATE salesexe SET grade=300 WHERE salesman_name='James Hoog';

UPDATE salesexe SET salesman_name='Pierre' WHERE salesman_name='McLyon';

SELECT * FROM salesexe;

