// Last updated: 02/10/2026, 19:01:34
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3       return new int[]{
4        first(nums, target), last(nums, target)
5       };
6    }
7
8    private int first(int[] nums, int target) {
9        int left = 0, right = nums.length - 1, res = -1;
10
11        while (left <= right) {
12            int mid = left + (right - left) / 2;
13
14            if (nums[mid] >= target) {
15                if (nums[mid] == target)
16                    res = mid;
17                right = mid - 1;
18            } else {
19                left = mid + 1;
20            }
21        }
22
23        return res;
24    }
25
26    private int last(int[] nums, int target) {
27        int left = 0, right = nums.length - 1, res = -1;
28
29        while (left <= right) {
30            int mid = left + (right - left) / 2;
31
32            if (nums[mid] <= target) {
33                if (nums[mid] == target)
34                    res = mid;
35                left = mid + 1;
36            } else {
37                right = mid - 1;
38            }
39        }
40
41        return res;
42    }
43}