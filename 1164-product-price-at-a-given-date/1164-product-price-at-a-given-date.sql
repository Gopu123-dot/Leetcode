# Write your MySQL query statement below

select p.product_id,
    COALESCE(p2.new_price,10) as price
from
    (select distinct product_id from Products) p
left join Products p2
on p.product_id=p2.product_id
and p2.change_date=(
    select max(change_date)
    from Products p3
    where p3.product_id=p.product_id
      and p3.change_date<='2019-08-16'
);