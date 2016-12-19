/*
@author Cathy
@version 1.0
RunTime:1ms

题目：Factorial Trailing Zeroes(Difficulty: Easy)
Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.

解题思路：
主要是计算包含因数5的个数。（0是由2*5得到的，由于2的个数大于5的个数，所以数5的个数就可以了。）
*/
public class Solution {
    public int trailingZeroes(int n) {
        int num=0;
        
        while(n>0){
            n/=5;
            num+=n;
        }
        
        return num;
    }
}