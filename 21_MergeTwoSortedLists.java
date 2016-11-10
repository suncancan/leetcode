/*
@author Cathy
@version 1.0

题目：Merge Two Sorted Lists
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

解题思路：
1、若两个节点都不为空，找出当前值最小的节点，结果链表指针指向此节点，最小节点指针后移一位，结果链表指针后移一位，直到其中一个节点为空
2、结果链表指针指向为空输入节点。
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode ln=head;
        
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                ln.next=l1;
                l1=l1.next;
            }else{
                ln.next=l2;
                l2=l2.next;
            }
            ln=ln.next;
        }
        
        if(l1!=null){
            ln.next=l1;
        }
        
        if(l2!=null){
            ln.next=l2;
        }
        
        return head.next;
    }
}