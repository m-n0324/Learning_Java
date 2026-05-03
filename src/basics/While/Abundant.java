package basics.While;

import java.awt.*;
import java.util.Scanner;

public class Abundant {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            int i =1;
            int sum=0;
            while(i<=n/2){
                if(n%i==0){
                    sum+=i;
                }
                i++;
            }
            System.out.println(sum>n?"yes":"no");

        }

    }
}
