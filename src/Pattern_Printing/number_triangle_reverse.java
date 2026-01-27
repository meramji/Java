package Pattern_Printing;

import java.util.Scanner;

public class number_triangle_reverse {
    static void main() {
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the n ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){ // it gives rows.
            for(int j=1;j<=n-i;j++){
                System.out.print(" "); // it prints space.
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);// it print number in it
            }
            System.out.println();
        }
    }
}
