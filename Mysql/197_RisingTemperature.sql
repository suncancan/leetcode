/*
@author Cathy
@version 1.0

题目：Rising Temperature(Difficulty: Easy)
Given a Weather table, write a SQL query to find all dates' Ids with higher temperature compared to its previous (yesterday's) dates.
+---------+------------+------------------+
| Id(INT) | Date(DATE) | Temperature(INT) |
+---------+------------+------------------+
|       1 | 2015-01-01 |               10 |
|       2 | 2015-01-02 |               25 |
|       3 | 2015-01-03 |               20 |
|       4 | 2015-01-04 |               30 |
+---------+------------+------------------+
For example, return the following Ids for the above Weather table:
+----+
| Id |
+----+
|  2 |
|  4 |
+----+

注意事项：
不能用left join，会出现空值

解题思路
1、表的关联
2、TO_DAYS()  返回一个天数(从公元0年的天数)
*/

select b.Id from Weather a,Weather b where TO_DAYS(a.Date)=TO_DAYS(b.Date)-1 and a.Temperature<b.Temperature 