import java.util.Scanner;
public class max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows and the number of columns of Matrix");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int M[][] = new int[row][col];
        System.out.println("Enter the elements of your Matrix");
        System.out.println("Your Matrix is : ");
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
        int max = 0;
        int n = 0;
        int min = M[n][0];
        for (int i = 0; i < row; i++){
            for (int j = 0; j <col; j++){
                if(M[i][j] > max){max = M[i][j];} 
                if(M[i][j] < min){min = M[i][j];} 
            }System.out.println("The Maximum Element of the row "+i+" is : "+max+"\n");
            System.out.println("The Minimum Element of the row "+i+" is : "+min+"\n");
            max = 0;
            n++;
            min = M[n][0];
        }    
        sc.close();
    }
}
