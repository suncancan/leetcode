/*
@author Cathy
@version 1.0
RunTime:6ms

��Ŀ��Rectangle Area(Difficulty: Easy)
Description:

Find the total area covered by two rectilinear rectangles in a 2D plane.
Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
Assume that the total area is never beyond the maximum possible value of int.

����˼·��
1�������ҵ����ɣ�������Ҫ���������ѧ�����֪ʶ��
2������Ĺؼ����ҵ����������ص��Ĳ��֡�������Ӧλ�����ֵ����Сֵ�ҳ�����ά�ȵ��ص����ȡ�

ע�����
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