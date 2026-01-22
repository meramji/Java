package Pattern_Printing;

import java.util.Scanner;

public class reverse_number {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the  number");
        int n=sc.nextInt();
        int rev=0; // if we do not multiply by 10 then it will value will reassigned and we get the first digit.
        while(n!=0){
            rev=rev*10+(n%10);
            n=n/10;
        }
        System.out.println(rev);
    }
}
