/*
@author Cathy
@version 1.0
RunTime:19ms

��Ŀ��Binary Tree Paths(Difficulty: Easy)
Given a binary tree, return all root-to-leaf paths.
For example, given the following binary tree:

   1
 /   \
2     3
 \
  5
All root-to-leaf paths are:
["1->2->5", "1->3"]

ע�����
�ݹ飬�߼�Ҫ���(ÿһ������������ʼ�ͽ���������)

����˼·��
������ȱ���
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