/* */
import java.util.*;
public class boud_inner_sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of your matrix : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int M[][] = new int[row][col];
    if(row == 1 && col == 1){
System.out.println("Since both row and columns are present, there will be no boundary elements");
}
else if(row == col){
        System.out.println("Enter the elements of your Matrix : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                M[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your matrix is : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(M[i][j] + "   ");
            }System.out.println("\n");
        }


        
        System.out.println("The boundary elements are : ");
        int bsum = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(i == 0|| j == 0|| i == row-1 || j == col || i + j == row){System.out.println(M[i][j]);bsum = bsum + M[i][j];}
            }
        }
        System.out.println("The sum of the boundary elements is : "+bsum);
        System.out.println("The non boundary elements are : ");
        int nbsum = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(i != 0&& j != 0&& i != row-1 && j != col && i+j != row){System.out.println(M[i][j]);nbsum = nbsum + M[i][j];}
            }
        }System.out.println("The sum of the non boundary elements is : "+nbsum);
    }

else{
    System.out.println("This is not a square matrix");
}       
        sc.close();
    }
}