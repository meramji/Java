package Loops;

import java.util.Scanner;

public class Count_digit_of_number {
    static void main() {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");// count the digit of the entered number.

        int n=sc.nextInt();
        int count=0;
        if(n==0) count=1;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
