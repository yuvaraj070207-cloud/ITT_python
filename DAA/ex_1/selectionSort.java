import java.util.Scanner;

public class selectionSort
{
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the total number of x in the array:");
		int n=in.nextInt();
		//array 
		int []arr;
		arr=new int[n];
		//getting element
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element:"+i+"==>");
			arr[i]=in.nextInt();
		}
		//sorting the elements of the array
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			if(min!=i)
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
			else continue;
		}
		System.out.println("SORTED ARRAY:");
		for(int k=0;k<n;k++)
		{
			System.out.print(arr[k]+"\t");
		}
		
		
	}

}

