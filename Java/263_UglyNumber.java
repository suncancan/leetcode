/*
@author Cathy
@version 1.0
RunTime:2ms

��Ŀ��Ugly Number(Difficulty: Easy)
Write a program to check whether a given number is an ugly number.
Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 
For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
Note that 1 is typically treated as an ugly number.

ע�����
Ҫ���ǵ������ĸ������������0��

����˼·��
����ѭ�������ж���û��2,3,5��Щ����
*/

public class Solution {
    public boolean isUgly(int num) {
        boolean result=false;
        
        for(int i=2;i<6&&num>0;i++){
            while(num%i==0){
                num=num/i;
            }
        }
        
        if(num==1){
            result=true;
        }
        
        return result;
    }
}