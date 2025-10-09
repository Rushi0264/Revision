package CovariantReturnType;

class Shape{
    Shape draw(){
        System.out.println("Drawing shape..");
        return this;
    }
}
class Circle extends Shape{
    Circle draw(){
        System.out.println("Drawing circle..");
        return this;
    }

    void area(){
        System.out.println("Calculating area of circle..");
    }
}

public class ShapeTest {
    public static void main(String[] args) {

        Shape obj = new Shape();
        obj.draw();

        Circle obj1  =new Circle();
        obj1.draw().area();

        Shape obj2 = new Circle();
        obj2.draw();
    }
}
