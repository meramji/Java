package Loops;

import java.util.Scanner;

public class Table_of_n {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose table you want to print");

        int n=sc.nextInt();

//        for(int i=n;i<=(n*10);i++){
//            if(i%n==0) {
//                System.out.println(i);
//            }
//        }

        for(int i=n;i<=(n*10);i=i+n){
            System.out.println(i);
        }
    }
}
