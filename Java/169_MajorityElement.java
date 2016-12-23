/*
@author Cathy
@version 1.0
RunTime:3ms

题目：Majority Element(Difficulty: Easy)
Given an array of size n, find the majority element. The majority element is the element that appears more than  n/2 times.

You may assume that the array is non-empty and the majority element always exist in the array.

解题思路：
排序，len/2位置的元素即为所求。（无论奇偶）

*/
public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        
        return nums[nums.length/2];
    }
}