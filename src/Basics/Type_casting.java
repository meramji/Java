package Basics;

public class Type_casting {
    static void main() {
        char ch='A'; //char is a data type used to store character .it can hold only one value.
        int x=ch; // Implicit casting.Automatic casting
        System.out.println(x);

        char G ='a';
        int y=(int)G; //Explicit casting .in bracket we write in which we want to convert. It is done programmer.
        System.out.println(y);

        char R='H';
        System.out.println(R*1);//values stored multiplied,added by int gives int because values are stored in ASCII value.

        int A=85;
        char B=(char)A;
        System.out.println(B);
    }
}
