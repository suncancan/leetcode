/*
@author Cathy
@version 1.0

RunTime:16ms
Time：O(n)
Space:O(1)

题目：Maximum Subarray(Difficulty: Easy)
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.

解题思路：
1、遍历数组，累计求和，count<0就置为0，count>max就令max=count

注意事项：
初始化
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int lens=nums.length;
        int max=nums[0];
        int count=nums[0];
        
        for(int i=1;i<lens;i++){
            if(count<0){
                count=0;
            }
            count+=nums[i];
            if(count>max){
                max=count;
            }
        }
        return max;
    }
}
