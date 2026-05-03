package basics.While;

import java.util.Scanner;

public class Automorphic {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        if( sc.hasNextInt()){
            int n = sc.nextInt();
            int c=0;
            int temp =n;
            while(n!=0){
                int last =n%10;
                c=c+1;
                n=n/10;
            }
            n=temp;
            long sq=(long)n*n;
            long ans=sq%((int)Math.pow(10,c));
            System.out.print(ans==n? "Yes":"No");



        }

    }
}
