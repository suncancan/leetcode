/*
@author Cathy
@version 1.0
RunTime:13ms

题目：Contains Duplicate(Difficulty: Easy)
Description:

Given an array of integers, find if the array contains any duplicates. 
Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

解题思路：
利用HashSet的add方法。
*/

//方法1
//RunTime:13ms
//改进了方法2，利用一次add方法，若存在相同的，返回true，若不存在，则把当前数字加入到HashSet里面。
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null||nums.length==0){
            return false;
        }
        
        HashSet hs=new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(!hs.add(nums[i])){
                return true;
            }
        }
        
        return false;
    }
}

//方法2
//RunTime:23ms
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null||nums.length==0){
            return false;
        }
        
        HashSet hs=new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                return true;
            }
			
			hs.add(nums[i]);
        }
        
        return false;
    }
}