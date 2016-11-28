/*
@author Cathy
@version 1.0
RunTime:2ms

题目：Minimum Depth of Binary Tree(Difficulty: Easy)
Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

解题思路：
广度优先算法。每层遍历。遇到叶子节点，返回长度len。
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
    public int minDepth(TreeNode root) {
        List<TreeNode> ls;
        List<TreeNode> ls2=new ArrayList<TreeNode>();
        int len=1;
        
        if(root==null){
            return 0;
        }
        
        ls2.add(root);
        
        while(true){
            ls=new ArrayList<TreeNode>();
            
            for(TreeNode t:ls2){
                if(t.left==null&&t.right==null){
                    return len;
                }
                if(t.left!=null){
                    ls.add(t.left);
                }
                if(t.right!=null){
                    ls.add(t.right);
                }
            }
            
            ls2=ls;
            len++;
        }
        
    }
}