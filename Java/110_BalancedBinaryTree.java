/*
@author Cathy
@version 1.0
RunTime:2ms

题目：Balanced Binary Tree(Difficulty: Easy)
Given a binary tree, determine if it is height-balanced.
For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

解题思路：
1、深度优先算法遍历，运用递归。
2、从最底层节点开始判断，若不为平衡树，则返回-1，否则计算其深度，作为父节点判断深度的依据。
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
public class Solution {
    public boolean isBalanced(TreeNode root) {
   
        int result=getHeight(root);
        
        if(result==-1){
            return false;
        }
        
        return true;
    }
    
    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        
        int left,right;
        left=getHeight(root.left);
        right=getHeight(root.right);
        
        if(left==-1||right==-1||Math.abs(left-right)>1){
            return -1;
        }
        
        return Math.max(left,right)+1;
    }
}
