import java.util.*;

public class MissingAndRepeatingNumber {
    public static int[] findTwoElement(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        long calSum = 0;

        for(int i = 0; i < n; i++) {
            // If the element is already in the set, it is the duplicate
            if(set.contains(arr[i])) {
                ans[0] = arr[i];
            }
            calSum += (long)arr[i];
            set.add(arr[i]);
        }

        // Expected sum of the first n natural numbers
        long sum = (long)n * (n + 1) / 2;

        // Calculate the missing number
        ans[1] = (int)(sum - (calSum - (long)ans[0]));

        return ans;
    }
    public static void main(String[] agrs) {
        int[] arr = {1,2,2,3,4,5};
        int n = arr.length;
        System.out.println(Arrays.toString(findTwoElement(arr, n)));
    }
}
