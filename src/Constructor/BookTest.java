package Constructor;

class Book{
    Book(){
        System.out.println("Empty Book");
    }
     Book(String title){
         System.out.println("Title of book : "+title);
     }
     Book(String title, double price){
         System.out.println("Title of book : "+title+" Price of book : "+price);
     }
}
public class BookTest {
    public static void main(String[] args) {
        Book b = new Book();
        Book b1 = new Book("We Can Do It");
        Book b2 = new Book("We Can Do It", 250);
    }
}
