public class PrintNNaturalNumbers {

    public static void print(int val) {
        for(int num = 1; num <= val; num++) {
            System.out.print(num+ " ");
        }
    }

    public static void main(String[] args) {
        print(10);
    }
}
