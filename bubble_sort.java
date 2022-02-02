import java.util.*; // importing all the classes of the util package
public class BubbleSort // class name declaration
{
	int bubble_sort(int arr[]) // this is the method which takes an array input and sorts the array using bubble sorting technique using ascending order
	{
		int n = arr.length; // this is to find the length of the array
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (arr[j] > arr[j+1])
				{
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
                return arr;
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
		System.out.println("Sorted array");
		ob.printArray(ob.bubble_sort(arr));
        sc.close();
	}
}
