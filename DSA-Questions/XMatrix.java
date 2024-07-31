public class XMatrix {
    public static boolean checkXMatrix(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(i == j || i == grid[i].length - j - 1) {
                    if(grid[i][j] == 0)
                        return false;
                } else {
                    if(grid[i][j] != 0)
                        return false;
                }

            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] matrix = {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
        System.out.println(checkXMatrix(matrix));
    }
}
