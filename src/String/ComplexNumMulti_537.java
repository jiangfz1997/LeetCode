package String;

public class ComplexNumMulti_537 {
    public String complexNumberMultiply(String a, String b) {
        int a1 = 0, a2 = 0, b1 = 0, b2 = 0;
        String[] aTmp = a.split("\\+");
        String[] bTmp = b.split("\\+");
        a1 = Integer.parseInt(aTmp[0]);
        b1 = Integer.parseInt(bTmp[0]);
        a2 = Integer.parseInt(aTmp[1].substring(0, aTmp[1].length()-1));
        b2 = Integer.parseInt(bTmp[1].substring(0, bTmp[1].length()-1));
        int k = a1*b2+a2*b1;
        return a1*b1-a2*b2 + "+" + k + "i";
    }
}
