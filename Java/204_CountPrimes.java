/*
@author Cathy
@version 1.0
RunTime:36ms

题目：Count Primes(Difficulty: Easy)
Description:

Count the number of prime numbers less than a non-negative number, n.

解题思路：
用Sieve of Eratosthenes算法。标记合数用数组（0表示素数，若为合数，数组元素置为1）

注意事项：
1、注意空间复杂度
*/
//未通过用例方法
//此方法用HashSet存储合数，但是当n的值很大时，空间复杂度过高。
public class Solution {
    public int countPrimes(int n) {
        HashSet hs=new HashSet<Integer>();
        int count=0;
        
        for(int i=2;i*i<n;i++){
            if(hs.contains(i)){
                continue;
            }
            for(int j=0;i*(i+j)<n;j++){
                hs.add(i*(i+j));
            }
        }
        
        for(int i=2;i<n;i++){
            if(!hs.contains(i)){
                count++;
            }
        }
        
        return count;
    }
}

//改进后通过的方法
public class Solution {
    public int countPrimes(int n) {
        int[] result=new int[n];
        int count=0;
        
        for(int i=2;i*i<n;i++){
            if(result[i]==1){
                continue;
            }
            
            for(int j=0;i*(i+j)<n;j++){
                result[i*(i+j)]=1;
            }
        }
        
        for(int i=2;i<n;i++){
            if(result[i]==0){
                count++;
            }
        }
        
        return count;
    }
}