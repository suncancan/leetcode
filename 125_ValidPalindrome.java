/*
@author Cathy
@version 1.0
RunTime:10ms

��Ŀ��Valid Palindrome(Difficulty: Easy)
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.

����˼·��
1��˫ָ�룬i��ǰ��������j�Ӻ���ǰ������ֹͣ������i>j��
2������ָ����һ����Ӧ��Ϊ���֣�ֱ���ж�������ֵ��
3������ָ��ȫ����Ӧ��ĸ������Ҫ�üӼ�32�ж�ֵ�Ƿ���ȡ�

ע�����
alphanumericָ������ĸ������~~
*/
public class Solution {
    public boolean isPalindrome(String s) {
        if(s==null||s.length()==0){
            return true;
        }
        
        int len=s.length();
        int j=len-1;
        
        for(int i=0;i<j;i++){
            if((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122)||(s.charAt(i)>=48&&s.charAt(i)<=57)){
                while(!((s.charAt(j)>=65&&s.charAt(j)<=90)||(s.charAt(j)>=97&&s.charAt(j)<=122)||(s.charAt(j)>=48&&s.charAt(j)<=57))){
                    j--;
                }
                if((s.charAt(i)>=48&&s.charAt(i)<=57)||(s.charAt(j)>=48&&s.charAt(j)<=57)){
                    if(s.charAt(i)!=s.charAt(j)){
                        return false;
                    }else{
                        j--;
                        continue;
                    }
                }
                if(s.charAt(i)!=s.charAt(j)&&s.charAt(i)!=(s.charAt(j)+32)&&s.charAt(i)!=(s.charAt(j)-32)){
                    return false;
                }else{
                    j--;
                }
            }else{
                continue;
            }
        }
        
        return true;
        
    }
}