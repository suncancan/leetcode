/*
@author Cathy
@version 1.0
RunTime:11ms

题目：Isomorphic Strings(Difficulty: Easy)
Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.
Given "foo", "bar", return false.
Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.

解题思路：
借助两个数组来记录替换的结果。
*/
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null||s.length()==0){
            return true;
        }
        
        int[] m=new int[128];
        int[] n=new int[128];
        int len=s.length();
        
        for(int i=0;i<len;i++){
            if(m[s.charAt(i)]!=n[t.charAt(i)]){
                return false;
            }
           
            m[s.charAt(i)]=i+1;
            n[t.charAt(i)]=i+1;
        }
             
             return true;
    }
}