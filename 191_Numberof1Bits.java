/*
@author Cathy
@version 1.0
RunTime:2ms

题目：Number of 1 Bits(Difficulty: Easy)
Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.

解题思路：
位运算。对n进行无符号右移，取出每一位。判断若为1，count++。

注意事项：
if(n&1==1)这样是不行的。因为==的优先级高于&，应改为if((n&1)==1)
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