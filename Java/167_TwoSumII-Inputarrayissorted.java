/*
@author Cathy
@version 1.0
RunTime:6ms

题目：Two Sum II - Input array is sorted(Difficulty: Easy)
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. 
Please note that your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2


解题思路：
1、外层循环遍历前面一个数字
2、前面的数字固定了，后面的数字采用二分查找
*/

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        int len=numbers.length;
        int num,m,n,mid,tag=0;
        
        for(int i=0;i<len-1;i++){
            if(tag==1){
                break;
            }
            num=target-numbers[i];
            m=i+1;
            n=len-1;
            mid=(m+n)/2;
            
            while(m<=n){
                if(num==numbers[mid]){
                    result[0]=i+1;
                    result[1]=mid+1;
                    tag=1;
                    break;
                }else if(numbers[mid]>num){
                    n=mid-1;
                    mid=(m+n)/2;
                }else{
                    m=mid+1;
                    mid=(m+n)/2;
                }
            }
        }
        
        return result;
    }
}