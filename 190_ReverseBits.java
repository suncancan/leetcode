/*
@author Cathy
@version 1.0
RunTime:3ms

��Ŀ��Reverse Bits(Difficulty: Easy)
Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).

Follow up:
If this function is called many times, how would you optimize it?

Related problem: Reverse Integer

����˼·��
�������Ҫ����λ���㣬ȡ��ÿһλ(n>>>=1 �޷�������)������λ���㣬��ԭ��������֣�result+=n&1;result<<=1;����

ע�����
������ȡ��ķ�ʽ�ҳ�ÿ��������λ��
��Ϊ��Ŀ����������޷������������Ǵ洢��int����з��ŵ����������
��������0,��int��洢Ϊ10000000 00000000 00000000 00000000�����޷������������2��31�η�����Ӧ�õõ�00000000 00000000 00000000 00000001������ͨ��ȡ��ķ�ʽ�õ��Ķ����Ʊ�����ʽΪ00000000 00000000 00000000 00000000
*/
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result=0;
        
        for(int i=0;i<31;i++){
            result+=n&1;
            result<<=1;
            n>>>=1;
        }
        result+=n;

        return result;
    }
}
