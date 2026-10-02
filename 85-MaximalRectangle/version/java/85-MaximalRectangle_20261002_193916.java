// Last updated: 02/10/2026, 19:39:16
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
4            return 0;
5
6        int M = matrix.length;
7        int N = matrix[0].length;
8
9        int[][] mat = new int[M][N];
10
11        
12        for (int i = 0; i < M; i++) {
13            for (int j = 0; j < N; j++) {
14                mat[i][j] = matrix[i][j] - '0';
15            }
16        }
17
18   
19        for (int i = 0; i < M; i++) {
20            for (int j = 1; j < N; j++) {
21                if (mat[i][j] == 1) {
22                    mat[i][j] += mat[i][j - 1];
23                }
24            }
25        }
26
27        int Ans = 0;
28
29        for (int j = 0; j < N; j++) {
30            for (int i = 0; i < M; i++) {
31                int width = mat[i][j];
32                if (width == 0) continue;
33
34           
35                int currWidth = width;
36                for (int k = i; k < M && mat[k][j] > 0; k++) {
37                    currWidth = Math.min(currWidth, mat[k][j]);
38                    int height = k - i + 1;
39                    Ans = Math.max(Ans, currWidth * height);
40                }
41
42              
43                currWidth = width;
44                for (int k = i; k >= 0 && mat[k][j] > 0; k--) {
45                    currWidth = Math.min(currWidth, mat[k][j]);
46                    int height = i - k + 1;
47                    Ans = Math.max(Ans, currWidth * height);
48                }
49            }
50        }
51
52        return Ans;
53    }
54}