/*
@author Cathy
@version 1.0

��Ŀ��Valid Parentheses
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

����˼·��
����ջ����
1�����Ƚ��г�ʼ�жϣ����ַ���Ϊ�ջ��߳���С��2������false��
2�����ַ�����ÿ���ַ����б�������������ջ�������ŵĻ���Ҫ�жϣ�ջΪ�շ���false����ջ��Ԫ�ز�ƥ�䷵��false��
3������������ջ��Ϊ�գ�����false
4����󷵻�true����ʾǰ��û��return false��

ע�����
1��else if����ǵü�����
2�������еı������βε����Ʋ�����ͬ
3���߼�һ��Ҫ�����
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