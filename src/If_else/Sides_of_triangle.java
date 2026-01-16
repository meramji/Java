package If_else;

import java.util.Scanner;

public class Sides_of_triangle { // if they are sides of a triangle.
    static void main() {
        Scanner sc=new Scanner(System.in);

        //  Sum of two sides of triangle must be greater than third side.

        System.out.println("Enter first side of triangle");
        int a=sc.nextInt();

        System.out.println("Enter second side of triangle");
        int b=sc.nextInt();

        System.out.println("Enter third side of triangle");
        int c=sc.nextInt();

//        if(a+b>c) System.out.println("they are sides of triangle");
//        else if(b+c>a) System.out.println("they are sides of triangle");
//        else if (c+a>b) System.out.println("they are sides of triangle");
//        else System.out.println("they are not sides of triangle");

        if(a+b>c && b+c>a && c+a>b){
            System.out.println("They are sides of a triangle ");
        }
        else{
            System.out.println(" They are not side of triangle");
        }
    }
}
