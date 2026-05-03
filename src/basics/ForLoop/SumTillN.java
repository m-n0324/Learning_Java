package basics.ForLoop;

import java.util.Scanner;

public class SumTillN {
    public  static void main (String []agrs){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
        sc.close();


    }
}
