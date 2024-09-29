public class Matrix {
    public static void main(String[] args) {
  
        final int[][] MATRIX_A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        final int[][] MATRIX_B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int rows = MATRIX_A.length;
        int cols = MATRIX_A[0].length;

        int[][] sumMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = MATRIX_A[i][j] + MATRIX_B[i][j];
            }
        }
		
		
		System.out.println("A =");
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(MATRIX_A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______________________________");
		
		System.out.println("B =");
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(MATRIX_B[i][j] + " ");
            }
            System.out.println();
        }
		        System.out.println("______________________________");

        System.out.println("A + B =");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
