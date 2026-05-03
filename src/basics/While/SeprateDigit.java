package basics.While;

import java.util.Scanner;

public class SeprateDigit {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            int i = 0;
            while(n!=0){
                int last = n%10;
                System.out.println(last);
                n=n/10;
                i++;
            }


        }
        sc.close();

    }
}
