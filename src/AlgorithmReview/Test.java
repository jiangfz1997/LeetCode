package AlgorithmReview;

public class Test {
    public static void main(String[] args) {
        Integer a = 800;
        Integer b = 800;
        System.out.println((a == b) +" "+ a.hashCode()+" "+b.hashCode());
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));

        Integer c = new Integer(8);
        Integer d = new Integer(8);
        System.out.println((c == d) +" "+ c.hashCode()+" "+d.hashCode());
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));

        Integer e = 8;
        Integer f = 8;
        System.out.println((e == f) +" "+ e.hashCode()+" "+f.hashCode());
        System.out.println(System.identityHashCode(e));
        System.out.println(System.identityHashCode(f));

    }
}
