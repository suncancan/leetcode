/*
@author Cathy
@version 1.0
RunTime:3ms

��Ŀ��Binary Tree Level Order Traversal(Difficulty: Easy)
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

����˼·��
���ڶ������Ĺ�����ȱ���������ÿһ�㣬��Ҫ��¼��һ��ķǿսڵ㣬��for each����ÿ���ڵ�������ӽڵ㡣

����ؼ���
��α���ÿһ��Ľڵ㡣
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
