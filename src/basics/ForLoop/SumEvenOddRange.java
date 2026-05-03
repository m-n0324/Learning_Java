package basics.ForLoop;

import java.util.Scanner;

public class SumEvenOddRange {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        if(start > end){
            int temp = start;
            start = end;
            end = temp;
        }
        int evensum=0;
        int oddsum=0;
        for ( int i = start ;i<=end;i++){
            if(i%2==0){
                evensum+=i;
            }else{
                oddsum+=i;
            }
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
