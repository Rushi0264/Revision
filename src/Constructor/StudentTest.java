package Constructor;

class Student{
    Student(int id, String name){
        System.out.println("Id : "+id+" Name : "+name);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student std = new Student(12,"Rushi");
    }
}
