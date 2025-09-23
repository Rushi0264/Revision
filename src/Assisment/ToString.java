package Assisment;

class AA{
    int id;
    AA(int id){
        this.id=id;
    }
    public String toString(){
        return " "+id;
    }
}

public class ToString {
    public static void main(String[] args) {
        AA a = new AA(21);
        System.out.println(a);
    }
}
