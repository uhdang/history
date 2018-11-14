# Database Setup

# Run MySQL DBS
$ docker run --name history-postgres -p 5432:5432 -e POSTGRES_PASSWORD=history_jeong_db_pw -d postgres:11

# Initial Setup
## Login as Root
$ postgres -U postgres

## Login
$ psql -h [HOSTURL] -p [PORT] -U [USER] -W 
$ [PW]

i.e. 
$ psql -h localhost -p 5432 -U postgres -W
$ history_jeong_db_pw

## Login directly to a database
$ psql -h [HOSTURL] -p [PORT] -U [USER] [DBNAME]

## Create Database
$ CREATE DATABASE [DBNAME]

## Check Database
$ \l

## Select Database
$ \c [DBNAME]

## Create Table
CREATE TABLE "user" (
    username    VARCHAR(30),
    email       VARCHAR(30),
    password    VARCHAR(30)
);

## Check Table
$ \d

## Describe Table
$ \d [tablename]

## Select Query
$ SELECT * FROM "user"

## Describe Table
$ \d+ [tablename]

## Change datatype in Table
$ alter table [tablename] alter column [column name] type [new type];

## Delete
$ delete from [tablename] where [condition];
