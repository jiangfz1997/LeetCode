package Test;

import java.util.*;

public class ComparatorTest {
    static class People {
        String name;
        int age;
        int id;

        public People(String name, int age, int id) {
            this.name = name;
            this.age = age;
            this.id = id;
        }

        @Override
        public String toString() {
            return "People{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", id=" + id +
                    '}';
        }
    }

    public static List<People> compareTest(List<People> arr) {
        Collections.sort(arr, new Comparator<People>() {
            public int compare(People p1, People p2) {
                int a = p1.age;
                int b = p2.age;

                return a < b ? -1 : a == b ? 0 : 1;
            }
        }.thenComparing(new Comparator<People>() {
                            public int compare(People p1, People p2) {
                                return p1.id < p2.id ? -1 : p1.id == p2.id ? 0 : 1;
                            }
                        }.thenComparingInt(x -> x.name.length())
        ));

        return arr;
    }


    public static void main(String[] args) {
       /* List<People> list = new ArrayList<>();

        list.add(new People("Sayo", 17, 2));
        list.add(new People("Hina", 17, 1));
        list.add(new People("Tsugu", 16, 3));
        list.add(new People("Dio", 100, 4));
        list.add(new People("Naruto", 15, 7));
        list.add(new People("Donald.Trashump", 15, 6));
        list.add(new People("Sasuke", 15, 6));



        compareTest(list);
        for (People p : list) {
            System.out.println(p.toString());
        }*/
        List<String> numbers3 = Arrays.asList("b", "a", "c", "d", "e");
        numbers3.sort(Comparator.naturalOrder());
        System.out.println(numbers3);

    }
}

