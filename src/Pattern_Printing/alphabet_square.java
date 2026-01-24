package Pattern_Printing;

import java.util.Scanner;

public class alphabet_square {
    static void main() {

        Scanner sc=new Scanner (System.in);

        System.out.println("enter the rows and columns");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(j+64)+" "); // to typecast into alphabet
            }
            System.out.println();
        }
    }
}
