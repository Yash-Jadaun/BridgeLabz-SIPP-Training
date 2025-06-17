import java.util.Arrays;
import java.util.Random;

public class Ques22 {

    public static int[][] createRandomMatrix(int rows, int cols, int minVal, int maxVal) {
        if (rows <= 0 || cols <= 0) {
            System.out.println("Rows and columns must be positive.");
            return null;
        }
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(maxVal - minVal + 1) + minVal;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Matrix is null.");
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA == null || matrixB == null || matrixA.length == 0 || matrixB.length == 0 || matrixA[0].length == 0 || matrixB[0].length == 0) {
            System.out.println("One or both matrices are null or empty.");
            return null;
        }
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            System.out.println("Matrices must have the same dimensions for addition.");
            return null;
        }

        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return resultMatrix;
    }

    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA == null || matrixB == null || matrixA.length == 0 || matrixB.length == 0 || matrixA[0].length == 0 || matrixB[0].length == 0) {
            System.out.println("One or both matrices are null or empty.");
            return null;
        }
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            System.out.println("Matrices must have the same dimensions for subtraction.");
            return null;
        }

        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return resultMatrix;
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA == null || matrixB == null || matrixA.length == 0 || matrixB.length == 0 || matrixA[0].length == 0 || matrixB[0].length == 0) {
            System.out.println("One or both matrices are null or empty.");
            return null;
        }
        if (matrixA[0].length != matrixB.length) {
            System.out.println("Number of columns in first matrix must be equal to number of rows in second matrix for multiplication.");
            return null;
        }

        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        int[][] resultMatrix = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return resultMatrix;
    }

    public static void main(String[] args) {
        int rows1 = 2;
        int cols1 = 3;
        int[][] matrix1 = createRandomMatrix(rows1, cols1, 1, 10);
        System.out.println("Matrix 1:");
        printMatrix(matrix1);

        int rows2 = 2;
        int cols2 = 3;
        int[][] matrix2 = createRandomMatrix(rows2, cols2, 1, 10);
        System.out.println("\nMatrix 2:");
        printMatrix(matrix2);

        int[][] sumMatrix = addMatrices(matrix1, matrix2);
        if (sumMatrix != null) {
            System.out.println("\nSum of Matrix 1 and Matrix 2:");
            printMatrix(sumMatrix);
        }

        int[][] diffMatrix = subtractMatrices(matrix1, matrix2);
        if (diffMatrix != null) {
            System.out.println("\nDifference of Matrix 1 and Matrix 2:");
            printMatrix(diffMatrix);
        }

        int[][] matrixA = createRandomMatrix(2, 3, 1, 5);
        int[][] matrixB = createRandomMatrix(3, 2, 1, 5);

        System.out.println("\nMatrix A (2x3):");
        printMatrix(matrixA);
        System.out.println("\nMatrix B (3x2):");
        printMatrix(matrixB);

        int[][] productMatrix = multiplyMatrices(matrixA, matrixB);
        if (productMatrix != null) {
            System.out.println("\nProduct of Matrix A and Matrix B:");
            printMatrix(productMatrix);
        }
    }
}