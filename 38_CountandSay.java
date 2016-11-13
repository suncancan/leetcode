/*
@author Cathy
@version 1.0
RunTime:40ms

��Ŀ��Count and Say(Difficulty: Easy)
The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.
Note: The sequence of integers will be represented as a string.

����˼·��
1�����ȱ�дһ������ʵ�ֶ�ָ���ַ���count and say�Ĺ��ܣ������ַ�����ÿ���ַ�����¼countֵ��count����count���ַ�ƴ�ӵ�s�
2��ָ����ʼ��ֵ��forѭ����������������

ע�����
1����������ж���
2�������ĳ�ʼ����
3��ѭ��������
4��ѭ��������Ĳ�����
5������ֵ��ɶ��Ӧ�÷��ص����е�n��ֵ���������������У�
*/
public class Solution {
    public String countAndSay(int n) {
        if(n<1){
            return "";
        }
       
        String s="1";
        
        for(int i=1;i<n;i++){
            s=convert(s);
        }
        
        return s;
    }
    
    public String convert(String n){
        String s="";
        int count=1;
        char temp=n.charAt(0);
        
        for(int i=1;i<n.length();i++){
           if(n.charAt(i)==temp){
               count++;
           }else{
               s=s+count+temp;
               count=1;
           }
           temp=n.charAt(i);
        }
        
        s=s+count+temp;
        return s;
        
    }
}
