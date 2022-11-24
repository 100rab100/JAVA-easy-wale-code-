public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter a Number");
       int n=scan.nextInt();
       int count=0;
       while(n>0)
       {
        n=n/10;
        count++;
       }
        System.out.println(count);
    }
//
import java.util.*;

public class Main{



    public static void main(String[] args) {
        int count=0;
        Scanner t=new Scanner(System.in);
        System.out.println ("Enter a  number ");
        int num=t.nextInt();
        String string_num=Integer.toString(num);
        System.out.println(string_num.length());
        }


    
}
