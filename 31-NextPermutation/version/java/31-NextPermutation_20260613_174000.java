// Last updated: 13/06/2026, 17:40:00
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int i = nums.length - 2;
4
5        while (i >= 0 && nums[i] >= nums[i + 1]) {
6            i--;
7        }
8
9        if (i >= 0) {
10            int j = nums.length - 1;
11
12            while (nums[j] <= nums[i]) {
13                j--;
14            }
15
16            int temp = nums[i];
17            nums[i] = nums[j];
18            nums[j] = temp;
19        }
20
21        int left = i + 1;
22        int right = nums.length - 1;
23
24        while (left < right) {
25            int temp = nums[left];
26            nums[left] = nums[right];
27            nums[right] = temp;
28
29            left++;
30            right--;
31        }
32    }
33}