public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans = Math.max(sum, ans);
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(maxSubArray(nums));
    }
}
