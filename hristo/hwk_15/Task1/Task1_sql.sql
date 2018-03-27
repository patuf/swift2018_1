SELECT * FROM school.disciplines_taught;
use school;

select * from disciplines
inner join disciplines_taught on disciplines_taught.discipline_id = disciplines.id
where teacher_id = 5;

select teachers.name from teachers
inner join disciplines_taught on disciplines_taught.teacher_id = teachers.id
inner join disciplines on discipline_id = disciplines.id
where disciplines.name = 'Mathematics';

