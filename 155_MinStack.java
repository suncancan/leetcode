/*
@author Cathy
@version 1.0
RunTime:208ms\108ms

题目：MinStack(Difficulty: Easy)
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.

Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.

解题思路：
1、方法一 运用ArrayList实现各个功能（耗时很长，可能和用例中getMin方法调用的次数有关，getMin方法调用次数太多了~）
2、利用Stack实现各个功能，构造两个Stack，分别记录所有值和最小值。

注意事项：
对于引用数据类型，判断值是否相等要用equals而不是==。st.peek().equals(minSt.peek())。
*/

//The first solution
public class MinStack {
    private ArrayList<Integer> ls;
    /** initialize your data structure here. */
    public MinStack() {
        ls=new ArrayList<Integer>();
    }
    
    public void push(int x) {
        ls.add(0,x);
    }
    
    public void pop() {
        ls.remove(0);
    }
    
    public int top() {
        return ls.get(0);
    }
    
    public int getMin() {
        int min=ls.get(0);
        
        for(int i=0;i<ls.size();i++){
            if(ls.get(i)<min){
                min=ls.get(i);
            }
        }
        
        return min;
    }
}

//the second solution
public class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> minSt;
    /** initialize your data structure here. */
    public MinStack() {
        st=new Stack<Integer>();
        minSt=new Stack<Integer>();
    }
    
    public void push(int x) {
        if(minSt.size()==0||x<=minSt.peek()){
            minSt.push(x);
        }
        st.push(x);
    }
    
    public void pop() {
        if(st.peek().equals(minSt.peek())){
            minSt.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();   
 * int param_4 = obj.getMin();
 */