/*
@author Cathy
@version 1.0
题目：Palindrome Linked List
Given a singly linked list, determine if it is a palindrome.
Could you do it in O(n) time and O(1) space?
解题思路：
需要考虑时间复杂度O(n)和空间复杂度O(1)的要求。
1、首先用快慢指针法找到链表中间的节点（链表为奇数时，找到中间节点下一节点，链表为偶数时，找到后面那个中间节点）。
2、链表后半段反转。
3、比较前后半段链表的值。
注意事项：
1、第一次提交，出现空指针异常（操作链表前需要判空！！）
2、第二次提交，边界条件结果不对（空链表leetcode里面算回文）
3、第三次提交，超时（原本的设计是整体反转，整体判等）
4、第四次提交，算法设计出现问题（链表反转后，原链表首节点的next应该为空，否则反转后会出现环！！）
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
    public boolean isPalindrome(ListNode head) {
        //快慢指针法找中间节点;
        ListNode slow=head,fast=head;
       
        //链表若为空或只有一个节点，返回true;
        if(head==null||head.next==null){
            return true;
        }
        
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        //后半段反转;
        if(fast==null){
            slow=reverse(slow);
        }else{
            slow=slow.next;
            slow=reverse(slow);
        }
        
        while(slow!=null){
            if(head.val!=slow.val){
                return false;
            }
            head=head.next;
            slow=slow.next;
        }
        
        return true;
    }
        //反转链表方法;
        public ListNode reverse(ListNode head){
            
            if(head==null||head.next==null){
                return head;
            }
            
            ListNode pre=head,cur=head.next,next;
            while(cur!=null){
                next=cur.next;
                cur.next=pre;
                pre=cur;
                cur=next;
            }
            head.next=null;
            return pre;
        }
   
}