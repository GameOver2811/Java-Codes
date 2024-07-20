import java.util.Arrays;
import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        System.out.println("Chalo suru krte hai....");
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter rows and col of first matrix : ");
            int row1 = sc.nextInt();
            int col1 = sc.nextInt();
            int[][] matrix1 = new int[row1][col1];
            System.out.println("Now enter the values : ");
            for(int i = 0; i < row1; i++) {
                for(int j = 0; j < col1; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Now enter values for second Matrix : ");
            int[][] matrix2 = new int[row1][col1];
            for(int i = 0; i < row1; i++) {
                for(int j = 0; j < col1; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < row1; i++) {
                for(int j = 0; j < col1; j++) {
                    matrix1[i][j] = matrix1[i][j] + matrix2[i][j];
                    System.out.println(matrix1[i][j]);
                }
            }
            System.out.println("Sum of both array : ");
            for(int i = 0; i < row1; i++) {
                for(int j = 0; j < col1; j++) {
                    System.out.print(matrix1[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }
}
