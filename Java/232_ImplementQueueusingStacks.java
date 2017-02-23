/*
@author Cathy
@version 1.0
RunTime:121ms

��Ŀ��Implement Queue using Stacks(Difficulty: Easy)

Implement the following operations of a queue using stacks.

push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.
Notes:
You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).

����˼·��
1��������ȷ���к�ջ�����𡣱���ؼ����ڽ�����С���ȡ���п�ͷԪ�غ͵������п�ͷԪ����������������������к����Ļ����������������Ϳ���������������
2��������Ԫ����Ҫ���뵽ջ�ף�����ջ��ԭ�е�����Ԫ����Ҫ��ջ����Ҫ�½�һ��ջ�����洢������Ԫ�ء���Ԫ����ջ��ԭ��Ԫ����ջ���������е�push������д������
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