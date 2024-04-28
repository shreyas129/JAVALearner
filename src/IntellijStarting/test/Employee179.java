package IntellijStarting.test;

import java.util.Comparator;

public class Employee179 {

    public static class EmployeeComparator179 <T extends Employee179> implements Comparator<Employee179> {
        private String sortType;

        public EmployeeComparator179() {
            this("name");
        }

        public EmployeeComparator179(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(Employee179 o1, Employee179 o2) {
            if(sortType.equalsIgnoreCase("yearStarted")){
                return o1.yearStarted- o2.yearStarted;
            }
            return o1.name.compareTo(o2.name);
        }
    }

    private int employeeId, yearStarted;
    private String name;

    public Employee179() {}

    public Employee179(int employeeId, String name, int yearStarted) {
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
