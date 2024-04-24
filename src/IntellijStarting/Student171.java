package IntellijStarting;

import java.time.Year;
import java.util.Random;

public class Student171 implements QueryItem173{
    private String name, course;
    private int yearStarted;
    protected static Random random = new Random();
    private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Shreyas"}, courses = {"C++", "Java", "Python"};

    public Student171(){
        int lastNameIndex = random.nextInt(65, 91);
        name = firstNames[random.nextInt(5)]+" "+(char)lastNameIndex;
        course=courses[random.nextInt(3)];
        yearStarted= random.nextInt(Year.now().getValue() - 5, Year.now().getValue());
    }

    @Override
    public String toString() {
        return "%-15s %-15s %d".formatted(name, course, yearStarted);
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
}
