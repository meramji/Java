package Loops;

import java.util.Scanner;

public class AP {
    static void main() {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number till which want AP-");

        int n=sc.nextInt();
        for(int i=1;i<=(2*n-1);i=i+2){ //(2*n-1) gives the number of term. 2+(n+1)d gives the term.
            System.out.print(i+" ");
        }
    }
}
