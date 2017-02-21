/*
@author Cathy
@version 1.0
RunTime:0ms

题目：Invert Binary Tree(Difficulty: Easy)
Description:

Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9

to
     4
   /   \
  7     2
 / \   / \
9   6 3   1

解题思路：
运用递归，找到结束条件和递归的关系。

注意事项：
结束条件里面的表达式不要太多，会影响时间复杂度。
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
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        
        TreeNode temp=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(temp);
        
        return root;
    }
}