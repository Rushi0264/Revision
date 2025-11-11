package String;

public class ImmutableString {
    public static void main(String[] args) {
        String s1 = "Pune";//object create in scp
        String s2 = "Pune";// s1 and s2 both refer to the same object => "Pune"
        String s3 = "Jalna";//one new object create in scp = "Jalna"
        String s4 = "Jalna";// s3 and s4 both refer to the same object => "Jalna"

        System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4);
    }
}
