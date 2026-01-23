package Pattern_Printing;

import java.util.Scanner;

public class Sum_of_reverse_number { // sum of given number and reverse of number.
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int n=sc.nextInt();
        int rev=0;
        int sum=0;
        int ld;
        while(n!=0){
            ld=n%10;
            rev=rev*10+ld;
            sum=sum+ld;
            n=n/10;
        }
        System.out.println(sum*2);
    }
}
