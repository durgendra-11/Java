public class RelationalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Equal to
        boolean isEqual = (a == b);
        System.out.println("Is a equal to b? " + isEqual);

        // Not equal to
        boolean isNotEqual = (a != b);
        System.out.println("Is a not equal to b? " + isNotEqual);

        // Greater than
        boolean isGreaterThan = (a > b);
        System.out.println("Is a greater than b? " + isGreaterThan);

        // Less than
        boolean isLessThan = (a < b);
        System.out.println("Is a less than b? " + isLessThan);

        // Greater than or equal to
        boolean isGreaterThanOrEqual = (a >= b);
        System.out.println("Is a greater than or equal to b? " + isGreaterThanOrEqual);

        // Less than or equal to
        boolean isLessThanOrEqual = (a <= b);
        System.out.println("Is a less than or equal to b? " + isLessThanOrEqual);

        // Comparing int and double
        int x = 5;
        double y = 4.9;
        boolean isXGreaterThanY = (x > y);
        System.out.println("Is x greater than y? " + isXGreaterThanY);

        // Comparing char and int or double
        char ch = 'A'; // ASCII value of 'A' is 65
        boolean isChGreaterThanB = (ch > 64.998);
        System.out.println("Is ch greater than b? " + isChGreaterThanB);
    }
}
