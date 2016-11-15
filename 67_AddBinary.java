/*
@author Cathy
@version 1.0
RunTime:9 ms

��Ŀ��Add Binary(Difficulty: Easy)
Given two binary strings, return their sum (also a binary string).
For example,
a = "11"
b = "1"
Return "100".

����ؼ�˼·��
1����¼�������ݵ�ǰλ��ֵ�ͽ�λ��ֵ��ѭ������0-min��
2���Գ����ַ������д�����min-max��
*/
public class Solution {
    public String addBinary(String a, String b) {
        if(a==null||a.length()==0){
            return b;
        }
        if(b==null||b.length()==0){
            return a;
        }
        
        int len1=a.length(),len2=b.length();
        int min=Math.min(len1,len2);
        int max=Math.max(len1,len2);
        int count=0;
        String s="";
        
        for(int i=0;i<min;i++){
            if(a.charAt(len1-1-i)=='1'&&b.charAt(len2-1-i)=='1'){
                s=count+s;
                count=1;
            }
            if((a.charAt(len1-1-i)=='0'&&b.charAt(len2-1-i)=='1')||(a.charAt(len1-1-i)=='1'&&b.charAt(len2-1-i)=='0')){
                if(count==1){
                    s="0"+s;
                }else{
                    s="1"+s;
                    count=0;
                }
            }
            if(a.charAt(len1-1-i)=='0'&&b.charAt(len2-1-i)=='0'){
                s=count+s;
                count=0;
            }
        }
        
       if(len1>len2){
           s=addString(s,a,min,max,count);
       }else{
           s=addString(s,b,min,max,count);
       }

        return s;
    }
    
    public String addString(String s,String input,int min,int max,int count){
        if(count==0){
                s=input.substring(0,max-min)+s;
            }else{
                for(int i=min;i<max;i++){
                    if(input.charAt(max-1-i)=='0'){
                        s=count+s;
                        count=0;
                    }else{
                        if(count==1){
                            s="0"+s;
                            count=1;
                        }else{
                            s="1"+s;
                            count=0;
                        }
                    }
                }
            }
            
        if(count==1){
            s="1"+s;
        }
        return s;
    }
    
}