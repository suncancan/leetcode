/*
@author Cathy
@version 1.0
��Ŀ��Roman to Integer
Given a roman numeral, convert it to an integer.
Input is guaranteed to be within the range from 1 to 3999.
����˼·��
1���г����п��ܳ��ֵ��ַ���ÿ���ַ�����һ����ֵ(����1,10,100���������Ų�ȷ����)
2���ж����š���������ַ�������¼��ǰ�ַ���ǰһ����������˳���ַ���ֵ������ǰ�ַ�ֵΪ1,10,100�е�һ�����ұ�ǰһ����������˳���ַ�ֵС��ֵΪ�����������Ϊ����
3����͡�
ע�����
1����ϸ����������Ҫ��ʼ�����ж�������==�����ǡ�=��
2��case����Ϊ�������ʽ��final�ַ������鲻�У�WHY����final char[] c={'I','V','X','L','C','D','M'};case c[0]��XX;break;�����ˣ�
*/
public class Solution {
    public int romanToInt(String s) {
        int result=0,n=0,res=0;//resultΪÿ��ѭ����ļ�������nΪ��ǰ������ֵ��resΪѭ����ǰһ��������ֵ
        
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I':
                   n=1; 
                   break;
                case 'V':
                    n=5;
                    break;
                case 'X':
                    n=10;
                    break;
                case 'L':
                    n=50;
                    break;
                case 'C':
                    n=100;
                    break;
                case 'D':
                    n=500;
                    break;
                case 'M':
                    n=1000;
                    break;
            }
            if(n==5||n==50||n==500||n==1000){
                res=n;
                result+=n;
            }
           else{
                if(n<res){
                    result+=n*(-1);
                }
                else{
                    result+=n;
                }
                res=n;
            }
        }
        return result;
        
    }
}