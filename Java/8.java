/*
@author Cathy
@version 1.0

题目：
Implement atoi to convert a string to an integer.(C语言atoi函数的实现)

总结：
这道题花了很长时间，首先花时间了解函数具体实现的功能，因为涉及到很多细节，所以临界条件一定要弄清楚。
然后就是不断调试，通过设置断点观察各个变量值的变化，找到出现问题的地方，一个一个解决。
1、首先需要明确需求，了解atoi函数实现的功能。比如跳过开始的空格，符号只能有一个，数字后面的其他字符舍弃，还要考虑数据溢出的问题。
2、设计算法，要有清晰的思路，否则需要不断调整代码，工作量特别大。
3、还有就是知识点掌握不牢固。字符型变量（'+'、'-'、' '）如果需要比较，需要赋值给定义好的变量，再用变量进行比较。字符串截取（str.substring(int,int)）需要返回给其他的变量。
   循环中，需要在适当时候跳出本次循环（字符串截取后循环变量指向后面的字符）。控制循环的条件要放在适当的位置。
4、超时啦！这个把判断数字的条件语句提到前面就解决了。但是效率依然不高。
5、设计思路一定要清楚呀！！！！！！！
*/
public class Solution {
    public int myAtoi(String str) {
       String str1="";
        int p=1,q=1,r=1,s=0;//p:判断是否是最前面的空格;q:判断数字正负;r:判断是否是数字前面的负号;s:控制次数
        long result;
        char space=' ',plus='+',minus='-';
        
        for(int i=0;i<str.length();i++,i=i-s){
        	s=0;
        	//判断数字
            if(str.length()>0&&str.charAt(i)>=48&&str.charAt(i)<=57){
                p=0;
                r=0;
                continue;
        }
        	//去掉前面空格
            if(p==1&&str.charAt(i)==space){
                str1=str.substring(1,str.length());
                str=str1;
                s++;
                continue;
            }
            //判断符号截取并记录
            if(str.length()>0&&r==1&&(str.charAt(i)==plus||str.charAt(i)==minus)){
                p=0;
                r=0;
                if(str.charAt(i)==minus){
                    q=q*(-1);
                 }
                 str1=str.substring(1,str.length());
                 str=str1;
                 s++;
                 continue;
        }
            
            //判断除符号和数字外的其他字符,推出循环条件
            if(str.length()>0&&(!(str.charAt(i)>=48&&str.charAt(i)<=57||str.charAt(i)==plus||str.charAt(i)==minus||str.charAt(i)==space))){
                if(r==0){
                    str1=str.substring(0,i);
                    str=str1;
                }
                else{
                	str="";
                }
                break;
            }
            //退出
            if(str.length()>0&&((p==0&&str.charAt(i)==space)||(r==0&&(str.charAt(i)==plus||str.charAt(i)==minus)))){
                str1=str.substring(0,i);
                str=str1;
                break;
            }
          
    }
     if(str.length()==0){
         return 0;
     }
     if(str.length()>10){
         if(q>0){
             return 2147483647;
         }
         else{
             return -2147483648;
         }
     }
     result=Long.parseLong(str)*q;
     if(result>2147483647){
         return 2147483647;
     }
     else if(result<-2147483648){
         return -2147483648;
     }
     else{
         return (int)result;
     }
}
}