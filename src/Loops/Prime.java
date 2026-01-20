package Loops;

import java.util.Scanner;

public class Prime {
    static void main() {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");

        int n=sc.nextInt();
        boolean flag= false; // false means Prime.
        for(int i=2;i<n;i++){
            if(n%i==0){ // i means factor of n
                flag=true; // true means composite
                break;
            }
        }
        if(n==1) System.out.println("Neither prime nor composite");
        else if(flag==false) System.out.println("Prime number");
        else System.out.println("Composite number");
    }
}
