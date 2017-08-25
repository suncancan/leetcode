/*
@author Cathy
@version 1.0
RunTime:7ms

��Ŀ��Intersection of Two Arrays II(Difficulty: Easy)
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:
What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

����˼·��
1������HashMap��¼��һ�������е����ּ����ֵĴ���
2�������ڶ������飬��ƥ�������浽ArrayList���棬HashMap��cnt--
3��ArrayListת����

ע�����
1��HashMap���� put() get()
2��ArrayList������add() get()
3���б�ת���ַ���
*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
        List<Integer> ls=new ArrayList<Integer>();
        int len1=nums1.length;
        int len2=nums2.length;
        
        for(int i=0;i<len1;i++){
            if(hs.containsKey(nums1[i])){
                hs.put(nums1[i],hs.get(nums1[i])+1);
            }else{
                hs.put(nums1[i],1);
            }
        }
        
        for(int i=0;i<len2;i++){
            int num=0;
            if(hs.containsKey(nums2[i])){
                if(hs.get(nums2[i])>0){
                    ls.add(nums2[i]);
                    hs.put(nums2[i],hs.get(nums2[i])-1);
                }
            }
        }
        
        int len3=ls.size();
        int[] arr=new int[len3];
        int pos=0;
        for(int i:ls){
            arr[pos++]=i;
        }
        
        return arr;
    }
}
