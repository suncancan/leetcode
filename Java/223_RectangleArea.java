/*
@author Cathy
@version 1.0
RunTime:94ms

题目：Implement Stack using Queues(Difficulty: Easy)
Description:

Implement the following operations of a stack using queues.
push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
Notes:
You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).

解题思路：
关键在于把push进的元素放到队列的头，这样pop()和top()方法可以用队列的函数（poll()、peek()）直接得到。

注意事项：
1、成员变量和局部变量。
2、边界条件，push()方法里面需要把原有的元素依次加到队列尾。
3、注意函数是否有返回值。
*/
class MyStack {
    Queue<Integer> s;
    
    public MyStack(){
       s=new LinkedList<Integer>();
    }
    // Push element x onto stack.
    public void push(int x) {
        s.add(x);
        
        int len=s.size()-1;
        while(len>0){
            s.add(s.poll());
            len--;
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        s.poll();
    }

    // Get the top element.
    public int top() {
        return s.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        if(s.size()==0){
            return true;
        }
        return false;
    }
}
