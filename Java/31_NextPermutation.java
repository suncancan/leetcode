/*
@author Cathy
@version 1.0

Time��O(n)   
Space:O(1)   

��Ŀ��Next Permutation(Difficulty: Medium)
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
The replacement must be in-place, do not allocate extra memory.
Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
1,2,3 �� 1,3,2
3,2,1 �� 1,2,3
1,1,5 �� 1,5,1

����˼·��
1���Ӻ���ǰ�������飬����ǰλ�Ⱥ�һλС����ǰλ����Ҫ�����ģ���Ϊi����ʾ��һλ�����б����������Ի���ǰ������
2���Ӻ���ǰ�������飬�ҵ���һ�����ֵıȵ�iλ�����ִ������λ�ã���iλ����������ǵ���ģ�����Ϊj
3������i��jλ��
4��iλ���沿��������������

ע�����
��Ҫ��˼·���� ����ʵ�����ⲻ��
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