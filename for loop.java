import java.lang.*;
import java.util.*;

class first
{
    public static void main(String args[]) {
        for (int i=10;i>0;--i)
        {
            System.out.println(i);
        }

    }
}


// second 


public class LoopPractice1 {

    public static void main(String[] args) {
        //for(int i=0;i<=10;i++)  // simple for loop
        //for(int i=0;i>0;i--)   /// no output
        
        //int i=0;
        //for(System.out.println("Hi");i<=10;i++)// tula jas vatal tas tu initialize  karu shakto 
        //for(;;)   // all are optional ...infinite  loop
        
        for(int i=0,j=1;i<=10;i++,j=j*2)
        {
            System.out.println(i);
        }
    }
    
}
