/*
@author Cathy
@version 1.0
RunTime:2ms

��Ŀ��Balanced Binary Tree(Difficulty: Easy)
Given a binary tree, determine if it is height-balanced.
For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

����˼·��
1����������㷨���������õݹ顣
2������ײ�ڵ㿪ʼ�жϣ�����Ϊƽ�������򷵻�-1�������������ȣ���Ϊ���ڵ��ж���ȵ����ݡ�
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
    public boolean isBalanced(TreeNode root) {
   
        int result=getHeight(root);
        
        if(result==-1){
            return false;
        }
        
        return true;
    }
    
    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        
        int left,right;
        left=getHeight(root.left);
        right=getHeight(root.right);
        
        if(left==-1||right==-1||Math.abs(left-right)>1){
            return -1;
        }
        
        return Math.max(left,right)+1;
    }
}
