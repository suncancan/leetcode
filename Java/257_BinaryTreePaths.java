/*
@author Cathy
@version 1.0
RunTime:19ms

题目：Binary Tree Paths(Difficulty: Easy)
Given a binary tree, return all root-to-leaf paths.
For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:
["1->2->5", "1->3"]

注意事项：
递归，逻辑要清楚(每一步的条件，开始和结束的条件)

解题思路：
广度优先遍历
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList<String>();
        String path="";
        if (root!=null)
            {
            path=root.val+"";
            findPath(root,path,result);
        }
        return result; 
    }
    
    public void findPath(TreeNode tn,String path,List<String> result){
        if(tn.left==null&&tn.right==null){
            result.add(path);
            return ;
        }
        
        if(tn.left!=null){
            findPath(tn.left,path+"->"+tn.left.val,result);
        }
        
        if(tn.right!=null){
            findPath(tn.right,path+"->"+tn.right.val,result);
        }
    }
}