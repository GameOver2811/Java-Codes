

import java.util.Scanner;

public class StringBuffers {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            StringBuffer str = new StringBuffer(sc.nextLine());
            System.out.println("Before appending : "+str);
            str.append(" Game_Over");
            System.out.println("After appending : "+str);


            // StringBuffer str = new StringBuffer("Hello");
            // StringBuffer str1 = new StringBuffer("Hello");
            // System.out.println(str.equals(str1));
        }
    }

}
