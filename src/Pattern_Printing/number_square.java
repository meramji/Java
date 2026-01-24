package Pattern_Printing;

import java.util.Scanner;

public class number_square {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println(); // It gives next line
        }
    }
}
