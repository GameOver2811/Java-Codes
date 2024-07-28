import java.util.Arrays;

public class UniqueGridPath {
    public static int countPath(int m, int n, int i, int j, int[][] dp) {
        if(i == m - 1 && j == n - 1) return 1;
        if(i >= m || j >= n) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        dp[i][j] = countPath(m, n, i + 1, j, dp) + countPath(m, n, i, j + 1, dp);
        return dp[i][j];
    }
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return countPath(m, n, 0, 0, dp);
    }
    public static void main(String[] args) {
        System.out.println(uniquePaths(7,3));
    }
}
