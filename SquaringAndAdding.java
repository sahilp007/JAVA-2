import java.util.Scanner;
public class Squaring
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a[] = new int[11];
        int x[] = new int[11];
        int t=0;
        //Entering 10 values
        System.out.println("Enter 10 values ");
        for (int i=1 ; i<=10 ; i++)
        {
            System.out.println("Enter " + i + "term ");
            a[i]= s.nextInt();

        }
        //Square of each value
        System.out.println("Square of the Numbers");
        for (int k=0 ; k<10 ; k++)
        {
            x[k]= a[k]*a[k];
            System.out.println(x[k]);
            //...Sum... 
             t=t+x[k];
        }
        //Printing the sum.
        System.out.println("Sum is: " + t);
    }
}
