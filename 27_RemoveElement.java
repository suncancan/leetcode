/*
@author Cathy
@version 1.0
RunTime:8ms

题目：Remove Element(Difficulty: Easy)
Given an array and a value, remove all instances of that value in place and return the new length.
Do not allocate extra space for another array, you must do this in place with constant memory.
The order of elements can be changed. It doesn't matter what you leave beyond the new length.
Example:
Given input array nums = [3,2,2,3], val = 3
Your function should return length = 2, with the first two elements of nums being 2.

解题思路：
1、数组判空.若为空返回0。
2、遍历数组，用一个变量count记录需要写入的位置。若当前值与val不等，则写入，count++，否则退出当前循环。
3、return count。
*/
public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums==null||nums.length==0){
            return 0;
        }
        
        int count=0;
        int len=nums.length;
        
        for(int i=0;i<len;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }else{
                continue;
            }
        }
        
        return count;
    }
}