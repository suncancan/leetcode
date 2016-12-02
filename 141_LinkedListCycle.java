/*
@author Cathy
@version 1.0
RunTime:1ms

题目：Linked List Cycle(Difficulty: Easy)
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?

解题思路：
快慢指针法

注意事项：
循环语句内部赋值和判断的顺序
*/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(fast==slow){
                return true;
            }
        }
        
        return false;
    }
}
