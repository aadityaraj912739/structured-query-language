# Write your MySQL query statement below
SELECT e2.name as Employee
FROM Employee e1 
JOIN Employee e2
ON e1.id = e2.managerId
where e1.salary > e2.salary
