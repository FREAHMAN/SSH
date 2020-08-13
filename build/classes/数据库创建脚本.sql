--删除数据表
drop table if exists member;
--创建member表
create table member(
       mid varchar(50),
       name varchar(50),
       age int,
       sex varchar(50),
       birthday date,
       salary double,
       note text,
       constraint pk_mid primary key (mid)
); type=innodb;

insert into member values('001','fusheng',8,'男',sysdate,20.09,'ll');
