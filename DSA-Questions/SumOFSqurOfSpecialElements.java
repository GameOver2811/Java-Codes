public class SumOFSqurOfSpecialElements {
    public static int sumOfSquares(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums.length % (i+1) == 0) {
                ans += nums[i] * nums[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println("Answer : "+ sumOfSquares(nums));
    }
}
