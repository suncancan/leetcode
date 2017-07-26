/*
@author Cathy
@version 1.0

题目：Second Highest Salary(Difficulty: Easy)
Write a SQL query to get the second highest salary from the Employee table.
+----+--------+
| Id | Salary |
+----+--------+
| 1  | 100    |
| 2  | 200    |
| 3  | 300    |
+----+--------+
For example, given the above Employee table, the query should return 200 as the second highest salary. 
If there is no second highest salary, then the query should return null.
+---------------------+
| SecondHighestSalary |
+---------------------+
| 200                 |
+---------------------+


解题思路
1、排序 order by Salary desc
2、取对应行 limit 1,1
3、没有的话返回null 双层select
*/

select (select distinct Salary from Employee order by Salary desc limit 1,1 )  as SecondHighestSalary