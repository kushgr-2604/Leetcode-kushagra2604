# Write your MySQL query statement below
Select 
    e.reports_to AS employee_id,
    m.name,
    Count(*) As reports_count,
    Round(AVG(e.age)) AS average_age
FROM Employees e 
join Employees m 
    on e.reports_to = m.employee_id
where e.reports_to IS NOT NULL
Group by e.reports_to, m.name
order by employee_id;