/*
@author Cathy
@version 1.0
RunTime:7ms

��Ŀ��Length of Last Word(Difficulty: Easy)
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
If the last word does not exist, return 0.
Note: A word is defined as a character sequence consists of non-space characters only.
For example, 
Given s = "Hello World",
return 5.

����˼·��
�������split������

ע�����
��ֵ���ж�
*/
public class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        
        String[] ss=s.split(" ");
        if(ss.length>0){
            return ss[ss.length-1].length();
        }else{
            return 0;
        }
    }
}
