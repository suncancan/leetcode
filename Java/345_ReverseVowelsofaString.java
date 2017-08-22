/*
@author Cathy
@version 1.0
RunTime:12ms

��Ŀ��Reverse Vowels of a String(Difficulty: Easy)
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".

����˼·��
1��˫ָ�뷨
2�����ַ����洢��Сд��Ԫ���ַ�

ע�����
1��ע����ĸ�д�Сд
2��ע���ٽ���������ʱӦ������ѭ��
3������֪ʶ���ַ���ת�ַ����� char[] cc=s.toCharArray()���ַ�ת�ַ��� String.valueOf(c)���ַ������ַ��Ķ�λ s.indexOf(c)
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