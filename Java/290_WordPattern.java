/*
@author Cathy
@version 1.0
RunTime:2ms

��Ŀ��Word Pattern(Difficulty: Easy)
Given a pattern and a string str, find if str follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.

Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.

����˼·��
1�����ַ���ÿ���������ȶԣ����Ƿ����pattern����Ҫ�õ�HashMap
2�����ǳ��ȵ����⣬���ǵ����п��ܵ����
3��ע���õ�HashMapʱ��Character����char���͵�ת����charValue����������
*/

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        char c;
        Map<String,Character> map=new HashMap<String,Character>();
        String[] word=str.split(" ");
        int len=word.length;
        
        if(pattern.length()!=len){
            return false;
        }
        
        for(int i=0;i<len;i++){
            if(map.containsKey(word[i])){
                c=map.get(word[i]).charValue();
                if(c!=pattern.charAt(i)){
                    return false;
                }
            }else{
                if(map.containsValue(pattern.charAt(i))){
                    return false;
                }
                map.put(word[i],pattern.charAt(i));
            }
        }
        
        return true;
    }
}