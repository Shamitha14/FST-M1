REM   Script: activity_1
REM   creating table

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

