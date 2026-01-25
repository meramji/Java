package Pattern_Printing;

import java.util.Scanner;

public class Star_plus {
    static void main() {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();

        for(int i=1;i<2*n;i++){
            for(int j=1;j<=2*n;j++){
                if(j%n==0){
                    System.out.print("*")   ;
                }
                else{
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }
}
