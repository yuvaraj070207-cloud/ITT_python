import java.util.Scanner;

public class insertionSort
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        try 
	{
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            if (n < 0)
	    {
                throw new IllegalArgumentException("Number of elements cannot be less than 0.");
            }

            int[] A = new int[n];

            System.out.println("Enter the elements:");
            for (int i = 0; i<n; i++)
	    {
                int element = sc.nextInt();
                if (element < 0)
		{
                    throw new IllegalArgumentException("Element cannot be less than 0.");
                }
                A[i] = element;
            }

            // Insertion Sort
            for (int i = 1; i < n; i++)
	    {
                int v = A[i];
                int j = i - 1;

                while (j >= 0 && A[j] > v)
		{
                    A[j + 1] = A[j];
                    j = j - 1;
                }

                A[j + 1] = v;
            }

            System.out.println("Sorted array:");
            for (int i = 0; i < n; i++)
	    {
                System.out.print(A[i] + " ");
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
}
