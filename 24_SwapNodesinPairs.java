/*
@author Cathy
@version 1.0

题目：Swap Nodes in Pairs
Given a linked list, swap every two adjacent nodes and return its head.
For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.
Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

解题思路：
1、链表长度小于2，直接返回。
2、初始化ls，判断后面节点对是否完整，完整则交换顺序，每次循环的最后记录本节点对的后一个节点。
3、返回head。

注意事项：
逻辑要清楚。ls初始化很重要。
*/