/*
@author Cathy
@version 1.0

Time：O(N!)   对不对？？
Space:O(N)    nums数组长度为n&递归的深度为n

题目：Beautiful Arrangement(Difficulty: Medium)
Suppose you have N integers from 1 to N. We define a beautiful arrangement as an array that is constructed by these N numbers successfully if one of the following is true for the ith position (1 <= i <= N) in this array:

The number at the ith position is divisible by i.
i is divisible by the number at the ith position.
Now given N, how many beautiful arrangements can you construct?

Example 1:
Input: 2
Output: 2
Explanation: 
The first beautiful arrangement is [1, 2]:
Number at the 1st position (i=1) is 1, and 1 is divisible by i (i=1).
Number at the 2nd position (i=2) is 2, and 2 is divisible by i (i=2).
The second beautiful arrangement is [2, 1]:
Number at the 1st position (i=1) is 2, and 2 is divisible by i (i=1).
Number at the 2nd position (i=2) is 1, and i (i=2) is divisible by 1.
Note:
N is a positive integer and will not exceed 15.


解题思路 ：
1、首先构造n个数的全排列，有n!种排列方式，构造方式采用交换元素的方式。
2、每次对当前元素进行判断，若当前元素满足要求，则继续递归操作。

*/
class Solution {
    public int count;
    
    public int countArrangement(int N) {
        count=0;
        int[] nums=new int[N];
        for(int i=0;i<N;i++){
            nums[i]=i+1;
        }
        countNum(nums,N);
        return count;
    }
    
    public void countNum(int[] nums,int length){
        if(length==0){
            count++;
        }
        for(int i=0;i<length;i++){
            swap(nums,i,length-1);
            if(nums[length-1]%length==0 || length%nums[length-1]==0){
                countNum(nums,length-1);
            }  
            swap(nums,i,length-1);
        }
    }
    
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}