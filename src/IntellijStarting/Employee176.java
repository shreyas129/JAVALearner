package IntellijStarting;

import java.util.Comparator;

public class Employee176 {

    public static class EmployeeComparator176 <T extends Employee176> implements Comparator<Employee176> {
        private String sortType;

        public EmployeeComparator176() {
            this("name");
        }

        public EmployeeComparator176(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(Employee176 o1, Employee176 o2) {
            if(sortType.equalsIgnoreCase("yearStarted")){
                return o1.yearStarted- o2.yearStarted;
            }
            return o1.name.compareTo(o2.name);
        }
    }

    private int employeeId, yearStarted;
    private String name;

    public Employee176() {}

    public Employee176(int employeeId, String name, int yearStarted) {
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
