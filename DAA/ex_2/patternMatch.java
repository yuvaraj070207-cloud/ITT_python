import java.util.Scanner;

public class patternMatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text, pattern;
        boolean found = false;

        System.out.println("Enter the Text:");
        text = sc.nextLine();
	
	

        System.out.println("Enter the Pattern:");
        pattern = sc.nextLine();

        char[] ch=text.toCharArray();
	int n=0;
	for(char c:ch)
	{
	   n++;
	}
	char[] ch1=pattern.toCharArray();
	int m=0;
	for(char c:ch1)
	{
	   m++;
	}



        for (int i = 0; i <= n - m; i++) {
            int j = 0;

            while (j < m && pattern.charAt(j) == text.charAt(i + j))    //compare the character of index j and i+j
	    {
                j++;
            }

            if (j == m)
	    {
                System.out.println("Pattern found at index: " + i);
                found = true;
                break;  
            }
        }

        if (!found) {
            System.out.println("Pattern not found");
        }

        sc.close();
    }
}
