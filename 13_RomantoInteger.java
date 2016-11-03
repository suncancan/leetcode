/*
@author Cathy
@version 1.0
题目：Roman to Integer
Given a roman numeral, convert it to an integer.
Input is guaranteed to be within the range from 1 to 3999.
解题思路：
1、列出所有可能出现的字符，每个字符代表一个数值(其中1,10,100三个数符号不确定。)
2、判定符号。倒叙遍历字符串，记录当前字符的前一个（按遍历顺序）字符的值，若当前字符值为1,10,100中的一个，且比前一个（按遍历顺序）字符值小，值为负。其他情况为正。
3、求和。
注意事项：
1、仔细！！数据需要初始化，判断条件‘==’不是‘=’
2、case后面为常量表达式。final字符串数组不行？WHY？（final char[] c={'I','V','X','L','C','D','M'};case c[0]：XX;break;报错了）
*/
public class Solution {
    public int romanToInt(String s) {
        int result=0,n=0,res=0;//result为每次循环后的计算结果，n为当前变量的值，res为循环中前一个变量的值
        
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I':
                   n=1; 
                   break;
                case 'V':
                    n=5;
                    break;
                case 'X':
                    n=10;
                    break;
                case 'L':
                    n=50;
                    break;
                case 'C':
                    n=100;
                    break;
                case 'D':
                    n=500;
                    break;
                case 'M':
                    n=1000;
                    break;
            }
            if(n==5||n==50||n==500||n==1000){
                res=n;
                result+=n;
            }
           else{
                if(n<res){
                    result+=n*(-1);
                }
                else{
                    result+=n;
                }
                res=n;
            }
        }
        return result;
        
    }
}