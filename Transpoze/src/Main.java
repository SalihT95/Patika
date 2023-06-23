public class Main {
    public static void main(String[] args) {
        int [][] matrix = { {1,2,3},
                            {4,5,6} };
        System.out.println("Original");
        printArray(matrix);
        System.out.println("Transpoze");

        int [][] newMatrix = new int [matrix[0].length][matrix.length];// Here we created new matrix.
        for (int rows = 0; rows < matrix.length; rows++) { //With this for loop, we first look at the rows of the matrix.
            for (int col = 0; col < matrix[0].length; col++) { //And with this for loop, we look at the columns of the matrix.
                newMatrix[col][rows] = matrix [rows][col]; //With this operation we changed the rows and columns.
            }
        }
        printArray(newMatrix);//matrisi yazırma
    }

    public static void printArray(int [][] matrix) { // matrisi yazdırmak için fonksiyon
        for (int [] rows : matrix) {
            for (int col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}