:<<!
@author Cathy
@version 1.0

题目：Tenth Line(Difficulty: Easy)
How would you print just the 10th line of a file?
For example, assume that file.txt has the following content:

Line 1
Line 2
Line 3
Line 4
Line 5
Line 6
Line 7
Line 8
Line 9
Line 10

Your script should output the tenth line, which is:
Line 10

解题思路：
sed\awk
!

#Solution 1
sed -n "10,10p" file.txt

#Solution 2
awk "NR==10" file.txt




