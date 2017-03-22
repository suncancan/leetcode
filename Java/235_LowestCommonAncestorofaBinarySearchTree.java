/*
@author Cathy
@version 1.0
RunTime:8ms

��Ŀ��Lowest Common Ancestor of a Binary Search Tree(Difficulty: Easy)

Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: ��The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).��

        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5
For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.

����˼·��
1���ؼ����ҹ��ɣ�������ʵ�������ӡ�
2���Ӹ���㿪ʼ�жϣ��������ڵ��ڸ��ڵ�ͬ�࣬����ڵ�Ĳroot-left��root-right���ĳ˻�Ϊ��������࣬��Ϊ����������һ��ΪҪ��Ľڵ㣬��Ϊ0��
3��û�ҵ����������Ҫ��������Ѱ�ҡ���Ȼ���������ֻ����ͬ��������Ҫ��������Ѱ�ҡ����ڶ������������˳��ģ���<��<�ң��������µķ���Ҳ��ȷ���ġ�
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while((root.val-p.val)*(root.val-q.val)>0){
            root=root.val>p.val?root.left:root.right;
        }
        return root;
    }
}