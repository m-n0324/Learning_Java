package ControlFlowStatements;

import java.util.Scanner;

public class Greet {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);//
        if (a == 'M' || a == 'm'){
            System.out.println("Hello, Sir!");
        }else if(a == 'F' || a == 'f'){
            System.out.println("Hello, Ma'am!");
        }else {
            System.out.println("Hello, Guest!");
        }

        sc.close();



    }
}
