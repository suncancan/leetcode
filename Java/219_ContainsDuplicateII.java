/*
@author Cathy
@version 1.0
RunTime:15ms

题目：Contains Duplicate II(Difficulty: Easy)
Description:

Given an array of integers and an integer k, 
find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

解题思路：
1、用HashSet存储数据
2、HashSet里面存储对于当前元素距离不大于k的元素。遍历数组，若前面有距离超过k的元素，用remove方法删除。

注意事项：
算法的优化，简化数据结构。
*/

//方法1，利用HashSet来存储数据 RunTime:15ms 
//提高了运行效率
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet hs=new HashSet();
        
        for(int i=0;i<nums.length;i++){
            if(i>k){
                hs.remove(nums[i-k-1]);
            }
            if(!hs.add(nums[i])){
                return true;
            }
        }
        
        return false;
    }
}

//方法2 RunTime:20ms 
//利用HashMap存储数据，但是时间复杂度很高
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap hm=new HashMap<Integer,Integer>();
        int temp;
        
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                temp=(int)hm.get(nums[i]);
                if(Math.abs(i-temp)<=k){
                    return true;
                }
            }
            
            hm.put(nums[i],i);
        }
        
        return false;
    }
}