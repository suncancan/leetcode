/*
@author Cathy
@version 1.0
RunTime:36ms

��Ŀ��Count Primes(Difficulty: Easy)
Description:

Count the number of prime numbers less than a non-negative number, n.

����˼·��
��Sieve of Eratosthenes�㷨����Ǻ��������飨0��ʾ��������Ϊ����������Ԫ����Ϊ1��

ע�����
1��ע��ռ临�Ӷ�
*/
//δͨ����������
//�˷�����HashSet�洢���������ǵ�n��ֵ�ܴ�ʱ���ռ临�Ӷȹ��ߡ�
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

//�Ľ���ͨ���ķ���
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