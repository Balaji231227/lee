// Last updated: 02/10/2026, 19:45:03
1public class Solution {
2    public List<Integer> largestDivisibleSubset(int[] nums) {
3        int n = nums.length;
4        int[] count = new int[n];
5        int[] pre = new int[n];
6        Arrays.sort(nums);
7        int max = 0, index = -1;
8        for (int i = 0; i < n; i++) {
9            count[i] = 1;
10            pre[i] = -1;
11            for (int j = i - 1; j >= 0; j--) {
12                if (nums[i] % nums[j] == 0) {
13                    if (1 + count[j] > count[i]) {
14                        count[i] = count[j] + 1;
15                        pre[i] = j;
16                    }
17                }
18            }
19            if (count[i] > max) {
20                max = count[i];
21                index = i;
22            }
23        }
24        List<Integer> res = new ArrayList<>();
25        while (index != -1) {
26            res.add(nums[index]);
27            index = pre[index];
28        }
29        return res;
30    }
31}