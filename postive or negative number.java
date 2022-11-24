import java.util.*;

public class Main{


    public static void main(String[] args) {
        int num;
        Scanner t=new Scanner(System.in);
        System.out.println ("Enter a  number ");
        num=t.nextInt();


        //Conditions to check if the number is negative or positive
        if (num > 0)
            System.out.println ("The number is positive");
        else if (num < 0)
            System.out.println ("The number is negative");
        else
            System.out.println ("Zero");
    }
}



