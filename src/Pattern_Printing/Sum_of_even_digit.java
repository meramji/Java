package Pattern_Printing;

import java.util.Scanner;

public class Sum_of_even_digit {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int n=sc.nextInt();
        int a;
        int sum=0;
        while(n!=0){
           a=n%10;
           if(a%2==0){
               sum=sum+a;
           }
           n=n/10;
        }
        System.out.println(sum);
    }
}
