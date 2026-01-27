package Pattern_Printing;

import java.util.Scanner;

public class rhombus {
    static void main() {
        Scanner sc= new Scanner (System.in);

        System.out.println("Enter the n");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){ // it is for the row
            for(int j=1;j<=n-i;j++) {
                System.out.print(" "); // it is for space.
            }
            for(int k=1;k<=n;k++){
                System.out.print("*");
            } //it is for *
            System.out.println();
        }
    }
}
