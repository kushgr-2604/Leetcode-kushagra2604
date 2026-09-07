# Write your MySQL query statement below
Select 
    query_name,
    Round(AVG(rating / position),2) AS quality,
    Round(AVG(rating<3) * 100, 2) AS poor_query_percentage 
    From Queries 
    group by query_name;