package basics.While;

import java.util.Scanner;

public class Strong {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            int sum=0;
            int temp =n;
            while (n!=0){
                int fact = 1;
                int i =1;
                int last = n%10;
                while(i<=last){
                     fact*=i;
                     i++;
                }
                sum+=fact;
                n=n/10;
                System.out.println(sum);
            }
            n = temp;
            System.out.print(n== sum?"Yes":"No");
        }
    }
}
