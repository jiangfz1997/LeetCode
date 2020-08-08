package 剑指offer;

public class ReplaceSpace {
    public static String replaceSpace(StringBuffer str) {
        String s = str.toString();
        for(int i = 0; i < s.length(); i++){
            String s1 = s.substring(i, i+1);
            if(s1.equals(" ")){
                str.replace(i, i+1, "%20");
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringBuffer s= new StringBuffer();
        s.append("hello  world");
        System.out.println(replaceSpace(s));
    }
}
