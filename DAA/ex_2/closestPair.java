import java.util.Scanner;
public class closestPair 
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x1=0,x2=0,y1=0,y2=0;
        int n;
        double dist, minDist;

        System.out.println("Enter the Number of Points:");
        n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        // Input coordinates
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the X-Coordinate of point " + (i + 1) + ":");
            x[i] = sc.nextInt();

            System.out.println("Enter the Y-Coordinate of point " + (i + 1) + ":");
            y[i] = sc.nextInt();
        }

        // Display points
        for (int i = 0; i < n; i++) {
            System.out.println("Point " + (i + 1) + ": (" + x[i] + ", " + y[i] + ")");
        }

        // Initialize minimum distance
        minDist = Double.MAX_VALUE;

        // Calculate distances between all pairs
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                dist = Math.sqrt(
                        (x[i] - x[j]) * (x[i] - x[j]) +
                        (y[i] - y[j]) * (y[i] - y[j])
                );

                System.out.println(
                        "Distance between Point " + (i + 1) +
                        " and Point " + (j + 1) +
                        " = " + dist
                );

                if (dist < minDist)
		{
                     minDist = dist;
		     x1=x[i];
		     y1=y[i];
		     x2=x[j];
		     y2=y[j];
                }
            }
        }

	System.out.println("Between the points:"+'('+x1+','+y1+')'+"and"+'('+x2+','+y2+')');
        System.out.println("Minimum Euclidean Distance:"+minDist);


	

        sc.close();
    }
}
