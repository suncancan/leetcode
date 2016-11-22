/*
@author Cathy
@version 1.0
RunTime:3ms

题目：Binary Tree Level Order Traversal(Difficulty: Easy)
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]

解题思路：
属于二叉树的广度优先遍历。遍历每一层，需要记录上一层的非空节点，用for each遍历每个节点的左右子节点。

解题关键：
如何遍历每一层的节点。
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> result2=new ArrayList<Integer>();
        Queue<TreeNode> line; 
        Queue<TreeNode> line2=new LinkedList<TreeNode>();
        
        if(root==null){
            return result;
        }
        
        line2.add(root);
        result2.add(root.val);
        result.add(result2);
        
        while(line2.size()!=0){
            line=new LinkedList<TreeNode>(); 
            result2=new ArrayList<Integer>();
            
            for(TreeNode t:line2){
                if(t.left!=null){
                    line.add(t.left);
                    result2.add(t.left.val);
                }
                if(t.right!=null){
                    line.add(t.right);
                    result2.add(t.right.val);
                }
            }
            
            if(result2.size()!=0){
                result.add(result2);
            }
            
             line2=line;
        }

        return result;
    }
}
