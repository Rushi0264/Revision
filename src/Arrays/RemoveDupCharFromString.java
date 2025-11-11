package Arrays;

public class RemoveDupCharFromString {
    public static void main(String[] args) {
        String str = "Programming";

        str=str.toLowerCase();
        String newStr = "";

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if (newStr.indexOf(ch)==-1){
                newStr+=ch;
            }
        }
        System.out.println(newStr);
    }
}
