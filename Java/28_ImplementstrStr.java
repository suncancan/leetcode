/*
@author Cathy
@version 2.0
RunTime:15ms

��Ŀ��Implement strStr()(Difficulty: Easy)
Implement strStr().
Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

2.0�汾����˼·��15ms����
1��KMP�㷨��������next�������

ע�����
1���߽�������������ַ����ķ��ʲ�ҪԽ��
2�����������haystack.length()==0 ���� needle.length()==0 ʱ����0
3�������߼������������

class Solution {
   public int strStr(String haystack, String needle) {
        if(haystack==null||needle==null||needle.length()>haystack.length()){
            return -1;
        }
        if(needle.length()==0||haystack.length()==0){
            return 0;
        }

        int[] searchArr=search(needle);
        int lenH=haystack.length();
        int lenN=needle.length();
        int i=0,j=0;

        while(i<lenH){
            if(haystack.charAt(i)!=needle.charAt(j)){
                if(j==0) {
                    i++;
                }else{
                    j=searchArr[j-1];
                }
            }
            if(i<lenH&&haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }
            if(j==lenN){
                return (i-lenN);
            }

        }

        return -1;
    }

    public int[] search(String needle){
        int lenN=needle.length();
        char[] charArr=needle.toCharArray();
        int [] next=new int[lenN];
        int max_length=0;
        next[0]=0;

        for(int i=1;i<lenN-1;i++){
            if(max_length>0&&charArr[i]!=charArr[max_length]){
                max_length=next[max_length-1];
            }
            if(charArr[i]==charArr[max_length]){
                max_length++;
            }
            next[i]=max_length;
        }

        return next;
    }
    
    
}



1.0�汾����˼·��28ms����
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
