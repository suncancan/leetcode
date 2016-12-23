/*
@author Cathy
@version 1.0

��Ŀ��Palindrome Number
Determine whether an integer is a palindrome. Do this without extra space.

����˼·��
1���������ǻ�������һλ����Ϊ����������λ������������Ҫ��һ���ж�
2��������Ҫ�ҵ����λ���ó���ȡ���������ȡ����Ӧ��λ���ж��Ƿ���ȡ�
3��ȡ���ȡ���֣�ʣ��δ�жϵĲ��֡���ǰ������0��¼���ˣ���Ҫ��base�жϣ���ѭ������ֹ������ʣ�²���>0��ע����>0Ŷ��������

ע�����
Ҫ�뵽�������������ǰ����0�������ύǰ�Լ�˼������������
*/
public class Solution {
    public boolean isPalindrome(int x) {
        int base=10,front,end;
        
        if(x<0){
            return false;
        }else if(x<10){
            return true;
        }
        
        for(;x/base>=10;base*=10){}
        
        for(;x>0;base/=100){
            front=x/base;
            end=x%10;
            
            if(front!=end){
                return false;
            }
            
            x-=front*base;
            x/=10;
        }
        return true;
    }
}