public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Logical AND
        boolean andResult = (a > b) && (b > 0);
        System.out.println("Logical AND result: " + andResult);

        // Logical OR
        boolean orResult = (a < b) || (b > 0);
        System.out.println("Logical OR result: " + orResult);

        // Logical NOT
        boolean notResult = !(a < b);
        System.out.println("Logical NOT result: " + notResult);

        // Combining logical operators
        boolean combinedResult = (a > b) && (b > 0) || (a < 5);
        System.out.println("Combined logical operators result: " + combinedResult);
    }
}
