package basics.While;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            // double sqN= Math.sqrt(n);
            // int num = (int)sqN;
            // System.out.println((num*num)==n?"Yes":"No");
            if (n < 0) {
                System.out.println("No");
            } else {
                int i = 0; // Start at 0 to handle n = 0
                boolean isPerfect = false;

                // Only loop while the square is less than or equal to n
                while ((long) i * i <= n) {
                    if (i * i == n) {
                        isPerfect = true;
                        break; // Stop looking once we find it!
                    }
                    i++;
                }
                System.out.println(isPerfect ? "Yes" : "No");

            }


        }
    }
}
