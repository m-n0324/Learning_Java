package basics.While;

import java.util.Scanner;

public class ReverseNum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            int rev = 0;
            while(n!=0){
                int last = n%10;
                rev = rev *10+last;
                n=n/10;
            }
            System.out.print(rev);
        }
        sc.close();

    }
}
