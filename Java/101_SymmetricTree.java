/*
@author Cathy
@version 1.0
RunTime:1ms

��Ŀ��Symmetric Tree(Difficulty: Easy)
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.

����˼·��
1����Ҫ�����⡣Ҫ�ж��������ǲ��ǶԳƵģ�������Ҫ�жϸ��ڵ��Ƿ�Ϊ�գ�Ϊ����Ϊ�ԳƵġ�
2�������ڵ㲻Ϊ�գ��ж������ӽڵ�ڵ㱾���Ƿ�Գƣ������������ڵ㱾���Գƣ�����false��
3�������������ڵ㱾��Գƣ��Ƚ���ڵ�����ӽڵ���ҽڵ�����ӽڵ㣬�Ƚ���ڵ�����ӽڵ���ҽڵ�����ӽڵ㣬�ص��������

����ؼ���
����ҵ��ԳƵ������ڵ㲢�Ƚϡ�
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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        
        return compareTwoNodes(root.left,root.right);
    }
    
    public boolean compareTwoNodes(TreeNode left,TreeNode right){
        if(left==null&&right==null){
            return true;
        }else if((left==null&&right!=null)||(left!=null&&right==null)||left.val!=right.val||!compareTwoNodes(left.left,right.right)||!compareTwoNodes(left.right,right.left)){
            return false;
        }else{
            return true;
        }
    }
}