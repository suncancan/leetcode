/*
@author Cathy
@version 1.0
RunTime:2ms

��Ŀ��Remove Linked List Elements(Difficulty: Easy)

Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5

����˼·��
1����������ָ�룬cur��ǰָ�룬pre��ǰָ���ǰһ��ָ�루��ʼ��ΪListNode pre=new ListNode(0);pre.next=head;����head2��¼��ʼ��λ�ã���ʼ��head2=pre��
2������ǰval����Ԥ��ֵ��preָ��cur��next��cur=cur.next��
3������ǰval������Ԥ��ֵ��pre=pre.next,cur=cur.next��
4������head2.next
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre=new ListNode(0);
        pre.next=head;
        ListNode cur=head;
        ListNode head2=pre;
  
        while(cur!=null){
            if(cur.val==val){
                pre.next=cur.next;
                cur=cur.next;
            }else{
                pre=pre.next;
                cur=cur.next;
            }
        }
        
        return head2.next;
    }
}