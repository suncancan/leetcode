/*
@author Cathy
@version 1.0
RunTime:61ms

题目：Minimum Window Substring(Difficulty: Hard)
Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

For example,
S = "ADOBECODEBANC"
T = "ABC"
Minimum window is "BANC".

Note:
If there is no such window in S that covers all characters in T, return the empty string "".
If there are multiple such windows, you are guaranteed that there will always be only one unique minimum window in S.

解题思路：
1、HashMap+双指针

注意事项：
1、写代码前一定要把思路理清
*/

class Solution {
	public String minWindow(String s, String t) {
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		int lens = s.length();
		int lent = t.length();
		char c;

		for (int i = 0; i < lent; i++) {
			c = t.charAt(i);
			hs.put(c, hs.containsKey(c) ? (hs.get(c) + 1) : 1);
		}

		int pos = 0;
		while (!containsAll(hs) && pos < lens) {
			c = s.charAt(pos++);
			if (hs.containsKey(c)) {
				hs.put(c, hs.get(c) - 1);
			}
		}

		String sub = s;
		if (containsAll(hs)) {
			sub = s.substring(0, pos);
		} else {
			return "";
		}

		int low = 0;
		while (pos <= lens) {
			while (containsAll(hs)) {
				if ((pos - low) < sub.length()) {
					sub = s.substring(low, pos);
				}
				c = s.charAt(low);
				if (hs.containsKey(c)) {
					hs.put(c, hs.get(c) + 1);
				}
				low++;
			}

			if (pos < lens && hs.containsKey(s.charAt(pos))) {
				c = s.charAt(pos);
				hs.put(c, hs.get(c) - 1);
			}
			pos++;
		}
		return sub;
	}

	public boolean containsAll(HashMap<Character, Integer> hs) {
		for (int i : hs.values()) {
			if (i > 0) {
				return false;
			}
		}
		return true;
	}

}