package basics.While;

import java.util.Scanner;

public class SumDigit {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            int i = 1;
            int sum = 0;
            while(n!=0){
                int last= n%10;
                sum+=last;
                n=n/10;
                i++;
            }
            System.out.print(sum);
        }

    }
}
