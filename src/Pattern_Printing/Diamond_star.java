package Pattern_Printing;

import java.util.Scanner;

public class Diamond_star {
    static void main() {
        Scanner sc=new Scanner (System.in);

        System.out.println("enter the n");
        int n=sc.nextInt();

        int nsp=n-1;
        int nst=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("*");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }

        nsp=1;
        nst=n+1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("*");
            }
            nsp++;
            nst=nst-2;
            System.out.println();
        }
    }
}
