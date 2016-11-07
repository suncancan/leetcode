/*
@author Cathy
@version 1.0

题目：Path Sum
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

解题思路：
1、采用递归。若当前节点不是叶子节点，递归，sum为sum减去当前value；若当前节点为叶子节点，当前值与sum进行比较，若相等，则返回true。
2、最后一句返回false（因为之前没有匹配，没有通过true返回）
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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        
        if(root.left==null&&root.right==null&&root.val==sum){
                return true;
        }
        
        if(root.left!=null||root.right!=null){
            return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
        }
        
        return false;
    }
}