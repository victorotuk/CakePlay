package cake.play;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class CakePlay {

/*fair cake cutting problem from hackerank, 
i got the solution from the discussions*/


    static long howManyToInvite(long A, long B, long a) { 
      
        
        double b = (double) A/(double)B;
          
        return  (long) (a/b);
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            long A = in.nextLong();
            long B = in.nextLong();
            long a = in.nextLong();
            long b = howManyToInvite(A, B, a);
            System.out.println(b);
        }
    }
}
