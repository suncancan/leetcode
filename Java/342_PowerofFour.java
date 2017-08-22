/*
@author Cathy
@version 1.0
RunTime:2ms

��Ŀ��Power of Four(Difficulty: Easy)
Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.

Follow up: Could you solve it without loops/recursion?

����˼·��
1������1 ѭ����
2������2 Integer.toString(n,3)ת���ַ�����Ȼ��������ƥ��
3������3 ��log����
*/

class Solution {
    public boolean isPowerOfFour(int num) {
        return (num>0 &&(Math.log10(num)/Math.log10(4))%1==0);
    }
}