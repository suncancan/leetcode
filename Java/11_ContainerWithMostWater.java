/*
@author Cathy
@version 1.0

RunTime:13ms
Time：O(n)
Space:O(1)

题目：Container With Most Water(Difficulty: Medium)
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
Find two lines, which together with x-axis forms a container, such that the container contains the most water.
Note: You may not slant the container and n is at least 2.

解题思路：
1、双指针，从两端往里移动，每次保留指针值最大的，另外一个指针往里移动
2、结束条件 left>=right

*/

class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int minVal;
        int maxArea=0;
        int curArea;
        while(left<right){
            minVal=Math.min(height[left],height[right]);
            curArea=(right-left)*minVal;
            if (curArea>maxArea){
                maxArea=curArea;
            }
            if (height[left]==minVal){
                left++;
            }else{
                right--;
            }
        }
        
        return maxArea;
    }
}