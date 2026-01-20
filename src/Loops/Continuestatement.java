package Loops;

public class Continuestatement {
    static void main() {
        for(int i=1;i<=100;i++){
            if(i==23) continue; // continue just skips the the line and run the next line.
            if(i%2==0 || i%3==0){
                System.out.println(i);
            }
        }
    }
}
