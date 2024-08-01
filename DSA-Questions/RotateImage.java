import java.util.Arrays;

public class RotateImage {
    public static void transpose(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void reverseRow(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            int left = 0, right = matrix[i].length - 1;
            while(left <= right) {
                int temp = matrix[i][left];
                matrix[i][left++] = matrix[i][right];
                matrix[i][right--] = temp;
            }
        }
    }
    public static void rotate(int[][] matrix) {
        transpose(matrix);
        reverseRow(matrix);
    }
    public static void main(String[] agrs) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Before Rotation : ");
        for(int[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }
        rotate(matrix);
        System.out.println("After Rotation : ");
        for(int[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }
    }
}
