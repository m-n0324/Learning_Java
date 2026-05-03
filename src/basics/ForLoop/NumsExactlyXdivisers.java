package basics.ForLoop;
import java.util.Scanner;
public class NumsExactlyXdivisers {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int finalCount= 0;
            // loop n tk factors count karega
            for (int i = 1 ; i<=n;i++){
                int count =0;
                // inner loop count karega
                for (int j=1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count == x){
                    finalCount++;
                }
            }
            System.out.print(finalCount);


        }


    }

}
