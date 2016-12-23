/*
@author Cathy
@version 1.0
RunTime:1ms

题目：Symmetric Tree(Difficulty: Easy)
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.

解题思路：
1、需要简化问题。要判断整棵树是不是对称的，首先需要判断根节点是否为空，为空则为对称的。
2、（根节点不为空）判断两个子节点节点本身是否对称，若左右两个节点本身不对称，返回false。
3、若左右两个节点本身对称，比较左节点的左子节点和右节点的右子节点，比较左节点的右子节点和右节点的左子节点，回到步骤二。

解题关键：
如何找到对称的两个节点并比较。
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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        
        return compareTwoNodes(root.left,root.right);
    }
    
    public boolean compareTwoNodes(TreeNode left,TreeNode right){
        if(left==null&&right==null){
            return true;
        }else if((left==null&&right!=null)||(left!=null&&right==null)||left.val!=right.val||!compareTwoNodes(left.left,right.right)||!compareTwoNodes(left.right,right.left)){
            return false;
        }else{
            return true;
        }
    }
}