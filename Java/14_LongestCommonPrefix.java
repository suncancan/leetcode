/*
@author Cathy
@version 1.0

Time：O(S)   S是字符串数组中所有字符的个数
Space:O(1)    

题目：Longest Common Prefix(Difficulty: Easy)
Write a function to find the longest common prefix string amongst an array of strings.

解题思路 ：
1、每个位置进行遍历判断

注意事项：
逻辑问题 break只能跳出当前循环
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i=0;
        char c;
        if(strs==null || strs.length==0){
            return "";
        }
        int lenS=strs.length;
        while(true){
            if(strs[0].length()<=i){
                return strs[0].substring(0,i);
            }
            c=strs[0].charAt(i);
            for(int j=1;j<lenS;j++){
                if (strs[j].length()==i || strs[j].charAt(i)!=c){
                    return strs[0].substring(0,i);
                }
            }
            i++;
        }
    }
}