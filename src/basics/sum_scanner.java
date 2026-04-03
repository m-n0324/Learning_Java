package basics;
import java.util.Scanner;


public class sum_scanner {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a+b);
    }
/*
 example1 input 10              ex2        10
               20                          -10
       output  30                            0
 */
}
