/*
@author Cathy
@version 1.0
RunTime:0ms

题目：Nim Game(Difficulty: Easy)
You are playing the following Nim Game with your friend: There is a heap of stones on the table, 
each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. 
You will take the first turn to remove the stones.

Both of you are very clever and have optimal strategies for the game. 
Write a function to determine whether you can win the game given the number of stones in the heap.

For example, if there are 4 stones in the heap, then you will never win the game: 
no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.

解题思路：
找规律，考虑4这个数字
*/

public class Solution {
    public boolean canWinNim(int n) {
        return (n%4!=0);
    }
}