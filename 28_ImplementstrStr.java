/*
@author Cathy
@version 1.0
RunTime:28ms

��Ŀ��Implement strStr()(Difficulty: Easy)
Implement strStr().
Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

����˼·��
1�������пա�
2���Ƚ������ַ������ȡ���haystackС��return-1��
3��needle��haystackǰ���С�ĩβ����������п��ǡ��м���ж���split()������

ע�����
����������������������needle��haystackǰ���С�ĩβ����������п��ǡ�
*/
public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack==null||needle==null){
            return -1;
        }
        
        if(needle.length()==0){
            return 0;
        }
        
        if(haystack.length()<needle.length()){
            return -1;
        }
        
        if(haystack.substring(0,needle.length()).equals(needle)){
            return 0;
        }
        
        if(haystack.substring(haystack.length()-needle.length()).equals(needle)){
            return haystack.length()-needle.length(); 
        }
        
        String[] s=haystack.split(needle);
        
        if(s.length<=1){
            return -1;
        }else{
            return s[0].length(); 
        }
    }
}
