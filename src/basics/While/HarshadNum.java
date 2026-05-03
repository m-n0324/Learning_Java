package basics.While;

import java.util.Scanner;

public class HarshadNum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            int sum = 0;
            int temp = n;
            while(n!=0){
                int last = n%10;
                sum+=last;
                n=n/10;
            }
            n=temp;
            System.out.println(n%sum==0?"Yes":"NO");
        }

    }

}
