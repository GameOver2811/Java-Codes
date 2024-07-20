import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sum = 0;
            int[] arr = new int[5];
            for(int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            System.out.println("Sum of all Ent1ered numbers is : " + sum);
        }
    }
}
