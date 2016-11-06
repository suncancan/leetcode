/*
@author Cathy
@version 1.0
��Ŀ��Palindrome Linked List
Given a singly linked list, determine if it is a palindrome.
Could you do it in O(n) time and O(1) space?
����˼·��
��Ҫ����ʱ�临�Ӷ�O(n)�Ϳռ临�Ӷ�O(1)��Ҫ��
1�������ÿ���ָ�뷨�ҵ������м�Ľڵ㣨����Ϊ����ʱ���ҵ��м�ڵ���һ�ڵ㣬����Ϊż��ʱ���ҵ������Ǹ��м�ڵ㣩��
2��������η�ת��
3���Ƚ�ǰ���������ֵ��
ע�����
1����һ���ύ�����ֿ�ָ���쳣����������ǰ��Ҫ�пգ�����
2���ڶ����ύ���߽�����������ԣ�������leetcode��������ģ�
3���������ύ����ʱ��ԭ������������巴ת�������еȣ�
4�����Ĵ��ύ���㷨��Ƴ������⣨����ת��ԭ�����׽ڵ��nextӦ��Ϊ�գ�����ת�����ֻ�������
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
        //����ָ�뷨���м�ڵ�;
        ListNode slow=head,fast=head;
       
        //������Ϊ�ջ�ֻ��һ���ڵ㣬����true;
        if(head==null||head.next==null){
            return true;
        }
        
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        //���η�ת;
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
        //��ת������;
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