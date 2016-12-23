/*
@author Cathy
@version 1.0
RunTime:1ms

��Ŀ��Remove Duplicates from Sorted List(Difficulty: Easy)
Given a sorted linked list, delete all duplicates such that each element appear only once.
For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.

����˼·��
����������Ҫ������һ�ڵ�temp��

ע�����
��ֵ���ж���
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