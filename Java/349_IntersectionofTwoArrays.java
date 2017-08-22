/*
@author Cathy
@version 1.0
RunTime:6ms

��Ŀ��Intersection of Two Arrays(Difficulty: Easy)
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.

����˼·��
1����hashset�洢һ�������Ԫ��

ע�����
1�����Ľ���������ظ�ֵ
*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<Integer>();
        HashSet<Integer> hs2=new HashSet<Integer>();
        int len1=nums1.length;
        int len2=nums2.length;
        
        for(int i=0;i<len1;i++){
            hs.add(nums1[i]);
        }
        
        for(int i=0;i<len2;i++){
            if(hs.contains(nums2[i])){
                hs2.add(nums2[i]);
            }
        }
        
        int len=hs2.size();
        int[] arr=new int[len];
        int pos=0;
        for(int i:hs2){
            arr[pos++]=i;
        }
        
        return arr;
        
    }
}