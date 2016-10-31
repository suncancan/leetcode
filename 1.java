/*
@author Cathy
@version 1.0

题目：
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution.
The return format had been changed to zero-based indices.

总结：
1、看清需要返回什么，下标或者元素值
2、for循环的临界条件分析好
3、如果没有结果，需要抛出异常，异常如何抛出，RunTimeException不需要自己写代码来捕获异常
*/
public class Solution {
    public int[] twoSum (int[] nums, int target) {
        int[] result=new int[2];
        int len=nums.length;
        boolean q=false;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    q=true;
                    break;
                }
            }
        }
        
        if(q==false){
           throw new IllegalArgumentException("No two sum solution");
            
        }
        else{
            return result;
        }
    }
}