import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    // Method to calculate binomial coefficient (n choose k)
    public static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n)
            return 1;
        int res = 1;
        if (k > n - k)
            k = n - k; // Since C(n, k) == C(n, n-k)
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                row.add(binomialCoeff(i, j));
            }
            ans.add(row);
        }
        return ans;
    }
    public static void main(String[] agrs) {
        List<List<Integer>> ans = generate(5);
        for(List<Integer> a : ans) {
            System.out.println(a);
        }
    }
}
