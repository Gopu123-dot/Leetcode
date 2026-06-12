# Write your MySQL query statement below

select e.firstName,e.lastName,a.city,a.state 
from person e
left join address a
on e.personid=a.personid
order by e.firstname;