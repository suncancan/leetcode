/*
@author Cathy
@version 1.0
RunTime:13ms

��Ŀ��Contains Duplicate(Difficulty: Easy)
Description:

Given an array of integers, find if the array contains any duplicates. 
Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

����˼·��
����HashSet��add������
*/

//����1
//RunTime:13ms
//�Ľ��˷���2������һ��add��������������ͬ�ģ�����true���������ڣ���ѵ�ǰ���ּ��뵽HashSet���档
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

//����2
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