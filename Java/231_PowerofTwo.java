/*
@author Cathy
@version 1.0
RunTime:2ms

题目：Power of Two(Difficulty: Easy)
Description:

Given an integer, write a function to determine if it is a power of two.

解题思路：
运用位运算（&和>>）从最低位开始依次取出n每一位的值。判断是否为0。当只剩下最高位时，停止循环。
*/
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }else if(n==1){
            return true;
        }
        
        int b;
        
        while(n!=1){
            b=n&1;
            
            if(b==1){
                return false;
            }
            
            n=n>>1;
        }
        
        return true;
    }
}