import java.util.Scanner;
class sum{
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
        for(int i = 0; i<row; i++){
            for(int j = 0; j< col; j++){
                sum = sum + M[i][j];
            }
        }        
        sc.close();
        System.out.println("The sum of all elements of your matrix is: "+sum);
    }
}