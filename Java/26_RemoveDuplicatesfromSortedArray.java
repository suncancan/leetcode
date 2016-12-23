/*
@author Cathy
@version 1.0

��Ŀ��Remove Duplicates from Sorted Array(Difficulty: Easy)
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this in place with constant memory.
For example,
Given input array nums = [1,1,2],
Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.

����˼·��
1�������п�.��Ϊ�շ���0��
2���������飬��һ������pre��¼��һ�μ�¼��ֵ����һ������count��¼��Ҫд���λ�á�����ǰֵ��pre���ȣ���д�룬count++�������˳���ǰѭ����
3��return count��

ע�����
������ʼ����ѭ��������
*/
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int pre=nums[0],count=1,len=nums.length;
        
        for(int i=1;i<len;i++){
            if(nums[i]==pre){
                continue;
            }else{
                nums[count]=nums[i];
                pre=nums[i];
                count++;
            }
        }
        
        return count;
    }
}