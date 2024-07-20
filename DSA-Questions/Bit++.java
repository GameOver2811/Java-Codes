import java.util.Scanner;

public class  Bit {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] str = new String[n];
        for(int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        int x = 0;
        for(int i = 0; i < n; i++) {
            if(str[i].equals("++X") || str[i].equals("X++")) {
                ++x;
            } else {
                --x;
            }
        }
        System.out.println(x);
    }
}
