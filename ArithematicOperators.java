public class ArithematicOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient);

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);

        // Increment
        a++;
        System.out.println("Incremented a: " + a);

        // Decrement
        a--;
        System.out.println("Decremented a: " + a);

        // Compound Assignment
        a += 5; // a = a + 5   
        System.out.println("After compound addition: " + a);
        a *= 2; // a = a * 2
        System.out.println("After compound multiplication: " + a);
        a -= 3; // a = a - 3
        System.out.println("After compound subtraction: " + a);
        a /= 2; // a = a / 2
        System.out.println("After compound division: " + a);

        // Difference between pre-increment and post-increment
        int x = 5, y = 5;
        int result1 = ++x; // Pre-increment: x is incremented before assignment
        int result2 = y++; // Post-increment: y is assigned before incrementing
        System.out.println("Pre-increment result: " + result1); // 6
        System.out.println("Post-increment result: " + result2); // 5

    }
}
