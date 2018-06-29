/*
@author Cathy
@version 1.0

Time：O(n^2)   
Space:O(1)   

题目：3Sum Closest(Difficulty: Medium)
Given an array nums of n integers and an integer target, 
find three integers in nums such that the sum is closest to target. 
Return the sum of the three integers. You may assume that each input would have exactly one solution.

解题思路：
1、数组排序
2、三个数，一个数靠遍历，另外两个数靠双指针确定

注意事项：
理解题意啊！是找三个数的和中与target最相近的
*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE,sum=0;
        int temp_diff,temp_sum;
        int lenN=nums.length;
        
        for(int i=0;i<lenN-2;i++){
            int left=i+1,right=lenN-1;
            while(left<right){
                temp_sum=nums[i]+nums[left]+nums[right];
                temp_diff=Math.abs(temp_sum-target);
                if(temp_diff<diff){
                    diff=temp_diff;
                    sum=temp_sum;
                }
                if(temp_sum<target){
                    left++;
                }else if(temp_sum>target){
                    right--;
                }else{
                    return sum;
                }
            }
        }
        
        return sum;
    }
}