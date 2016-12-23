/*
@author Cathy
@version 1.0
RunTime:1ms

题目：Single Number(Difficulty: Easy)
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

解题思路：
位运算、异或
*/
public class Solution {
    public int singleNumber(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        
        int result=0;
        
        for(int i=0;i<nums.length;i++){
            result=result^nums[i];
        }
        
        return result;
    }
}