public class DuplicateValue {
    public static int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[0];

        // Move fast pointer to create a difference with slow
        slow = nums[slow];
        fast = nums[nums[fast]];

        // Detect cycle
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        // Find the entrance to the cycle
        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(findDuplicate(nums));
    }
}
