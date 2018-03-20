-- Custom install:
-- 		mysql server
-- 		mysql workbench
	
-- Standalone MySQL server
-- Development Machine
-- Mysql root password - something easy

-- the rest is default

create database tests;
use tests;

CREATE TABLE test_table (
  id INT NOT NULL AUTO_INCREMENT,
  test_name VARCHAR(45) NOT NULL,
  test_number INT NOT NULL,
  test_date DATETIME NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX id_UNIQUE (id ASC));
  
INSERT INTO test_table (test_name, test_number, test_date) VALUES ('name3', '6587', '2018-03-03');

create database animalDB;
use animalDB;

CREATE TABLE people (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  age INT NOT NULL,
  petId INT NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX id_UNIQUE (id ASC));

CREATE TABLE pets (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  age INT NOT NULL,
  type VARCHAR(45) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX id_UNIQUE (id ASC));

alter table people drop column petId;
alter table pets add column ownerId int not null;

ALTER TABLE pets
ADD CONSTRAINT owner_id
  FOREIGN KEY (ownerId)
  REFERENCES people (id);

INSERT INTO people (name, age) VALUES ('Pesho', 12);
INSERT INTO people (name, age) VALUES ('Gosho', 18);
INSERT INTO people (name, age) VALUES ('Maria', 22);

INSERT INTO pets (name, age, type, ownerId) VALUES('Balkan', 3, 'Dog', 1);
INSERT INTO pets (name, age, type, ownerId) VALUES('Vihar', 2, 'Dog', 1);
INSERT INTO pets (name, age, type, ownerId) VALUES('Lucky', 5, 'Dog', 1);
INSERT INTO pets (name, age, type, ownerId) VALUES('Jet', 1, 'Sparrow', 2);
INSERT INTO pets (name, age, type, ownerId) VALUES('Siika', 5, 'Snake', 3);

UPDATE pets SET age=2 WHERE id=4;

SELECT * from pets where type = 'Dog';

SELECT type, count(1) 
  from pets
  where age > 2
  group by type
  having count(1) < 3
  order by type;

ALTER TABLE pets drop foreign key owner_id;
ALTER TABLE pets drop column ownerId;

CREATE TABLE pets_to_owners (
	owner_id INT NOT NULL,
	pet_id INT NOT NULL,
	FOREIGN KEY (owner_id) REFERENCES people(id),
	FOREIGN KEY (pet_id) REFERENCES pets(id)
);

insert into pets_to_owners values (1, 1);
insert into pets_to_owners values (1, 2);
insert into pets_to_owners values (1, 3);
insert into pets_to_owners values (2, 4);
insert into pets_to_owners values (3, 4);


Select * from people ppl
inner join pets on ppl.id = pets.ownerId;

select * from people ppl
join pets_to_owners pto on ppl.id = pto.owner_id
join pets on pto.pet_id = pets.id;

-- Fam tree

create table fam_tree (
   person_id int not null,
   parent_id int not null,
   foreign key (person_id) references people(id),
   foreign key (parent_id) references people(id)
);