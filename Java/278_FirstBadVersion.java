/*
@author Cathy
@version 1.0
RunTime:17ms

��Ŀ��First Bad Version(Difficulty: Easy)
You are a product manager and currently leading a team to develop a new product. 
Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, 
all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, 
which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad. 
Implement a function to find the first bad version. You should minimize the number of calls to the API.

����˼·��
1���������뵽�汾�ĺû�������ʽ good good ... bad bad bad ...   bad����İ汾���ǻ��ģ��û��汾֮���зֽ�
2������ʱ�临�Ӷȣ�˳������Ļ���ʱ�临�Ӷ�ΪO(n),����ʹ�ö��ֲ��ҵĻ�ʱ�临�Ӷ�ΪO(logn)
3��Ȼ��ʵ�ֵĹ���Ҫ���ǵ�����Խ��������java����int�������ֵ����������ʱ����Խ�硣
*/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=1,right=n,mid;
        
        while(left<right){
            mid=left+(right-left)/2;
            if(isBadVersion(mid)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        
        return left;
    }
}