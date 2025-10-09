package CovariantReturnType;

class Animal{
    Animal show(){
        System.out.println("I am animal..");
        return this;
    }
}
class Dog extends Animal{
    Dog show(){
        System.out.println("I am dog..");
        return this;
    }
}

public class CovariantTypeTest {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.show();
    }
}
