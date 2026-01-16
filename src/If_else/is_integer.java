package If_else;

import java.util.Scanner;

public class is_integer {
    static void main() {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a  number for checking whether it is integer or not-");

        double n = sc.nextDouble();
        int x= (int)n; // explicit type casting.
        if(n-x ==0) System.out.println("It is a Integer");
        else System.out.println("Not a Integer");
    }
}
