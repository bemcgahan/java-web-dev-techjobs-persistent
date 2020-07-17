## Part 1: Test it with SQL

Jobs table has four columns.
id INT
name VARCHAR(100)
employer_id INT
jobs_id INT

## Part 2: Test it with SQL

select * from employer where location = 'St. Louis City';

## Part 3: Test it with SQL

drop table jobs;

## Part 4: Test it with SQL

select skill.name
from job_skills
inner join skill on job_skills.skills_id = skill.id
order by skill.name desc

