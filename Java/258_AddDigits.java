/*
@author Cathy
@version 1.0
RunTime:2ms

题目：Add Digits(Difficulty: Easy)
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
For example:
Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?

解题思路：
找规律，注意结果返回1-9之间的数字 
*/

public class Solution {
    public int addDigits(int num) {
        return (num-1)%9+1;
    }
}