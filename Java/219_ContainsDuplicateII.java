/*
@author Cathy
@version 1.0
RunTime:15ms

��Ŀ��Contains Duplicate II(Difficulty: Easy)
Description:

Given an array of integers and an integer k, 
find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

����˼·��
1����HashSet�洢����
2��HashSet����洢���ڵ�ǰԪ�ؾ��벻����k��Ԫ�ء��������飬��ǰ���о��볬��k��Ԫ�أ���remove����ɾ����

ע�����
�㷨���Ż��������ݽṹ��
*/

//����1������HashSet���洢���� RunTime:15ms 
//���������Ч��
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet hs=new HashSet();
        
        for(int i=0;i<nums.length;i++){
            if(i>k){
                hs.remove(nums[i-k-1]);
            }
            if(!hs.add(nums[i])){
                return true;
            }
        }
        
        return false;
    }
}

//����2 RunTime:20ms 
//����HashMap�洢���ݣ�����ʱ�临�ӶȺܸ�
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap hm=new HashMap<Integer,Integer>();
        int temp;
        
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                temp=(int)hm.get(nums[i]);
                if(Math.abs(i-temp)<=k){
                    return true;
                }
            }
            
            hm.put(nums[i],i);
        }
        
        return false;
    }
}