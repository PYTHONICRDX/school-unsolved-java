import java.util.Scanner;
public class dia_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of your Matrix respectively");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int M[][] = new int[row][col];
        System.out.println("Enter the elements of your matrix here");
        for(int i = 0; i<row; i++){
            for(int j = 0; j< col; j++){
                M[i][j] = sc.nextInt();
            }
        }
        System.out.println("your matrix is : ");
        for(int i = 0; i<row; i++){
            for(int j = 0; j< col; j++){
                System.out.print(M[i][j]+"  ");
            }System.out.println();
        }        

        int sum = 0;
        if (row == col){
            for(int i = 0; i <row; i++){
                for(int j = 0; j < row; j++){
                    if(i == j){ sum = sum + M[i][j];}
                    else if(i + j == col-1){sum = sum + M[i][j];}
                }
            }
            
        System.out.println("The sum of your diagonals is : "+sum);
        }
        else{ 
        System.out.println("This is not a square matrix so diagonal sum can not be calculated");
        }
        sc.close();        
    }
}
