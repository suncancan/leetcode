/*
@author Cathy
@version 1.0

Time：O(n)   
Space:O(1)   

题目：Next Permutation(Difficulty: Medium)
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
The replacement must be in-place, do not allocate extra memory.
Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1

解题思路：
1、从后向前遍历数组，若当前位比后一位小，则当前位是需要交换的，记为i（表示这一位后面有比其大的数可以换到前面来）
2、从后向前遍历数组，找到第一个出现的比第i位处数字大的数的位置（第i位后面的数列是倒序的），记为j
3、交换i，j位置
4、i位后面部分数列正序排列

注意事项：
主要是思路理清 代码实现问题不大
*/

class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null ||nums.length==0){
            return;
        }
        int len=nums.length;
        int i=len-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        int j=len-1;
        if(i>=0){
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1);
    }
    
    public void reverse(int[] nums,int start){
        int end=nums.length-1;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}