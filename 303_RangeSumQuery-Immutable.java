/*
@author Cathy
@version 1.0

��Ŀ��Range Sum Query - Immutable
Given an integer array nums, find the sum of the elements between indices i and j (i �� j), inclusive.

����˼·��
1��NumArray()��������ǰi��0,1,2...,nums.length����ĺͣ���������sum�����
2��sumRange()����ͨ�����õ��͡�

ע�����
��ΪsumRange()�����ᱻ���ö�Σ���ʱ��Ƕȿ���Ӧ�ڹ��캯���ж�������Ԥ��������sumRange()������������
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