package day05ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {

     String pwd = "ighjaXyz";

     String isValid =pwd.length()>8 ? (pwd.charAt(0)=='i' ? "valid" : "invalid" ) : (pwd.charAt(0)=='k' ?  "valid "  : "invalid");

        System.out.println(isValid);

    }
}
