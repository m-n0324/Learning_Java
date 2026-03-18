package basics;

import java.util.Scanner;

public class FirstWord {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String firstWord = input.next();
        System.out.print(firstWord);
        input.close();
    }
}
// Explanation : next() — The "Word" Picker means it stops when it finds space.
//nextLine() — The "Sentence" Picker means reads everything until it hits a
// newline character (\n), which is created when you press the Enter key.
// It doesn't care about spaces; it wants the whole line.
// so if you Want first word then use next()