/*
@author Cathy
@version 1.0
RunTime:20ms

��Ŀ��Power of Three(Difficulty: Easy)
Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?

����˼·��
1������1 ѭ����
2������2 Integer.toString(n,3)ת���ַ�����Ȼ��������ƥ��
3������3 ��log����
*/

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        
        return (Math.log10(n)/Math.log10(3))%1==0;
    }
}