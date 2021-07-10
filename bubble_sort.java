import java.util.Scanner;

class BubbleSort
{
	void bubble_sort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1])
				{
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
	}

	/* Prints the array */
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
		BubbleSort ob = new BubbleSort();
		System.out.println("Enter the number of array elements");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
		ob.bubble_sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
        sc.close();
	}
}