package basics;
import java.util.Scanner;

public class Sum {
    public static void main (String[]args) {
        int a; // declaration of variable
        a = 10;// initialization
        int b = 16;
        int sum = a + b;
        System.out.println(sum);
        System.out.println("sum of " + a + " & " + b + " is " + a + b);
        /* reason is a+b+c+d  we add this like a+b then result +c then
        result1+d then final answer.
          String+string = string (concatenation)
          String+int = string (concatenation)
          int+int=int (sum)  */
        System.out.println("sum of " + a + " & " + b + " is " + (a + b));
        // final int b=10; this becomes constant here . you cant change value
    }
}

