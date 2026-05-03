package basics.While;

import java.util.Scanner;

public class Neon {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("No");
        }
        int sum =0;
        int sq = n*n;
        while(sq!=0){
            int last = sq%10;
            sum+=last;
            sq=sq/10;
        }
        if(sum==n){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
