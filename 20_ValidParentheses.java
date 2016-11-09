/*
@author Cathy
@version 1.0

题目：Valid Parentheses
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

解题思路：
利用栈解题
1、首先进行初始判断，若字符串为空或者长度小于2，返回false。
2、对字符串中每个字符进行遍历。左括号入栈。右括号的话需要判断（栈为空返回false，与栈顶元素不匹配返回false）
3、遍历结束，栈不为空，返回false
4、最后返回true，表示前面没有return false。

注意事项：
1、else if后面记得加条件
2、方法中的变量和形参的名称不能相同
3、逻辑一定要清楚。
*/
public boolean isValid(String s) {
	        if(s==null||s.length()==0||s.length()==1){
	            return false;
	        }
	        
	        Stack<Character> st=new Stack<Character>();
	        char top,val;
	 
	        for(int i=0;i<s.length();i++){
	            val=s.charAt(i);
	            if(val=='('||val=='['||val=='{'){
	                st.push(val);
	            }else{
	                if(st.size()==0){
	                    return false;
	                }else{
	                    top=st.pop();
	                    if(val==')'&&top!='('){
	                        return false;
	                    }
	                    if(val==']'&&top!='['){
	                        return false;
	                    }
	                    if(val=='}'&&top!='{'){
	                        return false;
	                    }
	                }
	            }
	        }
	        if(st.size()!=0){
	            return false;
	        }
	        
	        return true;
	    }