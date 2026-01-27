package Pattern_Printing;

import java.util.Scanner;

public class star_left_bottom_triangle {
    static void main() {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();

        int nsp=0;
        int nst=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("*");
            }
            nsp++;
            nst--;
            System.out.println();
        }
    }
}
