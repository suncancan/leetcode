/*
@author Cathy
@version 1.0
RunTime:5ms

题目：Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?

解题思路：
1、本题关键是想解题思路，想到了解题思路，实现起来并不难。
2、思路：统计每个字符串的字符频率，判断对应字符频率是否相等。
3、考虑空间复杂度，对于第一个字符串频率计算用加法（count++），第二个字符串频率用减法（count--）。
*/
public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr=new int[26];
        int lenS=s.length();
        int lenT=t.length();
        
        if(lenS!=lenT){
            return false;
        }
        
        for(int i=0;i<lenS;i++){
            arr[s.charAt(i)-'a']++;
        }
        
        for(int i=0;i<lenT;i++){
            arr[t.charAt(i)-'a']--;
        }
        
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        
        return true;
    }
}