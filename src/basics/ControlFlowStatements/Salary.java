package basics.ControlFlowStatements;

import java.util.Scanner;

public class Salary {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        char gender =  input.next().charAt(0);
        int time = input.nextInt();
        char quli = input.next().charAt(0);
        if (gender == 'M'){
            if(time >= 10){
                if (quli == 'P'){
                    System.out.println("15000");
                }else if(quli == 'U') {
                    System.out.println("10000");
                }
            }else if (time < 10){
                if (quli == 'P'){
                    System.out.println("10000");
                }else if (quli == 'U') {
                    System.out.println("7000");
                }

            }
        }else if (gender == 'F'){
            if(time >= 10){
                if (quli == 'P'){
                    System.out.println("12000");
                }else if (quli == 'U') {
                    System.out.println("9000");
                }
            }else if (time < 10){
                if (quli == 'P'){
                    System.out.println("10000");
                }else if(quli == 'U') {
                    System.out.println("6000");
                }

            }

        }
        input.close();



    }

}
