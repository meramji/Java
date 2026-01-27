package Pattern_Printing;

import java.util.Scanner;

public class Star_pyramid {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n");
        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//            for(int l=1;l<=i-1;l++){
//                    System.out.print("*");
//            }
////            for(int j=1;j<=n-i;j++){
////                System.out.print(" ");
////            }
////            for(int k=1;k<=2*i-1;k++){
////                System.out.print("*");
////            }
//            System.out.println();
//        }

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
    }
}
