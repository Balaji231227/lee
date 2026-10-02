// Last updated: 02/10/2026, 19:09:19
1class Solution {
2    public int minPathSum(int[][] grid) {
3
4        int m = grid.length;
5        int n = grid[0].length;
6
7        int[][] dp = new int[m][n];
8
9        dp[0][0] = grid[0][0];
10
11        // First row
12        for (int j = 1; j < n; j++) {
13            dp[0][j] = dp[0][j - 1] + grid[0][j];
14        }
15
16        // First column
17        for (int i = 1; i < m; i++) {
18            dp[i][0] = dp[i - 1][0] + grid[i][0];
19        }
20
21        // Remaining cells
22        for (int i = 1; i < m; i++) {
23            for (int j = 1; j < n; j++) {
24
25                dp[i][j] = Math.min(
26                    dp[i - 1][j],
27                    dp[i][j - 1]
28                ) + grid[i][j];
29            }
30        }
31
32        return dp[m - 1][n - 1];
33    }
34}