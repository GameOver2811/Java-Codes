import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.Arrays;

public class SetMatrixZero {
    public static void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] column = new int[matrix[0].length];
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                if(row[i] ==1 || column[j] == 1) matrix[i][j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        for(int[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }
    }
}
