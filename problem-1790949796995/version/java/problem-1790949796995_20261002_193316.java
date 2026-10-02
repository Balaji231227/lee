// Last updated: 02/10/2026, 19:33:16
1class Solution {
2    public String largestNumber(int[] nums) {
3        String[] arr = new String[nums.length];
4
5        
6        for (int i = 0; i < nums.length; i++) {
7            arr[i] = String.valueOf(nums[i]);
8        }
9
10        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
11
12        
13        if (arr[0].equals("0")) return "0";
14
15        StringBuilder sb = new StringBuilder();
16        for (String s : arr) sb.append(s);
17        return sb.toString();
18    }
19}