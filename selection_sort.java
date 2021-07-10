import java.util.Scanner;

// Java program for implementation of Selection Sort
class SelectionSort
{
    void sort(int arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
 
    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    // Driver code to test above
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        SelectionSort ob = new SelectionSort();
        System.out.println("Enter the number of array elements");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
        sc.close();
    }
}