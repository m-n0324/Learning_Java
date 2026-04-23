package basics;
import java.util.Scanner;

public class Triangle {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double s=(a+b+c)/2;
        double A = s*(s-a)*(s-b)*(s-c);
        double ans = Math.sqrt(A);

        System.out.printf("%.2f",ans);



    }
}