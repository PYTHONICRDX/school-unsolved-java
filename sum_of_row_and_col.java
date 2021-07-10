import java.util.*;
public class sum_of_row_and_col{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of your mstrix respectively : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int M[][] = new int[row + 1][col + 1];
        System.out.println("Enter the elements of your matrix : ");
        for(int i =0; i<row; i++){
            for(int j = 0; j < col; j++){
                M[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n Your matrix is : ");
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j++){
                System.out.print(M[i][j]);
            }System.out.println();
        }

        for (int i = 0; i < row; i++){
            int sum = 0;
            for(int j = 0; j < col; j ++){
                sum = sum + M[i][j];
            }M[i][row] = sum;
        }

        for(int i = 0; i <= col; i++){
            int sum = 0;
            for(int j = 0; j <row; j++){
                sum = sum + M[j][i];
            }M[row][i] = sum;
        }

        System.out.println("\n The new Matrix is : ");
        for (int i = 0; i < row+1; i++){
            for(int j = 0; j < col + 1; j++){
                System.out.print(M[i][j]+" ");
            }System.out.println();
        }
        sc.close();
    }
}