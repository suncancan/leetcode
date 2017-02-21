/*
@author Cathy
@version 1.0
RunTime:2ms

��Ŀ��Power of Two(Difficulty: Easy)
Description:

Given an integer, write a function to determine if it is a power of two.

����˼·��
����λ���㣨&��>>�������λ��ʼ����ȡ��nÿһλ��ֵ���ж��Ƿ�Ϊ0����ֻʣ�����λʱ��ֹͣѭ����
*/
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }else if(n==1){
            return true;
        }
        
        int b;
        
        while(n!=1){
            b=n&1;
            
            if(b==1){
                return false;
            }
            
            n=n>>1;
        }
        
        return true;
    }
}