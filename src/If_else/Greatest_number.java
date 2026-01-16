package If_else;

import java.util.Scanner;

public class Greatest_number {
    static void main() {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter First numbers");
        int a = sc.nextInt();

        System.out.println("Enter Second number");
        int b=sc.nextInt();

        System.out.println("Enter Third number numbers");
        int c=sc.nextInt();

        if(a>b && a>c) System.out.println("A is the greatest number");
        //A is greatest
        else if(b>a && b>c) System.out.println("B is the greatest number");
        // B is greatest
        else System.out.println("C is the greatest number");
        // else idf both A and B is not greatest then c is greatest
    }
}
