/*
@author Cathy
@version 1.0
RunTime:0ms

��Ŀ��Excel Sheet Column Title(Difficulty: Easy)
Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 

����˼·��
��������ҹ��ɵ����⡣

ע�����
1���ҵ�׼ȷ�Ĺ��ɣ���������˺ܳ�ʱ����Ϊ����ÿһλ���Ƶ�û���������
2��ȡ���������26������Ϊ0����Ҫ�Ա�������-1������
*/
public class Solution {
    public String convertToTitle(int n) {
        String s="";
        int p=n,q;
        char c;
        
        while(p>0){
            q=(p-1)%26;
            p=(p-1)/26;
            c=(char)(q+'A');
            s=String.valueOf(c)+s;
        }
        
        return s;
        
    }
}