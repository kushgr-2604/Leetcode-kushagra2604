# Write your MySQL query statement below
select 
    s.student_id,
    s.student_name,
    sub.subject_name,
    Count(e.student_id) As attended_exams
From Students s 
cross join  subjects sub
left join Examinations e
    on s.student_id = e.student_id
    And sub.subject_name = e.subject_name
Group By 
    s.student_id,
    s.student_name,
    sub.subject_name
Order by 
    s.student_id,
    sub.subject_name;