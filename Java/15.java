/*
@author Cathy
@version 1.0

题目：
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
Note: The solution set must not contain duplicate triplets.

总结：
1、List接口的用法，如何创建ArrayList类型实例
2、每个结果集如何赋值给result，每回合需要初始化！！！
3、如何判断是否重复。
*/
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        int len=nums.length;
        
        for(int i=0;i<len-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<len-1;j++){
                if(j>(i+1)&&nums[j]==nums[j-1]){
                    continue;
                }
              for(int k=j+1;k<len;k++){
                  if(k>(j+1)&&nums[k]==nums[k-1]){
                    continue;
                }
                 if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> lResult=new ArrayList<Integer>(3);
                    lResult.add(nums[i]); 
                    lResult.add(nums[j]); 
                    lResult.add(nums[k]);
                    result.add(lResult);
                 } 
              }  
            }
        }
        
            return result;
        
    }
}