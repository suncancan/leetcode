/*
@author Cathy
@version 1.0

题目：Remove Duplicates from Sorted Array(Difficulty: Easy)
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this in place with constant memory.
For example,
Given input array nums = [1,1,2],
Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.

解题思路：
1、数组判空.若为空返回0。
2、遍历数组，用一个变量pre记录上一次记录的值，用一个变量count记录需要写入的位置。若当前值与pre不等，则写入，count++，否则退出当前循环。
3、return count。

注意事项：
变量初始化和循环条件。
*/
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int pre=nums[0],count=1,len=nums.length;
        
        for(int i=1;i<len;i++){
            if(nums[i]==pre){
                continue;
            }else{
                nums[count]=nums[i];
                pre=nums[i];
                count++;
            }
        }
        
        return count;
    }
}