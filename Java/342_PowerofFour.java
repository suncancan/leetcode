/*
@author Cathy
@version 1.0
RunTime:2ms

题目：Power of Four(Difficulty: Easy)
Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.

Follow up: Could you solve it without loops/recursion?

解题思路：
1、方法1 循环法
2、方法2 Integer.toString(n,3)转成字符串，然后用正则匹配
3、方法3 用log计算
*/

class Solution {
    public boolean isPowerOfFour(int num) {
        return (num>0 &&(Math.log10(num)/Math.log10(4))%1==0);
    }
}