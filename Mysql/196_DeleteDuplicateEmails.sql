/*
@author Cathy
@version 1.0

题目：Delete Duplicate Emails(Difficulty: Easy)
Write a SQL query to delete all duplicate email entries in a table named Person, keeping only unique emails based on its smallest Id.
+----+------------------+
| Id | Email            |
+----+------------------+
| 1  | john@example.com |
| 2  | bob@example.com  |
| 3  | john@example.com |
+----+------------------+
Id is the primary key column for this table.
For example, after running your query, the above Person table should have the following rows:
+----+------------------+
| Id | Email            |
+----+------------------+
| 1  | john@example.com |
| 2  | bob@example.com  |
+----+------------------+

注意事项：
注意是查询操作还是删除操作

解题思路
1、delete from
2、表连接
*/

delete a from Person a,Person b where a.Email=b.Email and a.Id>b.Id 