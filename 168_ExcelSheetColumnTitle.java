/*
@author Cathy
@version 1.0
RunTime:0ms

题目：Excel Sheet Column Title(Difficulty: Easy)
Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 

解题思路：
这个属于找规律的问题。

注意事项：
1、找到准确的规律，这道题做了很长时间因为对于每一位的推导没有想清楚。
2、取余过程遇到26，余数为0。需要对被除数做-1操作。
*/
public class Solution {
    public String convertToTitle(int n) {
        String s="";
        int p=n,q;
        char c;
        
        while(p>0){
            q=(p-1)%26;
            p=(p-1)/26;
            c=(char)(q+'A');
            s=String.valueOf(c)+s;
        }
        
        return s;
        
    }
}