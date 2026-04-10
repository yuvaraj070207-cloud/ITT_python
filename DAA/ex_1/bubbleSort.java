import java.util.*;
public class bubbleSort
{
   public static void main(String args[])
   {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the number of elements:");
      int n=in.nextInt();
      int []arr=new int[n];
      System.out.println("Enter the elements of the array:");
      for(int i=0;i<n;i++)
      {
	 arr[i]=in.nextInt();
      }
      System.out.println("UnSORTED ARRAY:");
      for(int num:arr)
      {
	 System.out.println(num+"");
      }
      boolean swapped;
      for(int i=0;i<n-1;i++)
      {
	 swapped=false;
	 for(int j=0;j<n-i-1;j++)
	 {
	    if(arr[j]>arr[j+1])
	    {
	       swapped=true;
	       int temp=arr[j];
	       arr[j]=arr[j+1];
	       arr[j+1]=temp;

	    }
	 }
	 if(!swapped)
	 {
	    break;
	 }
      }
      System.out.println("SORTED ARRAY:");
      for(int num:arr)
      {
	 System.out.println(num+"");
      }
   }
}
