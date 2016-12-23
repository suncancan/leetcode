/*
@author Cathy
@version 1.0
RunTime:2ms

��Ŀ��Number of 1 Bits(Difficulty: Easy)
Write a function that takes an unsigned integer and returns the number of ��1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ��11' has binary representation 00000000000000000000000000001011, so the function should return 3.

����˼·��
λ���㡣��n�����޷������ƣ�ȡ��ÿһλ���ж���Ϊ1��count++��

ע�����
if(n&1==1)�����ǲ��еġ���Ϊ==�����ȼ�����&��Ӧ��Ϊif((n&1)==1)
*/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        
        for(int i=0;i<31;i++){
            if((n&1)==1){
                count++;
            }
            
            n>>>=1;
        }
        
        if((n&1)==1){
            count++;
        }
        
        return count;
    }
}