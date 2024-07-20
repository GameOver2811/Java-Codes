import java.util.ArrayList;
import java.util.Scanner;

public class ChewbaсcaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> digits = new ArrayList<>();
        while (num > 0) {
            digits.add(num % 10);
            num /= 10;
        }
        for(int i = 0; i < digits.size(); i++) {
            if((9-digits.get(i)) < digits.get(i)) {
                digits.set(i, 9-digits.get(i));
            }
        }
        for(Integer i : digits) {
            System.out.println(i);
        }
    }
}
