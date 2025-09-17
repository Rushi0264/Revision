package operators;

public class LogicalOperator {
    public static void main(String[] args) {
        boolean a=true,b=false;
        System.out.println(a && b);//false => AND operator will have both true value then return true
        System.out.println(a || b);//true => OR operator will have minimum one true value then return true
        System.out.println(!a);//this operator invert the current value (a = True => False)
    }
}
