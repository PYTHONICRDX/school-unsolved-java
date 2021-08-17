// writing a program to take input and check whether the number is a happy number or not using recursion logic
import java.util.*; // importing all classes of util package
class Happy // declaring the class name
{
    int n,num; // declaring the instance variables
    Scanner sc=new Scanner(System.in); // creating the scanner class object
  
      Happy() // non parameterized constructor created to initialise n with its default value i.e 0
    {
        n=0;
    }
    
    void getnum() // this is a non returnable function to take the number input from the user
    {
        System.out.println("Enter the number ");
        n= sc.nextInt(); // taking input
    }
    
    int sum_sq_digits(int x) // this function returns the sum of square of the digits
    {
       if(x/10==0)
       return x*x;
       else
       return (int)Math.pow(x%10,2)+ sum_sq_digits(x/10);
    }
    
    void ishappy() // this is a non returnable function to check whether the number is a happy number or not
    {
        while((num=sum_sq_digits(n))/10!=0) // while loop to check whether the number is happy number or not
        {
            n=num;
        }
        if ( num==1) 
        System.out.println("It is a happy number ");
        else
        System.out.println("Not a happy number");
    }
    // finally declaring the main function to call the above functions
    public static void main(String args[])
    {
        Happy ob = new Happy(); // creating ob object of the Happy class
        ob.getnum();
        ob.ishappy();
    }
}
