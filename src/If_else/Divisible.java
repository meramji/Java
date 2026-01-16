package If_else;

import java.util.Scanner;

public class Divisible {
    static void main() {
        Scanner sc =new Scanner (System.in);

        System.out.println("Enter a number");
        int n=sc.nextInt();

        if(n%5==0 || n%3==0){
            System.out.println("It is divisible by 5 or 3");
        }
        else {
            System.out.println("It is not divisible by 5 or 3");
        }
    }
}
