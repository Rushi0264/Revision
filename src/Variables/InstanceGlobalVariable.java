package Variables;

public class InstanceGlobalVariable {
    //instance variable also known as global variable
    //instance variable declare within the class or outside the method
    //Access instance variable using object of a class.
    int a;
    int b;
    int add = a+b;

    public static void main(String[] args) {
        InstanceGlobalVariable ig = new InstanceGlobalVariable();
        System.out.println(ig.add);
    }
}
