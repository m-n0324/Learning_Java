package basics;
import java.util.Scanner;


public class Swap {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c;
        c = b;
        b = a;
        a = c;
        System.out.println(a);
        System.out.println(b);
    }
}
