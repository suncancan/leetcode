/*
@author Cathy
@version 1.0
RunTime:20ms

题目：Power of Three(Difficulty: Easy)
Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?

解题思路：
1、方法1 循环法
2、方法2 Integer.toString(n,3)转成字符串，然后用正则匹配
3、方法3 用log计算
*/

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        
        return (Math.log10(n)/Math.log10(3))%1==0;
    }
}