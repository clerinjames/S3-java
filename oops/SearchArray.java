package oops;
import java.util.Scanner;

public class SearchArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int search = sc.nextInt();

        int found = 0;

        for(int i = 0; i < n; i++)
        {
            if(a[i] == search)
            {
                System.out.println("Number found at position " + (i + 1));
                found = 1;
                break;
            }
        }

        if(found == 0)
        {
            System.out.println("Number not found");
        }
        sc.close();
    }
}
