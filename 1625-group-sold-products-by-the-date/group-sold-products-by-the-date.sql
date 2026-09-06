# Write your MySQL query statement below
Select sell_date,
count(distinct product) as num_sold,
Group_Concat(
    distinct product 
    order by product
    separator ','
) as products 
From Activities
Group by sell_date
order by sell_date;