package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Type Casting
 *
 * Learn how to convert between different data types in Java.
 * Widening (implicit): smaller type -> larger type (e.g., int -> double)
 * Narrowing (explicit): larger type -> smaller type (e.g., double -> int)
 */
public class TypeCasting {

    public static void main(String[] args) {

        // TODO: 1 - Widen an int to a double (implicit casting)
        // Declare an int variable with any value, then assign it to a double variable.
        // Print both variables to see the result.
    int a = 1;
    double b = 2.0;
    b = a; // a is still 1, b is 1.0 now
        System.out.println(a);
        System.out.println(b);

        // TODO: 2 - Narrow a double to an int (explicit casting)
        // Declare a double variable (e.g., 9.78), then cast it to an int.
        // Print both variables to see what happens to the decimal part.

        double c = 9.78;
        int convertC = (int)c;
        System.out.println(c); //9.78
        System.out.println(convertC); //9

        // TODO: 3 - Cast an int to a char to get the character it represents
        // Hint: int value 65 corresponds to 'A' in ASCII
        // Print the resulting char.
        int d = 65;
        char e = (char) d;
        System.out.println("number to be converted: "+d);
        System.out.println("after converting the number into char: "+e);

        // TODO: 4 - Cast a char to an int to get its ASCII value
        // Hint: char 'Z' has an ASCII value of 90
        // Print the resulting int.
        char z = 'Z';
        int convertZ = (int) z;
        System.out.println(z);
        System.out.println(convertZ);

        // TODO: 5 - Convert a String "42" to an int using Integer.parseInt()
        // Declare a String variable with the value "42", then parse it to an int.
        // Print the result.

        String fourtyTwo = "42";
        int convertFourtyTwo =  Integer.parseInt(fourtyTwo);
        System.out.println(fourtyTwo);
        System.out.println(convertFourtyTwo);
        // TODO: 6 - Convert an int 42 to a String using String.valueOf()
        // Declare an int variable with the value 42, then convert it to a String.
        // Print the result.
        int num = 42;
        String convertNum = String.valueOf(num);
        System.out.println(num);
        System.out.println(convertNum);
    }
}
