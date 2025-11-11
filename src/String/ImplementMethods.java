package String;

public class ImplementMethods {
    public static void main(String[] args) {
        String s1 = "Java";
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.charAt(2));

        String s2 = "Programming";
        System.out.println(s2.charAt(4));
        System.out.println(s2.toUpperCase());
        System.out.println(s2.indexOf('o'));


        System.out.println(s1.concat(" "+s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.contains("gram"));
        System.out.println(s2.substring(0,7));
    }
}
