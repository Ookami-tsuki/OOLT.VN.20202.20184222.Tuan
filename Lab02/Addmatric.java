import java.util.Scanner;
public class Addmatric {
    public static void main(String[] args) {
        int rows , columns ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rows : ");
        rows = scanner.nextInt();
        System.out.println("Columns : ");
        columns=scanner.nextInt();
        int[][] MatrixA=new int[rows][columns];
        int[][] MatrixB=new int[rows][columns];
        System.out.println(" Enter the matrix A : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("a[%d][%d] = ", i,j);
                MatrixA[i][j] = scanner.nextInt();
            }
        }
        System.out.println(" Enter the matrix B : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("a[%d][%d] = ", i,j);
                MatrixB[i][j] = scanner.nextInt();
            }
        }
       
        int[][] sum = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = MatrixA[i][j] + MatrixB[i][j];
            }
        }
        System.out.println("Sum of matric");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + "    ");
            }
            System.out.println();
        }
    }
}