package oops;

import java.util.Scanner;

public class ArrayOrder
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

        System.out.println("Same order:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nReverse order:");
        for(int i = n - 1; i >= 0; i--)
        {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}