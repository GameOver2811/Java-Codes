import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int breakPoint = nums.length - 2;

        // Find the first index from the end where nums[breakPoint] < nums[breakPoint + 1]
        while(breakPoint >= 0 && nums[breakPoint] >= nums[breakPoint + 1]) {
            breakPoint--;
        }

        if(breakPoint >= 0) {
            int nextMax = nums.length - 1;
            // Find the smallest number greater than nums[breakPoint] to swap with
            while(nums[nextMax] <= nums[breakPoint]) {
                nextMax--;
            }
            // Swap numbers at breakPoint and nextMax
            int temp = nums[breakPoint];
            nums[breakPoint] = nums[nextMax];
            nums[nextMax] = temp;
        }

        // Reverse the sequence after breakPoint
        int start = breakPoint + 1;
        int end = nums.length - 1;
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
