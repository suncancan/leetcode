/*
@author Cathy
@version 1.0
RunTime:52ms

题目：Longest Substring Without Repeating Characters(Difficulty: Medium)
Given a string, find the length of the longest substring without repeating characters.
Examples:
Given "abcabcbb", the answer is "abc", which the length is 3.
Given "bbbbb", the answer is "b", with the length of 1.
Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

解题思路：
1、Map+双指针

注意事项；
1、边界条件和逻辑要想清楚
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null ||s.length()==0){
            return 0;
        }
        
        HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
        int max=0;
        int len=s.length();
        for(int left=0,right=0;right<len;right++){
            char c=s.charAt(right);
            if(hs.containsKey(c)){
                left=Math.max(left,hs.get(c)+1);
            }
            hs.put(c,right);
            max=Math.max(max,right-left+1);
        }
        
        return max;
    }
}