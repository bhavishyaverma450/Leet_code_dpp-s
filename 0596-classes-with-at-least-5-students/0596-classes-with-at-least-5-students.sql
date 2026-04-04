# Write your MySQL query statement below
select distinct c.class
from Courses c
group by c.class
having count(c.class)>=5;