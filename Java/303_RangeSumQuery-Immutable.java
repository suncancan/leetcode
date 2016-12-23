/*
@author Cathy
@version 1.0

题目：Range Sum Query - Immutable
Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

解题思路：
1、NumArray()方法计算前i（0,1,2...,nums.length）项的和，并保存在sum数组里。
2、sumRange()方法通过求差得到和。

注意事项：
因为sumRange()方法会被调用多次，从时间角度考虑应在构造函数中对数据做预处理，减少sumRange()方法计算量。
*/
public class NumArray {
        
    int[] nums;
    int[] sum;
        
    public NumArray(int[] nums) {
         if(nums.length==0){
            sum=null;
            return ;
         }
        
         this.nums=nums;
         sum=new int[nums.length];
         sum[0]=nums[0];
         
         for(int i=1;i<nums.length;i++){
             sum[i]=sum[i-1]+nums[i];
         }
    }

    public int sumRange(int i, int j) {
        if(sum==null){
            return 0;
        }
        
        if(i>0){
            return sum[j]-sum[i-1];
        }else{
            return sum[j];
        }
    }
}
// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);