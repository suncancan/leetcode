/*
@author Cathy
@version 1.0
RunTime:1ms

��Ŀ��Factorial Trailing Zeroes(Difficulty: Easy)
Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.

����˼·��
��Ҫ�Ǽ����������5�ĸ�������0����2*5�õ��ģ�����2�ĸ�������5�ĸ�����������5�ĸ����Ϳ����ˡ���
*/
public class Solution {
    public int trailingZeroes(int n) {
        int num=0;
        
        while(n>0){
            n/=5;
            num+=n;
        }
        
        return num;
    }
}