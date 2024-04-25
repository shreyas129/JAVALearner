package IntellijStarting;

import java.util.ArrayList;
import java.util.List;

public class MainNestedClasses176 {
    public static void main(String[] args) {
        List<Employee176> employees = new ArrayList<>(List.of(new Employee176(10001, "Ralph", 2015), new Employee176(10005, "Carol", 2021), new Employee176(10022, "Jane", 2013), new Employee176(13151, "Laura", 2020), new Employee176(10050, "Jim", 2018)));

//        var comparator = new EmployeeComparator176<>();
//        employees.sort(comparator);

        employees.sort(new Employee176.EmployeeComparator176<>("yearStarted").reversed());

        for(Employee176 e:employees){
            System.out.println(e);
        }
    }
}
