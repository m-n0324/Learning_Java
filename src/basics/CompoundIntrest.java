package basics;
import java.util.Scanner;


public class CompoundIntrest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        double R = sc.nextDouble();
        int  T = sc.nextInt();
        int  n = sc.nextInt();

        double base = 1+(R/n);
        double power = (double)n*T;
        double A = P* Math.pow(base,power);
        double CI = A - P;
        System.out.printf("%.2f\n", CI);;






    }
}
    
    