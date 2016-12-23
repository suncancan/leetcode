/*
@author Cathy
@version 1.0
RunTime:4ms

题目：Maximum Depth of Binary Tree(Difficulty: Easy)
Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

解题思路：
同102题，广度优先遍历。遍历每一层的节点。记录层数。

注意事项：
链表判空需要用size()方法，不能用null，因为链表已经分配了空间，我们判定里面是否有值。
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
    public int maxDepth(TreeNode root) {
    
        if(root==null){
            return 0;
        }
        
        List<TreeNode> ls;
        List<TreeNode> ls2=new LinkedList<TreeNode>();
        ls2.add(root);
        int n=0;
        
        while(ls2.size()!=0){
            n++;
            ls=new LinkedList<TreeNode>();
            
            for(TreeNode t:ls2){
                if(t.left!=null){
                    ls.add(t.left);
                }
                if(t.right!=null){
                    ls.add(t.right);
                }
            }
            
           ls2=ls;
        }
        
        return n;
    }
}