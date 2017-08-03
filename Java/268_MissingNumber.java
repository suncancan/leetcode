/*
@author Cathy
@version 1.0
RunTime:1ms

题目：Missing Number(Difficulty: Easy)
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. 
Could you implement it using only constant extra space complexity?

解题思路：
1、方法一异或
2、方法二求和
*/

#异或
public class Solution {
    public int missingNumber(int[] nums) {

        int len=nums.length;
        int result=0;
        
        for(int i=0;i<len;i++){
            result=result^nums[i]^(i+1);
        }
        
        return result;
    }
}

#求和
public class Solution {
    public int missingNumber(int[] nums) {

        int len=nums.length;
        int result=0;
        
        for(int i=0;i<len;i++){
            result+=nums[i];
        }
        
        return (len+1)*len/2-result;
    }
}