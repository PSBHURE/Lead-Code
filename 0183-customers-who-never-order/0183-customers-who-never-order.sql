# Write your MySQL query statement below
select name   Customers from Customers c where not exists
(select 1 from orders o where c.id=o.customerid);