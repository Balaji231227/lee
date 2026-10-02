// Last updated: 02/10/2026, 19:46:52
1class Solution {
2    public int minMoves2(int[] nums) {
3        int operations = 0, mid = quickSelect(nums, 0, nums.length-1, nums.length/2);
4        for (int num: nums) operations += Math.abs(mid - num);
5        return operations;
6    }
7    
8    private int quickSelect(int[] nums, int left, int right, int k) {
9        if (left == right) return nums[left];
10
11        int pIndex = new Random().nextInt(right - left + 1) + left;
12        pIndex = partition(nums, left, right, pIndex);
13
14        if (pIndex == k) return nums[k];
15        else if (pIndex < k) return quickSelect(nums, pIndex+1, right, k);
16        return quickSelect(nums, left, pIndex-1, k);
17    }
18
19    private int partition(int[] nums, int left, int right, int pIndex) {
20        int pivot = nums[pIndex];
21        swap(nums, pIndex, right);
22        pIndex = left;
23
24        for (int i=left; i<=right; i++) 
25            if (nums[i] <= pivot) swap(nums, i, pIndex++);
26
27        return pIndex - 1;
28    }
29
30    private void swap(int[] nums, int x, int y) {
31        int temp = nums[x];
32        nums[x] = nums[y];
33        nums[y] = temp;
34    }
35}