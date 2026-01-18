package Loops;

public class Print_even_number {
    static void main() {
//       for(int i=2;i<=100;i=i+2){
//           System.out.println(i);
//       }

        for(int i=1;i<=100;i++){ //if for condition satisfies then its body executes.
            if(i%2==0){ // Check the condition then execute the action inside
                System.out.println(i);
            }
        }
    }
}
