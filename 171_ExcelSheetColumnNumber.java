/*
@author Cathy
@version 1.0
RunTime:2ms

题目：Excel Sheet Column Number(Difficulty: Easy)
Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 

解题思路：
参考Excel Sheet Column Title。每个字母代表一个数字，字符-64得到字符代表的值，再乘基数为本位的值。
*/
public class Solution {
    public int titleToNumber(String s) {
        int num=0,base=1;
        int len=s.length();
        char c;
        
        for(int i=len-1;i>=0;i--){
            c=s.charAt(i);
            num=num+(c-64)*base; 
            base=base*26;
        }
        
        return num;
    }
}