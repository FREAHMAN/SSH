drop database  if exists myBatis ;
--�������ݿ�
create database myBatis character set UTF8;

--ʹ�����ݿ�
use myBatis;

--�������ݱ�
create table member(
mid varchar(50),
name varchar(50),
age int ,
birthday date,
salary double,
constraint pk_mid primary key(mid)

);