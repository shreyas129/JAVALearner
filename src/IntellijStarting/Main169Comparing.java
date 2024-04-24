package IntellijStarting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main169Comparing {
    public static void main(String[] args) {
        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};

        for (Integer i : others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five, (val == 0 ? "==" :(val < 0) ? "<" :">"), i, val);
        }

        String banana = "banana";
        String[] fruit = {"apple", "banana", "pear", "BANANA"};

        for (String s : fruit) {
            int val = banana.compareTo(s);
            System.out.printf("%s %s %s: compareTo:%d%n", banana, (val==0?"==":(val<0)?"<":">"), s, val);
        }
        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));

        System.out.println("A:"+(int)'A'+" "+"a:"+(int)'a');
        System.out.println("B:"+(int)'B'+" "+"b:"+(int)'b');
        System.out.println("P:"+(int)'P'+" "+"p:"+(int)'p');

        Student169 shreyas = new Student169("Shreyas");
        Student169[] students = {new Student169("Vivan"), new Student169("Pratik"), new Student169("Shreyas")};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("result = "+shreyas.compareTo(new Student169("SHREYAS")));

        Comparator<Student169> gpaSorter = new StudentGPAComparator170();
        Arrays.sort(students, gpaSorter.reversed());
        System.out.println(Arrays.toString(students));
    }
}

class StudentGPAComparator170 implements Comparator<Student169>{
    @Override
    public int compare(Student169 o1, Student169 o2) {
        return (o1.gpa+o1.name).compareTo(o2.gpa+ o2.name);
    }
}

class Student169 implements Comparable<Student169>{
    private static int LAST_ID = 1000;
    private static Random random = new Random();
    String name;
    private int id;
    protected double gpa;

    public Student169(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0, 4.0);
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }

//    @Override
//    public int compareTo(Object o) {
//        Student169 other = (Student169) o;
//        return name.compareTo(other.name);
//    }

    @Override
    public int compareTo(Student169 o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }
}