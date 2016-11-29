/*
@author Cathy
@version 1.0
RunTime:3ms

��Ŀ��Pascal's Triangle(Difficulty: Easy)
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

����˼·��
ÿһ�У����˵�һ�У��Ľ��Ϊ��һ�еĽ���ֱ��ڵ�һ�������һ��λ�ò�0���ӵ�һ�ʼ����������ĺ͡�

ע�����
����ls2=ls,���ı�ls2��lsҲ��֮�ı䡣����ls2��Ҫnewһ���µ�ʵ����ls2=new ArrayList<Integer>(ls);
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
