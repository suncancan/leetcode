/*
@author Cathy
@version 1.0

题目：Duplicate Emails(Difficulty: Easy)
Write a SQL query to find all duplicate emails in a table named Person.
+----+---------+
| Id | Email   |
+----+---------+
| 1  | a@b.com |
| 2  | c@d.com |
| 3  | a@b.com |
+----+---------+
For example, your query should return the following for the above table:
+---------+
| Email   |
+---------+
| a@b.com |
+---------+
Note: All emails are in lowercase.


解题思路
1、方法1 inner join
2、方法2 group by ,having
*/

select distinct a.Email as Email from Person as a inner join Person as b on a.Email=b.Email and a.Id!=b.Id

select Email from Person group by Email having count(Email)>1