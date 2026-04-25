package ControlFlowStatements;

import java.util.Scanner;

public class GreaterBtwAB {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a<b){
            System.out.println("greater number is:"+ b);
        }else{
            System.out.println( "greater number is:"+a);
        }
        sc.close();
    }

}
