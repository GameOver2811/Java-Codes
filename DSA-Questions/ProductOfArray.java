public class ProductOfArray {
    public static void main(String[] args) {
        int prod = 1;
        int[] arr = {1,2,3};
        for(int i = 0; i < arr.length; i++) {
            prod *= arr[i]; // prod = prod * arr[i]
        }
        System.out.println(prod);
    }
}
