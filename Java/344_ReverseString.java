/*
@author Cathy
@version 1.0
RunTime:4ms

题目：Reverse String(Difficulty: Easy)
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

解题思路：
1、new StringBuffer(s).reverse())
*/

class Solution {
    public String reverseString(String s) {
        String reverseS=new StringBuffer(s).reverse().toString();
        
        return reverseS;
    }
}