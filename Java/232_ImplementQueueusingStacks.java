/*
@author Cathy
@version 1.0
RunTime:121ms

题目：Implement Queue using Stacks(Difficulty: Easy)

Implement the following operations of a queue using stacks.

push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.
Notes:
You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).

解题思路：
1、首先明确队列和栈的区别。本题关键在于进入队列、获取队列开头元素和弹出队列开头元素三个函数。调整进入队列函数的话，其他两个函数就可以正常运行啦。
2、由于新元素需要进入到栈底，所以栈中原有的所有元素需要出栈，需要新建一个栈用来存储弹出的元素。新元素入栈，原有元素入栈。这样队列的push方法就写好啦。
*/
public class MyQueue {

    Stack<Integer> s;
    
    /** Initialize your data structure here. */
    public MyQueue() {
       s=new Stack();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        Stack<Integer> temp=new Stack();
        
        while(!s.empty()){
            temp.push(s.pop());
        }
        
        s.push(x);
        
        while(!temp.empty()){
            s.push(temp.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return s.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return s.peek();                                            
    }
                  
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s.empty();
    }                 
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */