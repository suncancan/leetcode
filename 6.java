/*
@author Cathy
@version 1.0

题目：
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:
string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

总结：
1、如何设计存储结果的数据类型。List<String>。原来的想法是二维数组。
2、List用法，如何get,set。List的初始化。
3、注意返回的结果为新的字符串，不带符号，不能用toString方法。
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
