# HowTo

## Spring-boot
### Build
$ mvn install

### Run
$ mvn spring-boot:run

### Compile
$ mvn compile

### Compile Java code, run any tests, and finish by packaging the code up in a JAR file within the _target_ directory.
$ mvn package

### Install project's JAR file to that local repository
$ mvn install

### Kill port
$ sudo kill `sudo lsof -t -i:8080`

### Check port
$ lsof -i :8080




## Database Setup

## Run MySQL DBS
$ docker run --name history-postgres -p 5432:5432 -e POSTGRES_PASSWORD=history_jeong_db_pw -d postgres:11

## Initial Setup
### Login as Root
$ postgres -U postgres

### Create Database
$ CREATE DATABASE [DBNAME]


### Login
$ psql -h [HOSTURL] -p [PORT] -U [USER] -W 
$ [PW]

i.e. 
$ psql -h localhost -p 5432 -U postgres -W
$ history_jeong_db_pw

## Create a user + give privileges to the new user



## Build an executable JAR
- Building a single executable JAR file that contains all necessary dependencies, classes, and resources makes it easy to ship, version, and deploy the service as an application throughout the development lifecycle, across different environments, and so forth.

### Maven Command
- run the application
$ ./mvnw spring-boot:run 

OR

- build the JAR file with
$ ./mvnw clean package
- then run JAR file
$ java -jar target/[NAME OF JAR FILE]



## Reference

- Postgresql in Docker :: https://medium.com/@lvthillo/connect-from-local-machine-to-postgresql-docker-container-f785f00461a7
