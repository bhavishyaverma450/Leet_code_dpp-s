# Write your MySQL query statement below
-- select Max(salary) as SecondHighestSalary 
-- from Employee 
-- where salary < (select Max(salary) from Employee)

select(
    select distinct salary
    from Employee
    order by salary desc
    limit 1 offset 1
) as secondHighestSalary;