/*
@author Cathy
@version 1.0
RunTime:2ms

题目：Compare Version Numbers(Difficulty: Easy)
Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37

解题思路：
分割字符串，每个部分分别比较。

注意事项：
1、split中+，-，*，/，^，[,],(,),.,$,|,\需要转义。
2、注意字符串中没有"."的情况。
3、注意字符串中有一个以上"."的情况。
*/
public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
       
        int len1=v1.length;
        int len2=v2.length;
       
        int i=0;
        
        while(i<len1||i<len2){
            int x1=i<len1?Integer.parseInt(v1[i]):0;
            int x2=i<len2?Integer.parseInt(v2[i]):0;
            
            if(x1>x2){
                return 1;
            }
            
            if(x1<x2){
                return -1;
            }
            
            i++;
        }
        
        return 0;
        
    } 
}