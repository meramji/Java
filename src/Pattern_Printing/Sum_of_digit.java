package Pattern_Printing;

import java.util.Scanner;

public class Sum_of_digit {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0;
        int a;
        while(n!=0){
            a=n%10; // modulus gives last digit of the number
            sum=sum+a;
            n=n/10; // it remove last digit and gives rest of the value.
        }
        System.out.println(sum);
    }
}
