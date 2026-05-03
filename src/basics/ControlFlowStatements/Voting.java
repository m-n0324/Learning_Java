package basics.ControlFlowStatements;

import java.util.Scanner;

public class Voting {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String name = sc.next();
        if (age >= 18){
            System.out.println( name+" is a valid voter.");
        }else{
            System.out.println( name+" is not a valid voter.");
            if(18-age == 1){
                System.out.println(name+" will be eligible in 1 year.");
            }else{
                System.out.println(name+" will be eligible in "+(18-age)+" years.");
            }

        }

    }
}
