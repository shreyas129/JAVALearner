package IntellijStarting.test;

import java.util.Comparator;

public class EmployeeComparator179<T extends Employee179> implements Comparator<Employee179> {
    @Override
    public int compare(Employee179 o1, Employee179 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
