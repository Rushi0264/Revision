package Variables;

public class StaticVariable {
    //Static variable declare with in the class or outside the method
    //static variable does not required the object of a class
    //we access static variable in main method using sout(classname.variable)
    static int a = 10;
    static int b=23;
    static int add = a+b;

    public static void main(String[] args) {
        System.out.println(StaticVariable.add);
    }
}
