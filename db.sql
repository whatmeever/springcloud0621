create table dept(depths bigint primary key auto_increment, name varchar(60), db_source varchar(60));

create database cloudDB02;

insert into dept(name, db_source) values('java', database());
insert into dept(name, db_source) values('html', database());
insert into dept(name, db_source) values('python', database());

create database cloudDB03;

insert into dept(name, db_source) values('dianxin', database());
insert into dept(name, db_source) values('yidong', database());
insert into dept(name, db_source) values('liantong', database());