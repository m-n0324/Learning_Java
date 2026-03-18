package basics;

import java.util.Scanner;

// simple program to  add two numbers
public class variables {
    public static void main (String []args){
        Scanner add = new Scanner(System.in);
        System.out.print("Enter First number:");
        int a = add.nextInt();
        System.out.print("Enter Second number:");
        int b = add.nextInt();
        int sum = a+b;
        System.out.println("Sum is :"+sum);

    }


}
// learning : when we endter first and second at one go it will not wait for sec to end
// and directly print sum
//Enter First number:2 7
//Enter Second number:Sum is :9
// normal case
//Enter First number:2
//Enter Second number:9
//Sum is :11
