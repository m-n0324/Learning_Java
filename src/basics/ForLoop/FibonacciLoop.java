package basics.ForLoop;

import java.util.Scanner;

public class FibonacciLoop {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            int first =0;
            int second = 1;
            for(int i =0;i<n;i++){
                System.out.print(first +" ");
                int next = first+ second;
                first = second;
                second = next;
            }
        }
        sc.close();
    }
}
