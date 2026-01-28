package Function;

import java.util.Scanner;

public class Greatest_number {
    static void main() {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the first number");;
        int a=sc.nextInt();

        System.out.println("Enter the second number");;
        int b=sc.nextInt();

        System.out.println("Enter the third number");;
        int c=sc.nextInt();

        System.out.println(Math.max(a,Math.max(b,c)));
    }
}
