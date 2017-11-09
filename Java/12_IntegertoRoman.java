/*
@author Cathy
@version 1.0

RunTime:95ms

题目：Integer to Roman(Difficulty: Medium)

Given an integer, convert it to a roman numeral.
Input is guaranteed to be within the range from 1 to 3999.

解题思路：
枚举法

注意事项：
注意枚举每一位的时候不要出错
*/

class Solution {
    public String intToRoman(int num) {
        String s;
        String[][] dicR={{"","M","MM","MMM"},{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},{"","I","II","III","IV","V","VI","VII","VIII","IX"}};
        s=dicR[0][num/1000%10]+dicR[1][num/100%10]+dicR[2][num/10%10]+dicR[3][num%10];
        return s;
    }
}