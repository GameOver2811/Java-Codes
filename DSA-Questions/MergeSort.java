import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] nums, int left, int mid, int right) {
        ArrayList<Integer> temp = new ArrayList<>();
        int low = left, high = mid + 1;

        // Sorting
        while(low <= mid && high <= right) {
            if(nums[low] < nums[high]) {
                temp.add(nums[low++]);
            } else {
                temp.add(nums[high++]);
            }
        }
        while(low <= mid) {
            temp.add(nums[low++]);
        }
        while(high <= right) {
            temp.add(nums[high++]);
        }

        // Copy into main array
        int k = 0;
        for(int i = left; i <= right; i++) { // Corrected the loop condition to include the right index
            nums[i] = temp.get(k++);
        }
    }

    public static void mergeSort(int[] nums, int left, int right) {
        // Base Case
        if(left >= right) return;

        // Calculate mid value
        int mid = left + (right - left) / 2; // Corrected the mid calculation

        // Recursive calls to sort left and right halves
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        // Merge the sorted halves
        merge(nums, left, mid, right);
    }

    public static int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,2,7,6,9,5};
        System.out.println("Before Sort : "+ Arrays.toString(arr));
        System.out.println("After Sort : " + Arrays.toString(sortArray(arr)));
    }
}
