package Basics;

import java.util.Scanner;

public class inputvalues {
    static void main() {
        Scanner sc=new Scanner (System.in);//for taking input from user.
        System.out.println("Enter the Radius");
        double r=sc.nextDouble();//sc is variable. Taking value in r.
        double a=3.141592*r*r;
        System.out.println(a);
    }
}




