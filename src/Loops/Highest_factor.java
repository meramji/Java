package Loops;

import java.util.Scanner;

public class Highest_factor {
    static void main() {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number");
        int n=sc.nextInt(); //other than itself.

        int hf=1;
        for(int i=n-1;i>=1;i--){

            if(n%i==0){ // a is divided by b
               hf=i;
               break;
            }
        }
        System.out.print(hf);
    }
}
