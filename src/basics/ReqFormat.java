package basics;

import java.util.Scanner;

public class ReqFormat {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        if(input.hasNextInt()) {
            int age = input.nextInt();
            System.out.println("Your age is" + age);
        }else{
            System.out.println("Required Format to enter age is Integer.");
        }
    }
}
