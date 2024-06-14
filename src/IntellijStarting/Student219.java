package IntellijStarting;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

record Course219(String courseId, String name, String subject) {}

record Purchase219(String courseId, int studentId, double price, int yr, int dayOfYear) {
    public LocalDate purchaseDate() {
        return LocalDate.ofYearDay(yr, dayOfYear);

    }
}

public class Student219 {
    public static int lastId = 1;
    private String name;
    private int id;
    private List<Course219> courseList;

    public Student219(String name, List<Course219> courseList) {
        this.name = name;
        this.courseList = courseList;
        id = lastId++;
    }

    public Student219(String name, Course219 course) {
        this(name, new ArrayList<>(List.of(course)));
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void addCourse(Course219 course) {
        courseList.add(course);
    }

    @Override
    public String toString() {
        String[] courseNames = new String[courseList.size()];
        Arrays.setAll(courseNames, i -> courseList.get(i).name());
        return "[%d] : %s".formatted(id, String.join(", ", courseNames));
    }
}
