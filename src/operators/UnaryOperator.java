package operators;

public class UnaryOperator {
    static int a = 5;

    public static void main(String[] args) {
        System.out.println(a++);//5
        System.out.println(a);//6

        System.out.println(++a);//7
        System.out.println(a--);//7
        System.out.println(a);//6
        System.out.println(--a);//5
    }
}
