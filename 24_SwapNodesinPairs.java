/*
@author Cathy
@version 1.0

��Ŀ��Swap Nodes in Pairs
Given a linked list, swap every two adjacent nodes and return its head.
For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.
Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

����˼·��
1��������С��2��ֱ�ӷ��ء�
2����ʼ��ls���жϺ���ڵ���Ƿ������������򽻻�˳��ÿ��ѭ��������¼���ڵ�Եĺ�һ���ڵ㡣
3������head��

ע�����
�߼�Ҫ�����ls��ʼ������Ҫ��
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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        
        ListNode ls=new ListNode(0);
        ls.next=head;
        ListNode temp,temp2;
        head=head.next;
        
        
        while(ls.next!=null&&ls.next.next!=null){
            temp=ls.next;
            temp2=ls.next.next.next;
            
            ls.next=ls.next.next;
            ls.next.next=temp;
            temp.next=temp2;
            ls=ls.next.next;
        }
        
        return head;
    }
}