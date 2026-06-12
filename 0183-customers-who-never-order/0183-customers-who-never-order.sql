# Write your MySQL query statement below

select c.name as Customers
from Customers c
left join Orders o
on o.customerid=c.id
where o.customerid is null;
