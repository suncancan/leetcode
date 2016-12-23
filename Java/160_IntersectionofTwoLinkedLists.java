/*
@author Cathy
@version 1.0
RunTime:2ms

��Ŀ��Intersection of Two Linked Lists(Difficulty: Easy)
Write a program to find the node at which the intersection of two singly linked lists begins.

For example, the following two linked lists:

A:          a1 �� a2
                   �K
                     c1 �� c2 �� c3
                   �J            
B:     b1 �� b2 �� b3
begin to intersect at node c1.

Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.

����˼·��
1���пգ�����һ������Ϊ�գ�����null��
2���������������Ϊ�գ��ֱ�������������õ���������ĳ���lenA��lenB��
3��������������|lenA-lenB|����
4��ͬʱ����������ȣ����ظýڵ㣬��û����ȵĵط����򷵻�null��
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        
        int lenA=0,lenB=0,l;
        ListNode ls1=headA;
        ListNode ls2=headB;
        
        while(ls1!=null){
            lenA++;
            ls1=ls1.next;
        }
        
         while(ls2!=null){
            lenB++;
            ls2=ls2.next;
        }
        
        ls1=headA;
        ls2=headB;
        
        if(lenB>=lenA){
            for(int i=0;i<lenB-lenA;i++){
                ls2=ls2.next;
            }
        }
        
        if(lenB<lenA){
            for(int i=0;i<lenA-lenB;i++){
                ls1=ls1.next;
            }
        }
        
        while(ls2!=null){
            if(ls2==ls1){
                return ls2;
            }
            ls2=ls2.next;
            ls1=ls1.next;
        }
        
        return null;
    }
}