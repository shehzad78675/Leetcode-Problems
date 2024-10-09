class Solution {
    public int solve(List<List<Integer>> triangle, int i, int j, int n, int[][] dp){
        if(i == n-1){
            return triangle.get(i).get(j);
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int down = triangle.get(i).get(j) + solve(triangle, i+1, j, n, dp);
        int right = triangle.get(i).get(j) + solve(triangle, i+1, j+1, n, dp);

        return dp[i][j] = Math.min(down, right);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }

        return solve(triangle, 0, 0, n, dp);
    }
}