/*
@author Cathy
@version 1.0

题目：Remove Nth Node From End of List
Given a linked list, remove the nth node from the end of list and return its head.
Note:
Given n will always be valid.
Try to do this in one pass.

解题思路：
1、快慢指针法，首先快指针先走N步。（慢指针是要删除节点的前一节点）
2、若快指针为null，则要删除节点为首节点，head=head.next，返回head即可;快指针若不为空则继续3.
3、快指针走到最后一个节点，若慢指针的后两个节点为空，则要删除节点为尾节点，slow.next=null，返回head即可。若慢指针的后两个节点不为空，继续4.
4、慢指针指向后两个节点，返回head。

注意事项：
一定要考虑用例（特殊情况，要删除的节点为第一个和最后一个）
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head,slow=head;
        
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        
        if(fast==null){
            head=head.next;
            return head;
        }
        
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        
        if(slow.next.next!=null){
            slow.next=slow.next.next;
        }else{
            slow.next=null;
        }
        return head;
    }
}