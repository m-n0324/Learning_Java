package basics.While;

import java.util.Scanner;

public class Palindrome {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            int rev=0;
            int temp = n;
            while (n!=0){
                int last = n%10;
                rev = rev*10+last;
                n = n/10;
            }
            n = temp;

            System.out.print(rev == n ? "Palindromic number" : "No Palindromic number");

        }

    }
}
