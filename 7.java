/*
@author Cathy
@version 1.0

题目：
Reverse digits of an integer.
Example1: x = 123, return 321
Example2: x = -123, return -321

总结：
1、考虑特殊情况，比如负数、末位为0、数据溢出等。
2、编码时对待循环等设计思路必须特别清楚，数据处理要考虑到特殊情况。
*/
public class Solution {
    public int reverse(int x) {
        
        int q=1,temp=x;  //记录正负、预处理结果
        long result=0l;  //记录反转结果
        
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