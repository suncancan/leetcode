/*
@author Cathy
@version 1.0
RunTime:4ms

��Ŀ��Maximum Depth of Binary Tree(Difficulty: Easy)
Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

����˼·��
ͬ102�⣬������ȱ���������ÿһ��Ľڵ㡣��¼������

ע�����
�����п���Ҫ��size()������������null����Ϊ�����Ѿ������˿ռ䣬�����ж������Ƿ���ֵ��
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