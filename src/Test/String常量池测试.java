package Test;

public class String常量池测试 {
    public static void main(String[] args) {
        String s = new String("ddddd");

        String s3 = s.intern();
        String s4 = s.intern();
        String s2 = "ddddd";
        System.out.println(s == s2);
        System.out.println(s4 == s3);
        System.out.println(s.equals(s2));
    }
}
