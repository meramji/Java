package If_else;

import java.util.Scanner;

public class Four_Digit_Number {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Four digit number");
        int n=sc.nextInt();

        if(n>999 && n<10000) System.out.println("It is a four digit number");
        else System.out.println("It is not a four digit number");
    }
}
