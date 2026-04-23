package basics;

import java.util.Scanner;

public class Pieces {
    public static void main(String[] info) {
//        int flair = 15;
//        if(flair >= 15 && flair < 37) {
//            System.out.print("Not enough");
//        }
//        if(flair == 37) {
//            System.out.print("Just right");
//        }
//        else {
//            System.out.print("Too many");
//        }
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gender (M/F): ");
        String gen = sc.next();

        // Use .equals() for comparison and || for "OR" logic
        if (gen.equals("M") || gen.equals("m")) {
            System.out.println("Hello, Sir!");
        } else if (gen.equals("F") || gen.equals("f")) {
            System.out.println("Hello, Ma'am!");
        } else {
            System.out.println("Hello, Guest!");
        }

        sc.close(); // Good practice to close the scanner




    }
}