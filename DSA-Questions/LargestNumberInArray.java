import java.util.*;

public class LargestNumberInArray {
    public static void main(String[] args) {

        int[] nums = {10,2,3,4,5,6,7,8};
//        int max = Integer.MIN_VALUE;
//
//        for(int i = 0; i < nums.length; i++) {
//            if(max < nums[i]) {
//                max = nums[i];
//            }
//        }
//
//        System.out.println(max);
        Arrays.sort(nums);

        System.out.println(nums[nums.length - 1]);

    }
}
