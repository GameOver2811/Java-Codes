// Given N ----> Size, array ----> n-1 size ki hogi

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
        int n = 8;
//        for(int i = 0; i < arr.length; i++) {
//            if(i + 1 != arr[i]) {
//                System.out.println(i + 1);
//                break;
//            }
//        }
        int sum = (n* (n+1)) / 2;
        int arrSum = 0;
        for(int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        System.out.println(sum - arrSum);
    }
}
