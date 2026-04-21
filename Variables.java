public class Variables {
    public static void main(String[] args) {

        // Integer data types
        byte b = 10;          // byte: 1 byte (range: -128 to 127)
        short s = 2000;       // short: 2 bytes (range: -32,768 to 32,767)
        int i = 100000;       // int: 4 bytes (most commonly used) (range: -2^31 to 2^31-1)
        long l = 123456789L;  // long: 8 bytes (L is required for long literals) (range: -2^63 to 2^63-1)

        // Floating-point data types
        float f = 5.75f;      // float: 4 bytes (must use 'f' at the end) (range: ±1.4E-45 to ±3.4028235E38)
        double d = 19.99;     // double: 8 bytes (default for decimal numbers) (range: ±4.9E-324 to ±1.7976931348623157E308)

        // Character data type
        char c = 'J';         // char: 2 bytes (stores a single character) UNICODE character

        // Boolean data type
        boolean flag = true;  // boolean: true or false

        
        // Output the values of the variables
        // Integer types
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);

        // Floating-point types
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        // Character type
        System.out.println("char: " + c);

        // Boolean type
        System.out.println("boolean: " + flag);
    }
}