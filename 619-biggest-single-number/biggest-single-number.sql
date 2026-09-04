# Write your MySQL query statement below
select Max(num) as num
from ( 
    Select num
    From MyNumbers
    Group by num 
    Having Count(num) =1
) As single_numbers;