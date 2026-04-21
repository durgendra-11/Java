public class TypeConversion {
    public static void main(String[] args) {

        // -------------------------------
        // 1. TYPE CONVERSION
        // -------------------------------

        // (A) Implicit Conversion (Widening)
        int intVal = 100;
        double doubleVal = intVal;  // int → double (automatic)

        System.out.println("Implicit Conversion:");
        System.out.println("int value: " + intVal);
        System.out.println("converted to double: " + doubleVal);

        // (B) Explicit Conversion (Narrowing)
        double d = 99.99;
        int i = (int) d;  // double → int (casting)

        System.out.println("\nExplicit Conversion:");
        System.out.println("double value: " + d);
        System.out.println("converted to int: " + i);

        // Example of potential data loss during narrowing conversion
        byte b = 120;
        int a = 259;
        b = (byte) a;  // int → byte (casting, may cause overflow)
        System.out.println("\nExplicit Conversion with potential overflow:");
        System.out.println("int value: " + a);
        System.out.println("converted to byte: " + b);


        // -------------------------------
        // 2. TYPE PROMOTION
        // -------------------------------

        // (A) byte → int promotion in expression
        byte a1 = 10;
        byte b1 = 20;

        int result = a1 + b1;  // byte + byte → int

        System.out.println("\nType Promotion (byte to int):");
        System.out.println("Result of a1 + b1: " + result);

        // (B) Mixed type promotion
        int x = 5;
        float y = 2.5f;

        float res = x + y;  // int → float

        System.out.println("\nMixed Type Promotion:");
        System.out.println("Result of x + y: " + res);

        // (C) char promotion
        char ch1 = 'A';  // ASCII 65
        char ch2 = 'B';  // ASCII 66

        int charResult = ch1 + ch2;  // char → int

        System.out.println("\nChar Promotion:");
        System.out.println("Result of ch1 + ch2: " + charResult);

        // (D) Example showing need of casting
        byte num = 50;

        // num = num + 1;  // ❌ ERROR (result is int)
        num = (byte)(num + 1);  // ✔ correct

        System.out.println("\nAfter casting (byte increment): " + num);
    }
}