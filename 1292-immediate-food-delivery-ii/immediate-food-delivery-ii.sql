# Write your MySQL query statement belowS
Select 
    Round(
        100.0 * SUM(Order_date = customer_pref_delivery_date) / count(*), 2
    ) AS immediate_percentage 
FROM Delivery
Where (customer_id, order_date ) In(
    Select customer_id, MIN(order_date)
    FRom Delivery
    Group BY customer_id
);    