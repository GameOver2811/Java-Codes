public class Pattern {
    public static void main(String[] arg) {
        int n = 6;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 0; j <= 2*n - 2*(i+1) - 1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
