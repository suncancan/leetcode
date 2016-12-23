/*
@author Cathy
@version 1.0
RunTime:2 ms

题目：Merge Sorted Array(Difficulty: Easy)
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.

解题关键思路：
参考插入排序方法。

注意事项：
边界值，for循环的起始点。
*/
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len=m,p=0;
        
        for(int i=0;i<n;i++){
            for(int j=p;j<len;j++){
                if(nums2[i]>nums1[j]){
                    p++;
                }else{
                    len++;
                    move(nums1,nums2[i],p,len);
                    break;
                }
            }
        }
        
        if(len<m+n){
            for(int i=len-m;i<n;i++){
                nums1[len]=nums2[i];
                len++;
            }
        }
    }
     public void move(int[] num,int value,int p,int len){
            for(int i=len-1;i>p;i--){
                num[i]=num[i-1];
            }
            num[p]=value;
        }
}