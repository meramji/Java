package Loops;

import java.util.Scanner;

public class Factors {
    static void main() {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){

            if(n%i==0){ // a is divided by b
                System.out.print(i+" ");
            }
        }
    }
}
