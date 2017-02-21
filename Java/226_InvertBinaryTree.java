/*
@author Cathy
@version 1.0
RunTime:0ms

��Ŀ��Invert Binary Tree(Difficulty: Easy)
Description:

Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9

to
     4
   /   \
  7     2
 / \   / \
9   6 3   1

����˼·��
���õݹ飬�ҵ����������͵ݹ�Ĺ�ϵ��

ע�����
������������ı��ʽ��Ҫ̫�࣬��Ӱ��ʱ�临�Ӷȡ�
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
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        
        TreeNode temp=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(temp);
        
        return root;
    }
}