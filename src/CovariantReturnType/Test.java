package CovariantReturnType;

class A{
    A getObject(){
        System.out.println("getObject method from Class A");
        return this;
    }
}
class B extends A{
    @Override
    B getObject() {
        System.out.println("getObject method from Class B");
        return this;
    }
}
class C extends B{
    @Override
    C getObject(){
        System.out.println("getObject method from class C");
        return this;
    }
}
public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.getObject();

        B b = new B();
        b.getObject();
        A ab = new B();
        ab.getObject();

        C c = new C();
        c.getObject();
        A ac = new C();
        ac.getObject();
    }
}
