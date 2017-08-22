/*
@author Cathy
@version 1.0
RunTime:12ms

题目：Reverse Vowels of a String(Difficulty: Easy)
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".

解题思路：
1、双指针法
2、用字符串存储大小写的元音字符

注意事项：
1、注意字母有大小写
2、注意临界条件，何时应该跳出循环
3、基础知识：字符串转字符数组 char[] cc=s.toCharArray()；字符转字符串 String.valueOf(c)；字符串中字符的定位 s.indexOf(c)
*/

class Solution {
    public String reverseVowels(String s) {
        char[] charArray=s.toCharArray();
        int len=s.length();
        String vowels="AEIOUaeiou";
        int pos=len-1;
        int sta=1;
        char c;
        
        for(int i=0;i<len;i++){
            if(sta==0){
                break;
            }
            if (vowels.indexOf(String.valueOf(charArray[i]))!=-1){
                for(int j=pos;j>0;j--){
                    if(j<=i){
                        sta=0;
                        break;
                    }
                    
                    if(vowels.indexOf(String.valueOf(charArray[j]))!=-1){
                        c=charArray[i];
                        charArray[i]=charArray[j];
                        charArray[j]=c;
                        pos=j-1;
                        break;
                    }
                    
                }
            }
        }
        
        return String.valueOf(charArray);
    }
}