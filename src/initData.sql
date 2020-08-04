drop database  if exists myBatis ;
--创建数据库
create database myBatis character set UTF8;

--使用数据库
use myBatis;

--创建数据表
create table member(
mid varchar(50),
name varchar(50),
age int ,
birthday date,
salary double,
constraint pk_mid primary key(mid)

);