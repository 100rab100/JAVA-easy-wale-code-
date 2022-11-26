 // Program to Print AP Series
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Program to print AP Series");
        System.out.println("Enter a, d and n");
        int a=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        
        int term=a;
        for(int i=0;i<n;i++)
        {
            System.out.print(term+",");
            term=term+d;
        }     
        
        
    }    
}
///Time complexity: O(n) where n is the total number of terms of a given A.P

Auxiliary Space: O(1)
 
 
 //
 

import java.util.Arrays;
import java.util.Scanner;

public class Main {





            static void printAP(int d, int n, int current) {
                System.out.print(current + " ");

                if (n == 0)
                    return;

                printAP(d, n - 1, current + d);
            }

            public static void main(String[] args) {
                int a, d, n;
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the values of a, d and n : ");
                a = sc.nextInt();
                d = sc.nextInt();
                n = sc.nextInt();

                printAP(d, n - 1, a);
            }
       



}





