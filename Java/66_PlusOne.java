/*
@author Cathy
@version 1.0
RunTime:1 ms

题目：Plus One(Difficulty: Easy)
Given a non-negative number represented as an array of digits, plus one to the number.
The digits are stored such that the most significant digit is at the head of the list.

解题关键思路：
1、输入数组长度为len，建立两个数组，一个数组temp长度为len，另外一个数组result长度为len+1。
2、若输入数组末位不为9，temp最后一个元素+1，返回temp。
3、若输入数组末位为9，进位count为1，temp对应对置为0，依次进行判断。
4、若digits各位均为9，result第一位置为1，返回result。
*/
public class Solution {
    public int[] plusOne(int[] digits) {
        if(digits==null||digits.length==0){
            return new int[0];
        }
        
        int[] temp=digits;
        int len=digits.length;
        int[] result=new int[len+1];
        int count=0;
        
        if(digits[len-1]==9){
            temp[len-1]=0;
            count=1;
        }else{
            temp[len-1]=digits[len-1]+1;
            return temp;
        }
        
        for(int i=digits.length-2;len>1&&i>=0;i--){
            if(digits[i]==9){
                temp[i]=0;
                count=1;
            }else{
                temp[i]=digits[i]+1;
                count=0;
                return temp;
            }
        }
        
        if(count==1){
            result[0]=1;
        }
        return result; 
    }
}