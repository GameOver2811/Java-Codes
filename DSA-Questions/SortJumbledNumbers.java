import java.util.Arrays;

public class SortJumbledNumbers {
    // Method to change the number based on the given mapping
    public static int changeNum(int value, int[] mapping) {
        if (value == 0) return mapping[0];

        int newValue = 0;
        int place = 1;
        while (value > 0) {
            int digit = value % 10;
            newValue += mapping[digit] * place;
            place *= 10;
            value /= 10;
        }

        return newValue;
    }

    // Method to sort the array based on the transformed values
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        int[][] pairs = new int[n][2];

        // Create pairs of (transformed value, original value)
        for (int i = 0; i < n; i++) {
            pairs[i][0] = changeNum(nums[i], mapping);
            pairs[i][1] = nums[i];
        }

        // Sort pairs based on the transformed values
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        // Extract sorted original values
        for (int i = 0; i < n; i++) {
            nums[i] = pairs[i][1];
        }

        return nums;
    }
    public static void main(String[] args) {
        int[] mapping = {8,9,4,0,2,1,3,5,7,6}, nums = {991,338,38};
        System.out.println(
                Arrays.toString(
                        sortJumbled(mapping, nums)
                )
        );
    }
}
