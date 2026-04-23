package basics;

import java.util.Scanner;

public class Sphere {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area= 4*(Math.PI)*r*r;
        System.out.println(area);

    }
}
