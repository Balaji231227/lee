// Last updated: 02/10/2026, 19:48:37
1class Solution {
2    public int arrayPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int result = 0;
5        for (int i = 0; i < nums.length; i += 2) {
6            result += nums[i];
7        }
8        return result;
9    }
10}