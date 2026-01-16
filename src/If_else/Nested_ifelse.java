package If_else;

import java.util.Scanner;

public class Nested_ifelse {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");

        int n=sc.nextInt();
//        if(n%3==0 || n%5==0){ // in or if first condition is true it will inside ,second condition is not checked.
//            System.out.println("It is divisible by 3 or 5");
//            if(n%15!=0){
//                System.out.println("It is not divisible by 15");
//            }
//            else{
//                System.out.println("IT is divisible by 15");
//            }
//        }
//        else System.out.println("Not divisible by 3 and 5");

        if((n%3==0 || n%5==0) && n%15==0){
            System.out.println("IT is divisible by 3,5 and 15");
        }
        else System.out.println("IT is not matched above condition");
    }
}
