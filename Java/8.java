/*
@author Cathy
@version 1.0

��Ŀ��
Implement atoi to convert a string to an integer.(C����atoi������ʵ��)

�ܽ᣺
����⻨�˺ܳ�ʱ�䣬���Ȼ�ʱ���˽⺯������ʵ�ֵĹ��ܣ���Ϊ�漰���ܶ�ϸ�ڣ������ٽ�����һ��ҪŪ�����
Ȼ����ǲ��ϵ��ԣ�ͨ�����öϵ�۲��������ֵ�ı仯���ҵ���������ĵط���һ��һ�������
1��������Ҫ��ȷ�����˽�atoi����ʵ�ֵĹ��ܡ�����������ʼ�Ŀո񣬷���ֻ����һ�������ֺ���������ַ���������Ҫ����������������⡣
2������㷨��Ҫ��������˼·��������Ҫ���ϵ������룬�������ر��
3�����о���֪ʶ�����ղ��ι̡��ַ��ͱ�����'+'��'-'��' '�������Ҫ�Ƚϣ���Ҫ��ֵ������õı��������ñ������бȽϡ��ַ�����ȡ��str.substring(int,int)����Ҫ���ظ������ı�����
   ѭ���У���Ҫ���ʵ�ʱ����������ѭ�����ַ�����ȡ��ѭ������ָ�������ַ���������ѭ��������Ҫ�����ʵ���λ�á�
4����ʱ����������ж����ֵ���������ᵽǰ��ͽ���ˡ�����Ч����Ȼ���ߡ�
5�����˼·һ��Ҫ���ѽ��������������
*/
public class Solution {
    public int myAtoi(String str) {
       String str1="";
        int p=1,q=1,r=1,s=0;//p:�ж��Ƿ�����ǰ��Ŀո�;q:�ж���������;r:�ж��Ƿ�������ǰ��ĸ���;s:���ƴ���
        long result;
        char space=' ',plus='+',minus='-';
        
        for(int i=0;i<str.length();i++,i=i-s){
        	s=0;
        	//�ж�����
            if(str.length()>0&&str.charAt(i)>=48&&str.charAt(i)<=57){
                p=0;
                r=0;
                continue;
        }
        	//ȥ��ǰ��ո�
            if(p==1&&str.charAt(i)==space){
                str1=str.substring(1,str.length());
                str=str1;
                s++;
                continue;
            }
            //�жϷ��Ž�ȡ����¼
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
            
            //�жϳ����ź�������������ַ�,�Ƴ�ѭ������
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
            //�˳�
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