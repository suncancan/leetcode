/*
@author Cathy
@version 1.0

RunTime:14ms
Time：O(n)   节点的个数
Space:O(H)   树的高度  why？

题目：Longest Univalue Path(Difficulty: Easy)
Given a binary tree, find the length of the longest path where each node in the path has the same value. This path may or may not pass through the root.
Note: The length of path between two nodes is represented by the number of edges between them.

Example 1:
Input:

              5
             / \
            4   5
           / \   \
          1   1   5
Output:
2

Example 2:
Input:

              1
             / \
            4   5
           / \   \
          4   4   5
Output:
2

Note: The given binary tree has not more than 10000 nodes. The height of the tree is not more than 1000.

解题思路：
1、深度优先遍历

注意事项：
注意题目要求  path可以包括左&右节点  但是path是单向串通的
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
    int ans=0;
    public int longestUnivaluePath(TreeNode root) {
        getMaxPath(root);
        return ans;
    }
    
    public int getMaxPath(TreeNode root){
        if (root==null){
            return 0;
        }
        
        int left=getMaxPath(root.left);
        int right=getMaxPath(root.right);
        int left2=0,right2=0;
        if (root.left!=null && root.val==root.left.val){
            left2+=(left+1);
        }
        if (root.right!=null && root.val==root.right.val){
            right2+=(right+1);
        }
        
        ans=Math.max(ans,left2+right2);
        return Math.max(left2,right2);
    }
}