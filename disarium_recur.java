import java.util.Scanner;
class Disarium
{
    int num; //to store the number
    int size; //to store the size
    
    Disarium(int nn)
    {
        num = nn;
        size = 0;
    }
    
    void countDigit()
    {
       int len = (""+num).length();
       size = len;
    }
    
    //function the give sum of digits raised to the power
    int sumofDigits(int n, int p)
    {
        if(n==0)
            return 0;
        else
            return (int)Math.pow((n%10),p) + sumofDigits((n/10), p-1);
    }
    
    void check()
    {
        if(num == sumofDigits(num, size))
            System.out.println(num + " is a Disarium Number");
        else
            System.out.println(num + " is not a Disarium Number");
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Disarium obj = new Disarium(n);
        obj.countDigit();
        obj.check();
        sc.close();
    }
}