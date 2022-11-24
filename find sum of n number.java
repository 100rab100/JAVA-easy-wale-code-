  // Sum of n Natural Numbers
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int n=sc.nextInt();
     
           int sum=0;
           
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        
        System.out.println("Sum of "+n+" Number is "+sum);
        
        
    }
//
import java.util.*;

public class Main{



    public static void main(String[] args) {
        int sum=0;
        Scanner t=new Scanner(System.in);
        System.out.println ("Enter a  number ");
        int num=t.nextInt();

            sum=num*(num+1)/2;


        //String string_num=String.valueOf(num);
        System.out.println(sum);
        }
