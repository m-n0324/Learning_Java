package ControlFlowStatements;

import java.util.Scanner;

public class Discount {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        double amt = sc.nextDouble();
        double dis = 0;
        if(amt >=0 && amt <=5000){
            dis = 0;
        }else if (amt >= 5001 && amt <= 7000){
            dis = 0.05;
        }else if(amt >= 7001 && amt <= 9000){
            dis = 0.10;
        }else {
            dis = 0.20;
        }
        double sum = amt -(amt*dis);
        System.out.println((int)sum + " dis "+ dis);

        sc.close();
    }
}
