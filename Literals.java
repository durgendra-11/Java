public class Literals {
    public static void main(String[] args) {

        // 🔢 Integer Literals
        int decimal = 10;
        int binary = 0b1010;
        int octal = 012;
        int hex = 0xA;

        System.out.println("Integer Literals:");
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hex: " + hex);

        // 🔣 Floating-point Literals
        float f = 10.5f;
        double d = 20.99;

        System.out.println("\nFloating-point Literals:");
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);

        // 🔤 Character Literals
        char ch = 'A';
        char symbol = '#';

        System.out.println("\nCharacter Literals:");
        System.out.println("Char: " + ch);
        System.out.println("Symbol: " + symbol);

        // 📜 String Literals
        String name = "Durgendra";
        String message = "Hello World";

        System.out.println("\nString Literals:");
        System.out.println("Name: " + name);
        System.out.println("Message: " + message);

        // ✅ Boolean Literals
        boolean isJavaFun = true;
        boolean isCold = false;

        System.out.println("\nBoolean Literals:");
        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Is it cold? " + isCold);

        // 🧊 Null Literal
        String empty = null;

        System.out.println("\nNull Literal:");
        System.out.println("Empty value: " + empty);
    }
}