/*
@author Cathy
@version 1.0
RunTime:4ms

题目：Pascal's Triangle II(Difficulty: Easy)
Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?

解题思路：
同Pascal's Triangle。

注意事项：
注意0代表第一行。
*/
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ls=new ArrayList<Integer>();
        List<Integer> ls2=new ArrayList<Integer>();
        
        if(rowIndex<0){
            return ls;
        }
        
        ls.add(1);
        ls2.add(0);
        ls2.add(1);
        ls2.add(0);
        
        for(int i=1;i<=rowIndex;i++){
            ls=new ArrayList<Integer>();
            for(int j=0;j<i+1;j++){
                ls.add(ls2.get(j)+ls2.get(j+1));
            }
            ls2=new ArrayList<Integer>(ls);
            ls2.add(0);
            ls2.add(0,0);
        }
        
        return ls;
    }
}