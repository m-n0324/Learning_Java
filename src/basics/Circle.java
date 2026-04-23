package basics;

import java.util.Scanner;

public class Circle {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        double circum = 2*(Math.PI)*r;
        double area = (Math.PI)*r*r;
        //  System.out.printf("%.2f",circum);
        //  System.out.printf("%.2f",area);
        System.out.println(Math.round(circum *100.0)/100.0);
        System.out.println(Math.round(area *100.0)/100.0);






    }
}
