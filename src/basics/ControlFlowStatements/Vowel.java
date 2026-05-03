package basics.ControlFlowStatements;

import java.util.Scanner;

public class Vowel {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        char a = sc.next().charAt(0);
        String vowel = "aeiouAEIOU";

        // 1. First, check if the character is even a letter
        if (!Character.isLetter(a)) {
            System.out.println("Invalid input");
        }
        // 2. If it's a letter, check if it's in our vowel string
        else if (vowel.indexOf(a) != -1) {
            System.out.println("Vowel");
        }
        // 3. If it's a letter but not a vowel, it must be a consonant
        else {
            System.out.println("Consonant");
        }

        sc.close();
    }
}
