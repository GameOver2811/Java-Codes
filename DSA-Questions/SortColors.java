import java.util.Arrays;

public class SortColors {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1;
        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if(nums[mid] == 2) {
                swap(nums, high, mid);
                high--;
            } else {
                mid++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,1,2,0,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

}
