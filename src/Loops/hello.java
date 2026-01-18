package Loops;

import java.util.Scanner;

public class hello {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter how many times you want to print the hello World");

        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(" Hello World");
        }
    }
}