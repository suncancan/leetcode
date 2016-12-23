/*
@author Cathy
@version 1.0
RunTime:1 ms

��Ŀ��Plus One(Difficulty: Easy)
Given a non-negative number represented as an array of digits, plus one to the number.
The digits are stored such that the most significant digit is at the head of the list.

����ؼ�˼·��
1���������鳤��Ϊlen�������������飬һ������temp����Ϊlen������һ������result����Ϊlen+1��
2������������ĩλ��Ϊ9��temp���һ��Ԫ��+1������temp��
3������������ĩλΪ9����λcountΪ1��temp��Ӧ����Ϊ0�����ν����жϡ�
4����digits��λ��Ϊ9��result��һλ��Ϊ1������result��
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