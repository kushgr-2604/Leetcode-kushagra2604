# Write your MySQL query statement below
SELECT ROUND(
    COUNT(DISTINCT a.player_id) /(SELECT Count(distinct player_id) FROM Activity),2
) AS fraction 
From Activity a 
Join(
    Select player_id, MIN(event_date) As first_date 
    From Activity 
    Group BY player_id
) b 
On a.player_id = b.player_id 
AND a.event_date = DATE_ADD(b.first_date, Interval 1 day);