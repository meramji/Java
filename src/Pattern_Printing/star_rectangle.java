package Pattern_Printing;

import java.util.Scanner;

public class star_rectangle {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns");
        int n=sc.nextInt();
         for(int i=1;i<=m;i++){
             for(int j=1;j<=n;j++){
                 System.out.print("*"+" ");
             }
             System.out.println();
         }
    }
}
