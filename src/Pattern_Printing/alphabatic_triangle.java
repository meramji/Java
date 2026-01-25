package Pattern_Printing;

import java.util.Scanner;

public class alphabatic_triangle {
    static void main() {
        Scanner sc=new Scanner (System.in);

        System.out.println("enter the number of rows");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print((char)(j+64)+" ");
                }
                if(i%2!=0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
