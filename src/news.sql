drop database  if exists myBatis ;
--�������ݿ�
create database myBatis character set UTF8;

--ʹ�����ݿ�
use myBatis;

--�������ݱ�
create table news(
nid 	int 	auto_increment ,
title 	varchar(50),
pub_date datetime,
constraint pk_nid primary key(nid)
);