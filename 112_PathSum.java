/*
@author Cathy
@version 1.0

��Ŀ��Path Sum
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

����˼·��
1�����õݹ顣����ǰ�ڵ㲻��Ҷ�ӽڵ㣬�ݹ飬sumΪsum��ȥ��ǰvalue������ǰ�ڵ�ΪҶ�ӽڵ㣬��ǰֵ��sum���бȽϣ�����ȣ��򷵻�true��
2�����һ�䷵��false����Ϊ֮ǰû��ƥ�䣬û��ͨ��true���أ�
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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        
        if(root.left==null&&root.right==null&&root.val==sum){
                return true;
        }
        
        if(root.left!=null||root.right!=null){
            return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
        }
        
        return false;
    }
}