/*
@author Cathy
@version 1.0

��Ŀ��
Reverse digits of an integer.
Example1: x = 123, return 321
Example2: x = -123, return -321

�ܽ᣺
1������������������縺����ĩλΪ0����������ȡ�
2������ʱ�Դ�ѭ�������˼·�����ر���������ݴ���Ҫ���ǵ����������
*/
public class Solution {
    public int reverse(int x) {
        
        int q=1,temp=x;  //��¼������Ԥ������
        long result=0l;  //��¼��ת���
        
        if(x==-0x80000000){
            return 0;
        }
        
        if(x<0){
            temp=x*(-1);
            q=-1;
        }
        
        while((temp/10!=0)&&(temp%10==0)){
            temp=temp/10;
            if(temp%10!=0){
                break;
            }
        }
        
        while(temp/10!=0){
            result=result*10+temp%10;
            temp=temp/10;
        }
        
        result=(result*10+temp)*q;
        
        if((result>0x7fffffff)||(result<-0x80000000)){
            return 0;
        }
        
        return (int)result;
    }
}