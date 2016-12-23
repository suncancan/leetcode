/*
@author Cathy
@version 1.0
RunTime:1ms

题目：Rotate Array(Difficulty: Easy)
Rotate an array of n elements to the right by k steps.
For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.

Hint:
Could you do it in-place with O(1) extra space?
Related problem: Reverse Words in a String II

解题思路：
1、因为空间复杂度为O(1)，所以首先想到，每次移动一位，循环k%nums.length次，这样需要额外的一个存储空间。
（循环从后向前进行，若从前向后，值会被覆盖，需要额外的两个存储空间，而且时间复杂度会增加）
2、但是超时了，因为移动次数太多了。于是参考Top Solutions里面的答案，反转3次。
3、这道题的关键是思路。抽象问题，用最有效（时间复杂度和空间复杂度低）的方式解决。
*/
//方法1：（超时）
public class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        
        if(k==0||k%len==0){
            return ;
        }
        
        for(int i=0;i<k%len;i++){
            rotateOne(nums);
        }
        
    }
    
    public void rotateOne(int[] nums){
        int len=nums.length;
        int temp=nums[len-1];
        
        for(int i=len-1;i>0;i--){
           nums[i]=nums[i-1];
        }
        
        nums[0]=temp;
    }
}


//方法2：
public class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        int dis=k%len;
        
        if(k==0||k%len==0){
            return ;
        }
        
        reverse(nums,0,len-1);
        reverse(nums,0,dis-1);
        reverse(nums,dis,len-1);
    }
    
    public void reverse(int[] nums,int start,int end){
        int temp;
        
        while(end-start>0){
            temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }
    }
    
}

