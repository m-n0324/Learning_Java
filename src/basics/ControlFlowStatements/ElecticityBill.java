package basics.ControlFlowStatements;

import java.util.Scanner;

public class ElecticityBill {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int units = sc.nextInt();
        int u100 = 420, u200= 1020 , u400 = 2620;
        double amt = 0;
        if (units <= 100 ){
            amt = (units * 4.2);
        }else if (units >= 101 &&  units <= 200){
            amt = u100+ (units-100)*6;
        }else if(units >= 201 && units<=400){
            amt = u200 + (units - 200)* 8;
        }else if ( units >400){
            amt = u400 + (units - 400)*13;
        }
        System.out.println(amt);


    }
}
