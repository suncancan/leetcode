/*
@author Cathy
@version 1.0
RunTime:3ms

题目：Reverse Bits(Difficulty: Easy)
Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).

Follow up:
If this function is called many times, how would you optimize it?

Related problem: Reverse Integer

解题思路：
这道题需要运用位运算，取出每一位(n>>>=1 无符号右移)，再用位运算，还原倒序的数字（result+=n&1;result<<=1;）。

注意事项：
不能用取余的方式找出每个二进制位。
因为题目中输入的是无符号整数，但是存储在int这个有符号的数据类型里。
比如输入0,在int里存储为10000000 00000000 00000000 00000000（在无符号整形里代表2的31次方），应该得到00000000 00000000 00000000 00000001，但是通过取余的方式得到的二进制表现形式为00000000 00000000 00000000 00000000
*/
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result=0;
        
        for(int i=0;i<31;i++){
            result+=n&1;
            result<<=1;
            n>>>=1;
        }
        result+=n;

        return result;
    }
}
