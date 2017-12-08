/*
@author Cathy
@version 1.0

RunTime:5ms
Time：O(n)
Space:O(N3^N)  对不对？   

题目：Letter Combinations of a Phone Number(Difficulty: Medium)
Given a digit string, return all possible letter combinations that the number could represent.
A mapping of digit to letters (just like on the telephone buttons) is given below.

Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

Note:
Although the above answer is in lexicographical order, your answer could be in any order you want.

解题思路 ：
1、FIFO  利用LinkedList的队列功能，插入和删除节点

注意事项：
1、字符串需要用双引号包围
*/

class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ls=new LinkedList<String>();
        if (digits==null || digits.length()==0){
            return ls;
        }
        
        String[] hs={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; 
        ls.add("");
        
        int lenD=digits.length();
        char c;
        String s;
        for(int i=0;i<lenD;i++){
            c=digits.charAt(i);
            while(ls.peek().length()==i){
                s=ls.poll();
                for(char cc:hs[Character.getNumericValue(c)].toCharArray()){
                    ls.add(s+cc);
                }
            }       
        }
        
        return ls;
        
    }
}
