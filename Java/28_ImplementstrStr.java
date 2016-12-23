/*
@author Cathy
@version 1.0
RunTime:28ms

题目：Implement strStr()(Difficulty: Easy)
Implement strStr().
Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

解题思路：
1、首先判空。
2、比较两个字符串长度。若haystack小，return-1。
3、needle在haystack前、中、末尾三种情况进行考虑。中间的判断用split()方法。

注意事项：
用例！！！考虑用例！！needle在haystack前、中、末尾三种情况进行考虑。
*/
public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack==null||needle==null){
            return -1;
        }
        
        if(needle.length()==0){
            return 0;
        }
        
        if(haystack.length()<needle.length()){
            return -1;
        }
        
        if(haystack.substring(0,needle.length()).equals(needle)){
            return 0;
        }
        
        if(haystack.substring(haystack.length()-needle.length()).equals(needle)){
            return haystack.length()-needle.length(); 
        }
        
        String[] s=haystack.split(needle);
        
        if(s.length<=1){
            return -1;
        }else{
            return s[0].length(); 
        }
    }
}
