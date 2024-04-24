package IntellijStarting.test;

import java.time.Year;
import java.util.Random;

public class Student174 implements QueryItem174, Comparable<Student174> {
    public static int LAST_ID = 10_000;
    private String name, course;
    private int yearStarted, studentId;
    protected static Random random = new Random();
    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Shreyas"}, courses = {"C++", "Java", "Python"};

    public Student174(){
        studentId = LAST_ID++;
        int lastNameIndex = random.nextInt(65, 91);
        name = firstNames[random.nextInt(5)]+" "+(char)lastNameIndex;
        course=courses[random.nextInt(3)];
        yearStarted= random.nextInt(Year.now().getValue() - 5, Year.now().getValue());
    }

    @Override
    public String toString() {
        return "%d %-15s %-15s %d".formatted(studentId, name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchField(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch(fName) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(value));
            default -> false;
        };
    }

    @Override
    public int compareTo(Student174 o) {
        return Integer.valueOf(studentId).compareTo(o.studentId);
    }
}
