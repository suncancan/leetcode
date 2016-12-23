/*
@author Cathy
@version 1.0

��Ŀ��
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:
string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

�ܽ᣺
1�������ƴ洢������������͡�List<String>��ԭ�����뷨�Ƕ�ά���顣
2��List�÷������get,set��List�ĳ�ʼ����
3��ע�ⷵ�صĽ��Ϊ�µ��ַ������������ţ�������toString������
*/
public class Solution {
    public String convert(String s, int numRows) {
       
       List<String> list=new ArrayList<String>(numRows);
       String result="";
       int q =1;
       int line=0;
	  
	   for(int i=0;i<numRows;i++){
		   list.add("");
	   }
       
       if(numRows<1){
           throw new IllegalArgumentException();
       }
       
       if(numRows==1){
           return s;
       }
       
       for(int i=0;i<s.length();i++){
          list.set(line,list.get(line)+s.charAt(i));
          line+=q;
          if(line==0||line==(numRows-1)){
              q*=(-1);
          }
       }
       
       for(int i=0;i<numRows;i++){
           result+=list.get(i);
       }
       
       return result;
}
}
