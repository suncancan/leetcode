/*
@author Cathy
@version 1.0
RunTime:0ms

��Ŀ��Reverse Linked List(Difficulty: Easy)
Description:

Reverse a singly linked list.

����˼·��
ÿ���ƶ�һλ��ǰ�棬ֱ��������������������Ԫ�ض�����

ע�����
�����Ҫ���弸������������ÿ���������������÷ֱ���ʲô��
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