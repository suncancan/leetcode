/*
@author Cathy
@version 1.0

��Ŀ��House Robber
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

����˼·��
1�������ҳ�ǰn��0,1,2,...,len����Ԫ����sum���ֵ��
2��m�����¼�������һ��Ԫ�ص�sum���ֵ�����ڲ��������ڵ�Ԫ�أ�ÿ��ѭ����Ҫ��¼��ȥ���һ��Ԫ�ص�sum���ֵ��n����
*/
public class Solution {
    public int rob(int[] nums) {
        
        if(nums==null||nums.length==0){
            return 0;
        }
        
        int len=nums.length;
        int[] m=new int[len],n=new int[len];//m�������һ��ֵ��n���������һ��ֵ
        
        m[0]=nums[0];
        n[0]=0;
        
        for(int i=1;i<len;i++){
            m[i]=n[i-1]+nums[i];
            n[i]=Math.max(m[i-1],n[i-1]);
        }
        
        return Math.max(m[len-1],n[len-1]);
    }
}