/*
@author Cathy
@version 1.0
RunTime:8ms

题目：Lowest Common Ancestor of a Binary Search Tree(Difficulty: Easy)

Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5
For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.

解题思路：
1、关键是找规律，代码其实并不复杂。
2、从根结点开始判断，若两个节点在根节点同侧，与根节点的差（root-left、root-right）的乘积为正，若异侧，则为负，若其中一个为要求的节点，则为0。
3、没找到的情况，需要继续向下寻找。当然三种情况中只有在同侧的情况需要继续向下寻找。由于二叉查找树是有顺序的，左<中<右，所以向下的方向也是确定的。
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