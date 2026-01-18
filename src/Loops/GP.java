package Loops;

import java.util.Scanner;

public class GP {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  term till which  you want GP-");

        int n = sc.nextInt();

        System.out.println("Enter a first term");
        int a = sc.nextInt();

        System.out.println("Enter the power ");
        int r = sc.nextInt(); // better optimized.

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a = a * r;
        }
    }
}