import java.util.*;
public class replace_dia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and column numbers of your Matrix");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int M[][] = new int[row][col];
if(row == col && row != 1 && col != 1) {        System.out.println("Enter the elements of your Matrix : ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j <col; j++){
                M[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your Matrix is : ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j <col; j++){
                System.out.print(M[i][j] + "    ");
            }System.out.println("\n");
        }       

        for (int i = 0; i < row; i++){
            for (int j = 0; j <col; j++){
                if(i == j){M[i][j] = 5;}
                else if(i+j == row - 1){M[i][j] = 0;}
            }
        }

        System.out.println("Your new Matrix is : ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j <col; j++){
                System.out.print(M[i][j] + "    ");
            }System.out.println("\n");
        }  }
        else{System.out.println("Either Not a square matrix or Rows and columns are equal to 1");}  
        sc.close();
    }
}
