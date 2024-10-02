public class Patterns {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                if(i == 0 || i == 9 || j == 9 || j == 0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        String str = "KRISHNA";
        for(int i = 0; i < str.length(); i++) {
            System.out.println(str.substring(0,i + 1));
        }
        for(int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.substring(0,i));
        }

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(i == j || i == 9 - 1 - j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
