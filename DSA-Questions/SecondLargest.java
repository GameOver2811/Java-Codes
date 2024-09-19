import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,4,3,6,9,3,9};
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] != largest) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
