package If_else;

import java.util.Scanner;

public class Absolute_Value {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number"); //Absolute value means if entered number is - then give into positive number

        int n=sc.nextInt();
        if(n<0){
            n=-n; // means if number is in - then multiply the number with n and store back in the n as in the assignment operator.
        }
        System.out.println(n);
    }
}
