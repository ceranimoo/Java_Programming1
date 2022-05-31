package day05_operators;

public class UnaryOperators {


    public static void main(String[] args) {

        // Pre Increment and Decrement
        // ** it will increase or decrease the value immediately

        int x = 10;

        System.out.println( ++x ); // 11
        System.out.println( x );   // 11

        System.out.println("---------");

        int c = 20;

        System.out.println( --c ); // 19
        System.out.println( c );   // 19

        System.out.println("----------");

        // Post Increment and decrement
        // ** it will increase or decrease the value after make sure

        int a = 100;

        System.out.println( a++ ); // 100
        System.out.println( a ); // 101

        System.out.println("----------");

        int r = 30;

        System.out.println( r-- ); // 30
        System.out.println( r-- );    // 29

        System.out.println("---------------------------------------------");

        int n = 30;

        int m = n++;  // m =  30, n=31

        System.out.println("n = " + n);
        System.out.println("m = " + m);

        int z = 60;

        int q = z--; // q =60, z = 59

        System.out.println("z = " + z);
        System.out.println("q = " + q);







    }
}
