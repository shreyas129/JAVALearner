package IntellijStarting;

import java.util.Comparator;

public class EmployeeComparator176 <T extends Employee176> implements Comparator<Employee176> {
    @Override
    public int compare(Employee176 o1, Employee176 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
