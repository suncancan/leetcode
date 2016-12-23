/*
@author Cathy
@version 1.0

题目：Best Time to Buy and Sell Stock
Say you have an array for which the ith element is the price of a given stock on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

解题思路：
1、数组判空，prices==null||prices.length==0返回0.
2、设置三个变量，分别保存最大值、最小值和差值。每次更新最小值时最大值需要置为0，因为最小值前面的所有置都是无效的。差值初始为0，每次最值差和差值比较，若大于差值，则赋值给差值。

注意事项：
1、方法开始需要对数组判空。
2、三个变量需要初始化。如何初始化需要思考清楚。
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