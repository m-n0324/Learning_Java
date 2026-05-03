package basics.ForLoop;

import java.util.Scanner;

public class FactorsOfN {
    public static void main (String [] agrs){
        Scanner sc = new Scanner (System.in);
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            for (int i=1;i<=n;i++){
                if(n%i==0){
                    System.out.print(i+" ");
                }
            }
        }
        sc.close();
    }
}
