/*
@author Cathy
@version 1.0
RunTime:1ms

题目：Remove Duplicates from Sorted List(Difficulty: Easy)
Given a sorted linked list, delete all duplicates such that each element appear only once.
For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.

解题思路：
遍历链表，需要储存上一节点temp。

注意事项：
空值的判定。
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        
        ListNode temp=head;
        ListNode position=head.next;
        
        while(position!=null){
            if(position.val==temp.val){
                temp.next=position.next;
                position=position.next;
            }else{
                temp=temp.next;
                position=position.next;
            }
        }
        
        return head;
    }
}