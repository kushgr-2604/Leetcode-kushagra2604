# Write your MySQL query statement below
Select user_id, Count(*) As followers_count
from Followers
Group by user_id
Order BY user_id;