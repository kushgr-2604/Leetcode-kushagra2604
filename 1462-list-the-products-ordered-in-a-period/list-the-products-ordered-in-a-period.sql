# Write your MySQL query statement below
Select 
    p.product_name,
    Sum(o.unit) As unit
From Products P
Join Orders o 
    on p.product_id = o.product_id
where o.order_date >= '2020-02-01'
    And o.order_date < '2020-03-01'
Group By p.product_id, p.product_name
having SUM(o.unit) >= 100;