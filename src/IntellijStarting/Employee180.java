package IntellijStarting;

import java.util.Comparator;

public class Employee180 {

    public static class EmployeeComparator180 <T extends Employee180> implements Comparator<Employee180> {
        private String sortType;

        public EmployeeComparator180() {
            this("name");
        }

        public EmployeeComparator180(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(Employee180 o1, Employee180 o2) {
            if(sortType.equalsIgnoreCase("yearStarted")){
                return o1.yearStarted- o2.yearStarted;
            }
            return o1.name.compareTo(o2.name);
        }
    }

    private int employeeId, yearStarted;
    private String name;

    public Employee180() {}

    public Employee180(int employeeId, String name, int yearStarted) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(employeeId, name, yearStarted);
    }
}
