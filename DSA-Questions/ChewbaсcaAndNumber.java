//Question :
//Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers, but he loves inverting digits in them. Inverting digit t means replacing it with digit 9 - t.
//
//Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. The decimal representation of the final number shouldn't start with a zero.

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
