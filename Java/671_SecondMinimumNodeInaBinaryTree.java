/*
@author Cathy
@version 1.0

Time：O(N)   N代表节点的个数 每个节点最多遍历一次
Space:O(N)   与树的高度有关        

题目：Second Minimum Node In a Binary Tree(Difficulty: Easy)
Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node in this tree has exactly two or zero sub-node. 
If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes.
Given such a binary tree, you need to output the second minimum value in the set made of all the nodes' value in the whole tree.
If no such second minimum value exists, output -1 instead.

Example 1:
Input: 
    2
   / \
  2   5
     / \
    5   7

Output: 5
Explanation: The smallest value is 2, the second smallest value is 5.

Example 2:
Input: 
    2
   / \
  2   2

Output: -1
Explanation: The smallest value is 2, but there isn't any second smallest value.

解题思路 ：
1、深度优先遍历

注意事项：
递归的程序尽可能简单 所以每次对root.val进行判断 而不是对root.left.val & root.right.val进行判断
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int sec;
    
    public int findSecondMinimumValue(TreeNode root) {    
        sec=root.val;
        getNum(root,root.val);
        return (sec==root.val)?-1:sec;
    }
    
    public void getNum(TreeNode root,int val){
        if(root!=null){
            if(root.val>val){
                if(root.val<sec ||val==sec){
                    sec=root.val;
                }
            }else{
                getNum(root.left,val);
                getNum(root.right,val);
            }
        }    
    }
}