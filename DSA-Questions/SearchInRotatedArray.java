public class SearchInRotatedArray {
    public static int s(int[] arr, int left, int right, int key) {
        while(left <= right) {
            int mid = left + (right - left) / 2;

            // Return Condition
            if(arr[mid] == key)
                return mid;

            else if(mid != right && arr[mid] < arr[right]) {
                if(key > arr[mid] && key <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if(key >= arr[left] && key < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

        }

        return -1;

    }

    public static int search(int[] arr, int key) {
        return s(arr, 0, arr.length - 1, key);
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,1,2,3,4};
        int key = 10;
        System.out.println(search(arr, key));
    }

}
