/*
@author Cathy
@version 1.0
RunTime:3ms

��Ŀ��Binary Tree Level Order Traversal II(Difficulty: Easy)
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]

����˼·��
ͬBinary Tree Level Order Traversal��ֻ�����˳�����ײ㵽���ϲ㡣
����add(0,list)����ɣ�ÿ�����ʱ�����뵽������ǰ�ˡ�
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        List<Integer> res=new ArrayList<Integer>();
        List<TreeNode> tn;
        List<TreeNode> tn2=new ArrayList<TreeNode>();
        
       if(root==null){
           return list;
       }
       
       res.add(root.val);
       list.add(res);
       tn2.add(root);
       
       while(tn2.size()!=0){
           tn=new ArrayList<TreeNode>();
           res=new ArrayList<Integer>();
           
           for(TreeNode t:tn2){
               if(t.left!=null){
                   tn.add(t.left);
                   res.add(t.left.val);
               }
               if(t.right!=null){
                   tn.add(t.right);
                   res.add(t.right.val);
               }
           }
           
           tn2=tn;
           if(res.size()!=0){
               list.add(0,res);
           }
       }
       
       return list;
    }
}