create database QLDT_db;
use QLDT_db;

CREATE TABLE Student (
	Sid varchar(35) not null,
    Name varchar(35) not null,
    Age int not null,
    Major varchar(35) not null,
    GPA float not null,
    Hrs_completed int not null,
    primary key(Sid)
);

create table Professor (
	Pid varchar(35) not null,
    Name varchar(35) not null,
    Dept varchar(35) not null,
    Yrs_teaching int not null,
    primary key(Pid)
);

create table Course (
	Cid varchar(35) not null,
    Term varchar(35) not null,
    Name varchar(35) not null,
    Dept varchar(35) not null,
    Enrollment int not null,
    primary key(Cid,Term)
);

create table Take (
	Sid varchar(35) not null,
    Cid varchar(35) not null,
    Term varchar(35) not null,
    Grade varchar(2) not null,
    primary key(Sid,Cid,Term),
    foreign key (Sid) references Student(Sid),
    foreign key (Cid,Term) references Course(Cid,Term)
);

create table Teach (
	Pid varchar(35) not null,
    Cid varchar(35) not null,
    Term varchar(35) not null,
    primary key(Pid,Cid,Term),
    foreign key(Pid) references Professor(Pid),
    foreign key(Cid,Term) references Course(Cid,Term)
);