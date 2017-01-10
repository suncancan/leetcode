/*
@author Cathy
@version 1.0
RunTime:6ms

题目：Rectangle Area(Difficulty: Easy)
Description:

Find the total area covered by two rectilinear rectangles in a 2D plane.
Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
Assume that the total area is never beyond the maximum possible value of int.

解题思路：
1、首先找到规律，本题主要考察的是数学的相关知识。
2、本题的关键是找到两个矩形重叠的部分。运用相应位置最大值与最小值找出单个维度的重叠长度。

注意事项：
*/
public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int left=Math.max(A,E);
        int right=Math.max(Math.min(C,G),left);
        int bottom=Math.max(B,F);
        int top=Math.max(Math.min(D,H),bottom);
        
        int area;
        area=(C-A)*(D-B)+(G-E)*(H-F)-(top-bottom)*(right-left);
        
        return area;
    }
}