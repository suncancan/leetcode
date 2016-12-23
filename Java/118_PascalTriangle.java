/*
@author Cathy
@version 1.0
RunTime:3ms

题目：Pascal's Triangle(Difficulty: Easy)
Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]

解题思路：
每一行（除了第一行）的结果为上一行的结果分别在第一个和最后一个位置补0，从第一项开始求相邻两项的和。

注意事项：
链表ls2=ls,若改变ls2，ls也随之改变。所以ls2需要new一个新的实例。ls2=new ArrayList<Integer>(ls);
*/
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> ls=new ArrayList<Integer>();
        List<Integer> ls2;
        
        if(numRows<=0){
            return result;
        }
        
        ls.add(1);
        result.add(ls);
        ls2=new ArrayList<Integer>(ls);
        ls2.add(0);
        ls2.add(0,0);
        
        for(int i=1;i<numRows;i++){
            ls=new ArrayList<Integer>();
            for(int j=0;j<i+1;j++){
                ls.add(ls2.get(j)+ls2.get(j+1));
            }
            result.add(ls);
            ls2=new ArrayList<Integer>(ls);
            ls2.add(0);
            ls2.add(0,0);
        }
        
        return result;
        
    }
}
