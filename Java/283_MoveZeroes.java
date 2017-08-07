/*
@author Cathy
@version 1.0
RunTime:0ms

题目：Move Zeroes(Difficulty: Easy)
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.

解题思路：
1、考虑非0值如何处理
2、后面补齐0
*/

public class Solution {
    public void moveZeroes(int[] nums) {
        int num=0,lenN=nums.length;
        
        for(int i=0;i<lenN;i++){
            if(nums[i]!=0){
                nums[num++]=nums[i];
            }
        }
        
        for(int i=num;i<lenN;i++){
            nums[i]=0;
        }
    }
}