/*
@author Cathy
@version 1.0
RunTime:0ms

题目：Reverse Linked List(Difficulty: Easy)
Description:

Reverse a singly linked list.

解题思路：
每次移动一位到前面，直到遍历完整个链表，所有元素都倒序。

注意事项：
想清楚要定义几个辅助变量，每个辅助变量的作用分别是什么。
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        
        ListNode ls=head;
        ListNode ls2;
        
        while(head.next!=null){
            ls2=head.next;
            head.next=ls2.next;
            ls2.next=ls;
            ls=ls2;
        }    
        
        return ls;
    }
}