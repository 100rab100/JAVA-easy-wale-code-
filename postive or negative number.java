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
//Approach 2: Using Integer.signum() Method

//Java Integer class provides an inbuilt function signum() to check if a number is positive or negative. It is a static method that accepts a parameter of integer type.

//It returns 0, if the argument is 0.
//It returns 1, if the argument>0.
//It returns -1, if the argument<0.//
import java.util.*;

public class Main{
    public static int signump(int x)
    {
        int ans = Integer.signum(x);
        return ans;
    }


    public static void main(String[] args) {
        
        Scanner t=new Scanner(System.in);
        System.out.println ("Enter a  number ");
        int x=t.nextInt();
        int num=signump(x);


        //Conditions to check if the number is negative or positive
        if (num > 0)
            System.out.println ("The number is positive");
        else if (num < 0)
            System.out.println ("The number is negative");
        else
            System.out.println ("Zero");
    }
}

//
import java.util.*;

public class Main{



    public static void main(String[] args) {

        Scanner t=new Scanner(System.in);
        System.out.println ("Enter a  number ");
        int num=t.nextInt();
        String str;
        str = (num > 0.0) ? "positive" : "negative or zero";
        System.out.println("The number " + num + " is " + str);

    }
}






