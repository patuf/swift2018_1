create database School;
use School;

create table teachers(

	id int not null auto_increment,
    name varchar(45) not null,
    email varchar(45) not null,
    salary double not null,
    primary key (id),
    unique index id_UNIQUE (id asc));
    
insert into teachers (name, email, salary) values ('Peter Ivanov', 'pivanov@gmail.com', 1921.50);

alter table teachers drop column salary;
alter table teachers add column salary double not null;

truncate table teachers;

insert into teachers (name, email, salary) values ('Georgi Stoimenov', 'stoimenov@gmail.com', 1787.25);
insert into teachers (name, email, salary) values ('Nataliya Yordanova', 'nyyoo@abv.bg', 1888.21);
insert into teachers (name, email, salary) values ('Simeon Prodanov', 'sprod@yahoo.com', 1341.60);

create table students(
	id int not null auto_increment,
    name varchar(45) not null,
    enrollment_date date not null,
    primary key (id),
    unique index id_unique (id asc));
    
insert into students (name, enrollment_date) values ('Georgi Georgiev', '2000-10-22');
insert into students (name, enrollment_date) values ('Stoyan Ivanov', '2010-11-18');
insert into students (name, enrollment_date) values ('Mariya Grozdanova', '2008-05-27');
insert into students (name, enrollment_date) values ('Stefaniya Petkova', '2007-12-01');

create table disciplines (
	id int not null auto_increment,
    name varchar(45) not null,
     primary key (id),
    unique index id_unique (id asc));
    
    
insert into disciplines (name) value ('Mathematics');
insert into disciplines (name) value ('Georgaphy');
insert into disciplines (name) value ('Physics');
insert into disciplines (name) value ('Informatics');

create table addresses (

	id int not null auto_increment,
    country varchar (45) not null,
    city varchar(45) not null,
    street varchar(45) not null,
    number varchar(45) not null,
    floor int not null,
    apartment_no int not null,
    primary key (id),
    unique index id_unique (id asc));
    
alter table addresses add column teachers_id int not null;

alter table addresses
	add constraint teachersId
    foreign key (teachers_id)
    references teachers (id);
    
alter table addresses add column students_id int not null;

alter table addresses
	add constraint studentsId
    foreign key (students_id)
    references students (id);
    
    





	


