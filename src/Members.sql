--drop database  if exists myBatis ;
--create database myBatis character set UTF8;

use myBatis;

create table members(
mid varchar(50),
name varchar(50),
age int ,
school varchar(50),
score double,
company varchar(50),
salary double,
flag varchar(50),
constraint pkms_mid primary key(mid)
);