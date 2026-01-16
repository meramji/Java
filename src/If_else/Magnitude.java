package If_else;

import java.util.Scanner;

public class Magnitude {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        int n=sc.nextInt();

        if(n<0){
            n=-n;
        }
        if(n<69){
            System.out.println("It is less than 69");
        }
        else{
            System.out.println("It is greater than 69");
        }
    }
}
