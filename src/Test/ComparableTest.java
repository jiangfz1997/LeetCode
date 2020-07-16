package Test;

import java.util.*;

public class ComparableTest {
    static class  People implements Comparable{
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

        @Override
        public int compareTo(Object o1) {
            People o = (People)o1;
            return this.age < o.age ? -1 : this.age == o.age ? 0 : 1;
        }
    }

    public static void main(String[] args) {
        List<People> list = new ArrayList<>();

        list.add(new People("Sayo", 17, 2));
        list.add(new People("Hina", 17, 1));
        list.add(new People("Tsugu", 16, 3));
        list.add(new People("Dio", 100, 4));
        list.add(new People("Naruto", 15, 7));
        list.add(new People("Donald.Trashump", 15, 6));
        list.add(new People("Sasuke", 15, 6));



        Collections.sort(list);
        for (People p : list) {
            System.out.println(p.toString());
        }
    }
}
