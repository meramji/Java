package Loops;

import java.util.Scanner;

public class AP_2 {
    static void main() {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the  term till which  you want AP-");

        int n=sc.nextInt();

//        for(int i=4;i<=3*n+1;i=i+3){
//            System.out.print(i+" ");
//        }

        System.out.println("Enter a first term");
        int a=sc.nextInt();

        System.out.println("Enter the difference between");
        int d =sc.nextInt(); // better optimized.

        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a=a+d;
        }
    }
}
