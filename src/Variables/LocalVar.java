package Variables;

public class LocalVar {
    void show(){
        //local variable, declare within the method, constructor or block only
        //local variable not access outside the method
        //initialization must be compulsory
        int a=10;//this is local variable.
        int b=2;
        int add= a+b;
        System.out.println(add);
    }

    protected LocalVar(){

    }

    public static void main(String[] args) {
        LocalVar lv = new LocalVar();
        lv.show();
    }
}
