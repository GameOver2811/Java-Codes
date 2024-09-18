// Print or find all Odd Numbers in any Array.

public class OddNumbers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 != 0)
                System.out.print(nums[i]+ " ");
        }
    }
}
