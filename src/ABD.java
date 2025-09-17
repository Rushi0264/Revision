interface A{
    void a();
    void b(int a);
    void c();
    default void add(){
        int a=10;
        int b=10;
        System.out.println(a+b);
    }
}

public class ABD implements A {

    @Override
    public void a(){
        System.out.println("Interface A");
    }

    @Override
    public void b(int a){
        System.out.println("Interface B use : "+a);
    }

    @Override
    public void c(){
        System.out.println("Interface C");
    }

    public static void main(String[] args) {
        ABD abd = new ABD();
        abd.a();
        abd.b(100);
        abd.c();
        abd.add();
    }
}
