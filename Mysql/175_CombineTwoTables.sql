/*
@author Cathy
@version 1.0

��Ŀ��Combine Two Tables(Difficulty: Easy)
Table: Person
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| PersonId    | int     |
| FirstName   | varchar |
| LastName    | varchar |
+-------------+---------+
PersonId is the primary key column for this table.

Table: Address
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| AddressId   | int     |
| PersonId    | int     |
| City        | varchar |
| State       | varchar |
+-------------+---------+
AddressId is the primary key column for this table.

Write a SQL query for a report that provides the following information for each person in the Person table, 
regardless if there is an address for each of those people:
FirstName, LastName, City, State

����˼·��
left join
*/

select a.FirstName,a.LastName,b.City,b.State from Person As a LEFT JOIN Address As b on a.PersonId=b.PersonId