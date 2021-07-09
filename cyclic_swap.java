import java.util.Scanner;

public class cyclic_swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of your matrix : ");
        int row = sc.nextInt();
        int col =sc.nextInt();
        int M[][] = new int[row][col];
        System.out.println("Enter your array elements : ");
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j++){
                M[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your default array is : ");
        for(int i = 0; i < row; i++){
            for(int j=0; j < col ; j++){
                System.out.print(M[i][j] + "   ");
            }System.out.println();
        }
        
        for(int i = 0; i < row; i ++){
            for (int j = 0; j < row; j++){
                if (i == 0){
                    int temp = M[i][j];
                    M[i][j] = M[row-1][j];
                    M[row-1][j] = temp;
                }
                else{
                    int temp = M[i][j];
                    M[i][j] = M[i - 1][j];
                    M[i - 1][j] = temp;
                }
                
            }
        }
        System.out.println("Your default array is : ");
        for(int i = 0; i < row; i++){
            for(int j=0; j < col ; j++){
                System.out.print(M[i][j] + "   ");
            }System.out.println();
        }

        sc.close();
    }
}