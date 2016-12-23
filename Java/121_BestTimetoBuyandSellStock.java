/*
@author Cathy
@version 1.0

��Ŀ��Best Time to Buy and Sell Stock
Say you have an array for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

����˼·��
1�������пգ�prices==null||prices.length==0����0.
2�����������������ֱ𱣴����ֵ����Сֵ�Ͳ�ֵ��ÿ�θ�����Сֵʱ���ֵ��Ҫ��Ϊ0����Ϊ��Сֵǰ��������ö�����Ч�ġ���ֵ��ʼΪ0��ÿ����ֵ��Ͳ�ֵ�Ƚϣ������ڲ�ֵ����ֵ����ֵ��

ע�����
1��������ʼ��Ҫ�������пա�
2������������Ҫ��ʼ������γ�ʼ����Ҫ˼�������
*/
public class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0){
            return 0;
        }
        
        int min=prices[0],max=prices[0],val=0;
        int len=prices.length;
        
        for(int i=1;i<len;i++){
            if(prices[i]>max){
                max=prices[i];
            }
            
            if(prices[i]<min){
                min=prices[i];
                max=0;
            }
            
            if((max-min)>val){
                val=max-min;
            }
        }
        
        return val;
    }
}