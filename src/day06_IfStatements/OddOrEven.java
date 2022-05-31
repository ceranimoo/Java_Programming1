package day06_IfStatements;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 45;
        boolean IsEven = number % 2 == 0; // when we divide a number by2, if the remainder is 0, means the number is even

       // boolean IsOdd = number % 2 != 0; // when we divide a number by2, if the remainder is NOT 0, means the number is even
        boolean IsOdd = !IsEven; // If the number is NOT even, then it's odd

        System.out.println(number + " is an even number: " + IsEven );
        System.out.println(number + " is an even number: " + IsOdd);


    }


}
/*
  1. Odd or Even number
            1.1 Ask the user to enter a number
            1.2 determine if the number is odd or even

    2. Eligible or not Eligible to buy alcohol
            2.1 Ask the user to enter his/her age
            2.2 write a program that can check if the person eligible to buy alcohol

    3. MonthName
            3.1 Ask the user to enter a number
            3.2 Display the month name
 */