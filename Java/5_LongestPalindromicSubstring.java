/*
@author Cathy
@version 1.0

RunTime:19ms
Time：O(n²)
Space:O(1)

题目：Longest Palindromic Substring(Difficulty: Medium)
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.

解题思路：
1、遍历字符串，每个位置作为中心向左右查找，得到当前的最大子串
2、用start、end两个变量记录始末位置，每次进行更新

注意事项：
需要考虑奇偶问题
*/

class Solution {
    public String longestPalindrome(String s) {
        if (s==null || s.length()==0 ||s.length()==1){
            return s;
        }
        int lens=s.length();
        int start=0,end=0;
        int len1,len2,lenM=0;
        
        for(int i=0;i<lens;i++){
            len1=getSubFromCenter(s,i,i);
            len2=getSubFromCenter(s,i,i+1);
            lenM=Math.max(len1,len2);
            if(lenM>(end-start+1)){
                start=i-(lenM-1)/2;
                end=i+lenM/2;
            }
        }
        return s.substring(start,end+1);
    }
    
    public int getSubFromCenter(String s,int c1,int c2){
        int lenM=0;
        while(c1>=0 && c2<s.length() && s.charAt(c1)==s.charAt(c2)){
            lenM=c2-c1+1;
            c1--;
            c2++;
        }
        return lenM;
    }
}