/*
@author Cathy
@version 1.0

��Ŀ��Delete Node in a Linked List
Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.

����˼·��
1����һ���ڵ��ֵ������ǰ�ڵ㣬��ǰ�ڵ�ָ�����¸��ڵ㡣
2��ɾ����ǰ�ڵ����һ�ڵ㡣
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
    public void deleteNode(ListNode node) {
        ListNode ln=node.next;
        node.val=node.next.val;
        node.next=node.next.next;
        ln=null;
    }
}