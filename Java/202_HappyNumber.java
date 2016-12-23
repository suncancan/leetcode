/*
@author Cathy
@version 1.0
RunTime:4ms

题目：Happy Number(Difficulty: Easy)

Write an algorithm to determine if a number is "happy".
A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, 
and repeat the process until the number equals 1 (where it will stay), 
or it loops endlessly in a cycle which does not include 1. 
Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

解题思路：
1、首先写一个私有函数，输入为原数据，输出为计算之后的数据。
2、每次计算的结果保存在一个HashSet里面。若此次计算的值为1，输出true，若不为1，且之前没有出现过，循环。若不为1，且之前出现过，输出false。
*/
public class Solution {
    public boolean isHappy(int n) {
       HashSet hs=new HashSet<Integer>();
       int val=getNum(n),temp;
       
       while(hs.add(val)){
           if(val==1){
               return true;
           }
           
           temp=getNum(val);
           val=temp;
       }
       
       return false;
    }
    
    private int getNum(int n){
        int result=0,val;
        
        if(n<10){
            return n*n;
        }
        
        while(n>0){
            val=n%10;
            result+=val*val;
            n/=10;
        }
        
        return result;
    }
}