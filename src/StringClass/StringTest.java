package StringClass;

public class StringTest {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println("Length of string : "+str.length());
        System.out.println("Character at index : "+str.charAt(1));
        System.out.println("Starting part of string : "+str.substring(0,5));
        System.out.println("Concat the string : "+str.concat(" Rushi"));
        System.out.println("Check strings are equal : "+str.equals("Hello World"));
        System.out.println("Check strings are equals, and ignore case : "+str.equalsIgnoreCase("Hello World"));
        System.out.println("Convert string to upper case : "+str.toUpperCase());
        System.out.println("Convert string to lower case : "+str.toLowerCase());
        System.out.println("Replace the character : "+str.replace('H','A'));
        System.out.println("Remove the space : "+str.trim());
        System.out.println("Find first index occurrence : "+str.indexOf('l'));
        System.out.println("Find last index occurrence : "+str.lastIndexOf('l'));
    }
}
