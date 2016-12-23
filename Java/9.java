/*
@author Cathy
@version 1.0

题目：Palindrome Number
Determine whether an integer is a palindrome. Do this without extra space.

解题思路：
1、负数不是回文数，一位正数为回文数，两位及以上正数需要进一步判断
2、首先需要找到最高位，用除和取余操作依次取出对应的位。判断是否相等。
3、取完截取数字，剩下未判断的部分。（前面若有0记录不了，需要用base判断）。循环。截止条件：剩下部分>0（注意是>0哦！！！）

注意事项：
要想到所有特殊情况（前面有0）。在提交前自己思考用例！！！
*/
public class Solution {
    public boolean isPalindrome(int x) {
        int base=10,front,end;
        
        if(x<0){
            return false;
        }else if(x<10){
            return true;
        }
        
        for(;x/base>=10;base*=10){}
        
        for(;x>0;base/=100){
            front=x/base;
            end=x%10;
            
            if(front!=end){
                return false;
            }
            
            x-=front*base;
            x/=10;
        }
        return true;
    }
}