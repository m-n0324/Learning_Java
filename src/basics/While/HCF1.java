package basics.While;

import java.util.Scanner;

public class HCF1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int a=sc.nextInt();
            int b=sc.nextInt();
            while(a!=b){
                if(a>b){
                    a= a-b;
                }
                else{
                    b=b-a;
                }
            }
            System.out.println(a);
        }

    }
}
