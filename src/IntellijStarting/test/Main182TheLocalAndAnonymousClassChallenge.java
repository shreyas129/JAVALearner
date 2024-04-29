package IntellijStarting.test;

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Employee182(String firstName, String lastName, String hireDate) {
}

public class Main182TheLocalAndAnonymousClassChallenge {
    public static void main(String[] args) {
        List<Employee182> employeeList = new ArrayList<>(List.of(
                new Employee182("Shreyas", "Tathode", "12/09/2014"),
                new Employee182("Prashant", "Tathode", "04/01/1980"),
                new Employee182("Swapnaja", "Tathode", "26/08/1986"),
                new Employee182("Pratik", "Kela", "12/03/2014"),
                new Employee182("Aaradhya", "Dhamne", "22/09/2013")
        ));

        myMethod(employeeList);
    }

    public static void myMethod(List<Employee182> employees) {
        class LocalEmployee182 {
            private String fullName;
            private int yearsWorked;

            public LocalEmployee182(Employee182 employee) {
                fullName = employee.firstName() + " " + employee.lastName();
                yearsWorked = Year.now().getValue() - Integer.parseInt(employee.hireDate().substring(6));
            }
        }
        List<LocalEmployee182> localEmployeeList = new ArrayList<>(employees.size());
        for (var employee : employees) {
            localEmployeeList.add(new LocalEmployee182(employee));
        }
        Comparator<LocalEmployee182> nameComparator = (o1, o2) -> o1.fullName.compareTo(o2.fullName);

        Comparator<LocalEmployee182> ageComparator = (o1, o2) -> o1.yearsWorked - o2.yearsWorked;

        localEmployeeList.sort(nameComparator);
        System.out.println("The list which is sorted by name: ");
        for (LocalEmployee182 localEmployee:localEmployeeList) {
            System.out.println(localEmployee.fullName+" : "+localEmployee.yearsWorked);
        }
        System.out.println();
        localEmployeeList.sort(ageComparator);
        System.out.println("The list which is sorted by age: ");
        for (LocalEmployee182 localEmployee:localEmployeeList) {
            System.out.println(localEmployee.fullName+" : "+localEmployee.yearsWorked);
        }
        System.out.println();
    }
}
