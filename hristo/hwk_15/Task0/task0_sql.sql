create database sakila;
use sakila;

create table actor (
	id int not null auto_increment,
    name varchar (15) not null,
    primary key (id));
    
create table film (
	id int not null auto_increment,
    film_name varchar(15) not null,
    primary key (id));
    
select * from actor;
insert into actor (name) value ('Ivan');

alter table film 
	add column actor_id int null;

alter table film
	add constraint film_actor
    foreign key (actor_id)
    references actor (id);
    
drop procedure insert_actor;

call insert_actor ('Dragan', @new_id);
select @new_id;
    
    
    
delimiter //    
CREATE PROCEDURE insert_actor(in new_name varchar(15), new_film varchar (15), out new_id int)
    
BEGIN

insert into actor (name) values (new_name);

set new_id = last_insert_id();

update film set actor_id = new_id where film_name = new_film;

end

