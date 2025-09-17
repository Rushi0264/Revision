package operators;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int max = (a > b) ? a : b;//shortcut of if-else statement
                                  // If a is greater than b, then return a. else, return b.
        System.out.println("Max = " + max);
    }
}
