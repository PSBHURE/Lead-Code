# Write your MySQL query statement below
#select salary SecondHighestSalary from Employee order by salary desc limit 1,1;
SELECT(SELECT DISTINCT
    Salary 
FROM
    Employee
ORDER BY Salary DESC
LIMIT 1 OFFSET 1)AS SecondHighestSalary;