// Last updated: 02/10/2026, 18:46:19
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        if (strs == null || strs.length == 0) return "";
4        
5        String pref = strs[0];
6        int prefLen = pref.length();
7
8        for (int i = 1; i < strs.length; i++) {
9            String s = strs[i];
10            while (prefLen > s.length() || !pref.equals(s.substring(0, prefLen))) {
11                prefLen--;
12                if (prefLen == 0) {
13                    return "";
14                }
15                pref = pref.substring(0, prefLen);
16            }
17        }
18
19        return pref;        
20    }
21}