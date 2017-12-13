/*
@author Cathy
@version 1.0

Time：O(n！)   why?
Space:O(2^N)  

题目：Generate Parentheses(Difficulty: Medium)
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]

解题思路 ：
属于发散性的dp问题，递归解决

*/

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ls=new ArrayList<String>();
        getResult(ls,"",0,0,n);
        return ls;
   }
    
    public void getResult(List<String> ls,String s,int left,int right,int max){
        if(s.length()==max*2){
            ls.add(s);
            return;
        }
        if(left<max){
            getResult(ls,s+"(",left+1,right,max);
        }
        if(right<left){
            getResult(ls,s+")",left,right+1,max);
        }
    }
}