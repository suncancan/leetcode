/*
@author Cathy
@version 1.0
RunTime:40ms

题目：Count and Say(Difficulty: Easy)
The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.
Note: The sequence of integers will be represented as a string.

解题思路：
1、首先编写一个函数实现对指定字符串count and say的功能（遍历字符串的每个字符，记录count值，count和所count的字符拼接到s里）
2、指定初始化值，for循环调用上述函数。

注意事项：
1、对输入的判定；
2、变量的初始化；
3、循环次数；
4、循环结束后的操作；
5、返回值是啥（应该返回第序列第n个值，而不是整个序列）
*/
public class Solution {
    public String countAndSay(int n) {
        if(n<1){
            return "";
        }
       
        String s="1";
        
        for(int i=1;i<n;i++){
            s=convert(s);
        }
        
        return s;
    }
    
    public String convert(String n){
        String s="";
        int count=1;
        char temp=n.charAt(0);
        
        for(int i=1;i<n.length();i++){
           if(n.charAt(i)==temp){
               count++;
           }else{
               s=s+count+temp;
               count=1;
           }
           temp=n.charAt(i);
        }
        
        s=s+count+temp;
        return s;
        
    }
}
