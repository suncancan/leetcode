/*
@author Cathy
@version 1.0
RunTime:5ms

��Ŀ��Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?

����˼·��
1������ؼ��������˼·���뵽�˽���˼·��ʵ�����������ѡ�
2��˼·��ͳ��ÿ���ַ������ַ�Ƶ�ʣ��ж϶�Ӧ�ַ�Ƶ���Ƿ���ȡ�
3�����ǿռ临�Ӷȣ����ڵ�һ���ַ���Ƶ�ʼ����üӷ���count++�����ڶ����ַ���Ƶ���ü�����count--����
*/
public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr=new int[26];
        int lenS=s.length();
        int lenT=t.length();
        
        if(lenS!=lenT){
            return false;
        }
        
        for(int i=0;i<lenS;i++){
            arr[s.charAt(i)-'a']++;
        }
        
        for(int i=0;i<lenT;i++){
            arr[t.charAt(i)-'a']--;
        }
        
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        
        return true;
    }
}