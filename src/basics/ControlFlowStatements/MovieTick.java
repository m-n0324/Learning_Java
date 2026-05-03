package basics.ControlFlowStatements;

import java.util.Scanner;

public class MovieTick {
    public static void main (String []args){
        Scanner sc  = new Scanner (System.in);
        float rate = sc.nextFloat();

        if(rate <= 2.0f){
            System.out.println("Flop");
        }else if (rate > 2.0f && rate <= 3.4f){
            System.out.println("Semi-hit");
        }else if (rate > 3.4f && rate <= 4.5f){
            System.out.println("Hit");
        }else if  (rate > 4.5f && rate <= 5.0f){
            System.out.println("Super Hit");
        }
        sc.close();

    }
}
