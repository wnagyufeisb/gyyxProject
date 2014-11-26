/*==============================================================*/
/* Database name:  yufei1_db                                    */
/* DBMS name:      Microsoft SQL Server 2005                    */
/* Created on:     2014/11/26 16:51:18                          */
/*==============================================================*/


use yufei1_db
go

drop database yufei1_db
go

/*==============================================================*/
/* Database: yufei1_db                                          */
/*==============================================================*/
create database yufei1_db
go

use yufei1_db
go

/*==============================================================*/
/* Table: user_info                                             */
/*==============================================================*/
create table user_info (
   user_id              int                  not null,
   user_sex             varchar(10)          not null,
   user_phone           varchar(60)          null,
   user_state           int                  not null,
   constraint PK_USER_INFO primary key (user_id)
)
go

/*==============================================================*/
/* Table: user_key                                              */
/*==============================================================*/
create table user_key (
   user_id              int                  identity(1000,1),
   user_name            varchar(100)         not null,
   password             varchar(100)         not null,
   pstring              varchar(20)          not null,
   constraint PK_USER_KEY primary key (user_id)
)
go

/*==============================================================*/
/* Table: user_log                                              */
/*==============================================================*/
create table user_log (
   code                 int                  identity(1000 ,1),
   user_name            varchar(100)         not null,
   use_load_datetime    datetime             not null default getdate(),
   user_ip              varchar(100)         not null,
   constraint PK_USER_LOG primary key (code)
)
go

