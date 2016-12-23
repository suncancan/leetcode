/*
@author Cathy
@version 1.0
RunTime:2ms

题目：Remove Linked List Elements(Difficulty: Easy)

Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5

解题思路：
1、建立三个指针，cur当前指针，pre当前指针的前一个指针（初始化为ListNode pre=new ListNode(0);pre.next=head;），head2记录开始的位置（初始化head2=pre）
2、若当前val等于预期值，pre指向cur的next，cur=cur.next。
3、若当前val不等于预期值，pre=pre.next,cur=cur.next。
4、返回head2.next
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