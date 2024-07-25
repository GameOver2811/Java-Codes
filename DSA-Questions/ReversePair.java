import java.util.ArrayList;

public class ReversePair {
    public static int merge(int[] nums, int low, int mid, int high) {
        int count = 0;
        int j = mid + 1;

        // For finding pairs
        for(int i = low; i <= mid; i++) {
            while(j <= high && nums[i] > 2* (long)nums[j]) {
                j++;
            }
            count += (j - mid - 1);
        }

        // Performing merge operation
        ArrayList<Integer> temp = new ArrayList<>();
        int i = low;
        j = mid + 1;
        while(i <= mid && j <= high) {
            if(nums[i] > nums[j]) {
                temp.add(nums[j++]);
            } else {
                temp.add(nums[i++]);
            }
        }
        while(i <= mid) {
            temp.add(nums[i++]);
        }
        while(j <= high) {
            temp.add(nums[j++]);
        }

        for(int k = low; k <= high; k++) {
            nums[k] = temp.get(k - low);
        }

        return count;

    }
    public static int mergeSort(int[] nums, int left, int right) {
        if(left >= right) return 0;
        int mid = left + (right - left)/2;
        int ans = mergeSort(nums, left, mid);
        ans += mergeSort(nums, mid + 1, right);
        ans += merge(nums, left, mid, right);
        return ans;
    }
    public static int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(reversePairs(nums));
    }
}
