package basics;

import java.util.Scanner;

public class Buffer {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Age:");
        int age = Integer.parseInt(input.nextLine());
        System.out.print(" Now Enter Name:");
        String name = input.nextLine();
        System.out.print("Your Age is: "+age+ " and Your name is:"+name);
    }
}
//Enter Age:15
// Now Enter Name:
//Your Age is: 15 and Your name is:
// here the problem is not waiting to enter name happens because of how the input
// buffer handles the "Enter" key (the newline character \n). when age 15 press enter
// buffer 15\n so it read 15 but leaves the \n sitting thereWhen you call nextLine(),
// it looks at the buffer sees the \n, and thinks, "Oh, the user already pressed Enter!"
// It immediately returns an empty string and moves to the next line of code
// effectively "skipping" your input.
// solution : int age = Integer.parseInt(input.nextLine());
//Convert that String to an integer using Integer.parseInt().
