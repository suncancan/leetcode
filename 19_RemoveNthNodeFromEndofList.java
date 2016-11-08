/*
@author Cathy
@version 1.0

��Ŀ��Remove Nth Node From End of List
Given a linked list, remove the nth node from the end of list and return its head.
Note:
Given n will always be valid.
Try to do this in one pass.

����˼·��
1������ָ�뷨�����ȿ�ָ������N��������ָ����Ҫɾ���ڵ��ǰһ�ڵ㣩
2������ָ��Ϊnull����Ҫɾ���ڵ�Ϊ�׽ڵ㣬head=head.next������head����;��ָ������Ϊ�������3.
3����ָ���ߵ����һ���ڵ㣬����ָ��ĺ������ڵ�Ϊ�գ���Ҫɾ���ڵ�Ϊβ�ڵ㣬slow.next=null������head���ɡ�����ָ��ĺ������ڵ㲻Ϊ�գ�����4.
4����ָ��ָ��������ڵ㣬����head��

ע�����
һ��Ҫ�������������������Ҫɾ���Ľڵ�Ϊ��һ�������һ����
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