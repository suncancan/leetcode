/*
@author Cathy
@version 1.0
RunTime:17ms

题目：First Bad Version(Difficulty: Easy)
You are a product manager and currently leading a team to develop a new product. 
Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, 
all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, 
which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad. 
Implement a function to find the first bad version. You should minimize the number of calls to the API.

解题思路：
1、首先是想到版本的好坏排列样式 good good ... bad bad bad ...   bad后面的版本都是坏的，好坏版本之间有分界
2、考虑时间复杂度，顺序遍历的话，时间复杂度为O(n),但是使用二分查找的话时间复杂度为O(logn)
3、然后实现的过程要考虑到数字越界的情况，java里面int型有最大值。所以运算时不能越界。
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