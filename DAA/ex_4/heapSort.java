import java.util.Scanner;

public class heapSort
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = 0;

        try
	{
            System.out.println("Enter number of elements:");
            n = in.nextInt();

            if (n < 0)
	    {
                throw new IllegalArgumentException("Number of elements cannot be less than 0.");
            }

            int[] arr = new int[n + 1];

            for (int i = 1; i <= n; i++) 
	    {
                System.out.println("Enter element " + i + ":");
                int element = in.nextInt();

                if (element < 0)
		{
                    throw new IllegalArgumentException("Element cannot be less than 0.");
                }

                arr[i] = element;
            }

            // BUILD MAX HEAP
            for (int i = n / 2; i >= 1; i--)
	    {
                heapify(arr, n, i);
            }

            // HEAP SORT
            for (int i = n; i >= 2; i--)
	    {
                int temp = arr[1];
                arr[1] = arr[i];
                arr[i] = temp;

                heapify(arr, i - 1, 1);
            }

            System.out.println("Sorted Array:");
            for (int i = 1; i <= n; i++)
	    {
                System.out.print(arr[i] + " ");
            }
        }
	catch (IllegalArgumentException e) 
	{
            System.out.println("Error: " + e.getMessage());
        }
	catch (Exception e)
	{
            System.out.println("Invalid input.");
        }
    }

    public static void heapify(int arr[], int n, int i)
    {
        int k = i;
        int v = arr[k];
        boolean heap = false;

        while (!heap && 2 * k <= n)
	{
            int j = 2 * k;

            if (j < n && arr[j + 1] > arr[j])
            {
                j = j + 1;
            } 

            if (arr[k] < arr[j])
            {
                arr[k] = arr[j];
                k = j;
            } 
            else
            {
                heap = true;
            } 
        }

        arr[k] = v;
    }
}
