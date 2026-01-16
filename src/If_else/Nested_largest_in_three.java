package If_else;

import java.util.Scanner;

public class Nested_largest_in_three {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First numbers");
        int a = sc.nextInt();

        System.out.println("Enter Second number");
        int b = sc.nextInt();

        System.out.println("Enter Third number numbers");
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(" A is Largest");
            }
            else{
                System.out.println("C is Largest");
            }
        }
        else{
            if (b>c) {
                System.out.println("B is Largest");
            }
            else{
                System.out.println("C is Largest");
            }
        }
    }
}