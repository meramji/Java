package If_else;

import java.util.Scanner;

public class Profit_and_Loss {
    static void main() {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter Cost price");
        int cp=sc.nextInt();
        System.out.println("Enter Selling price");
        int sp=sc.nextInt();

//        if(cp<sp) System.out.println("You have make a Profit-"+"rs"+" "+(sp-cp));
//        if(cp>sp) System.out.println("You have make a Loss-"+"rs"+" "+(cp-sp));
//        if(cp==sp) System.out.println("No Profit No Loss");


        // note == is for checking the values equal.

        if(cp<sp) System.out.println("You make a Profit");
        else if (cp>sp) System.out.println("You make a Loss");
        else System.out.println("No profit No Loss");
    }
}
