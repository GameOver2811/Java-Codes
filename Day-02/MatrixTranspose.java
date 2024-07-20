import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        System.out.println("Chalo suru krte hai....");
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter size of matrix : ");
            int size = sc.nextInt();
            int[][] matrix = new int[size][size];
            for(int i = 0; i < size; i++) {
                for(int j = 0; j < size; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            // int[][] transposedMatrix = new int[size][size];
            // System.out.println("ye rahi transposed matrix using extra space : ");
            // for(int i = 0; i < size; i++) {
            //     for(int j = 0; j < size; j++) {
            //         transposedMatrix[j][i] = matrix[i][j];
            //     }
            // }

            System.out.println("ye rahi transposed matrix without extra space : ");
            for(int i = 0; i < size; i++) {
                for(int j = i+1; j < size; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            for(int i = 0; i < size; i++) {
                for(int j = 0; j < size; j++) {
                    System.out.print(matrix[i][j]+ " ");
                }
                System.out.println();
            }
            
        }
    }
}
