package Pattern_Printing;

import java.util.Scanner;

public class Product_of_digit {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int n=sc.nextInt();
        int product=1;
        int b;
        while(n!=0){
            b=n%10;
            if(b==0){
                b=1;
            }
            product=product*b;
            n=n/10;
        }
        System.out.println(product);
    }
}
