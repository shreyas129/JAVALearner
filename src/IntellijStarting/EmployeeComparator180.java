package IntellijStarting;

import java.util.Comparator;

public class EmployeeComparator180<T extends Employee180> implements Comparator<Employee180> {
    @Override
    public int compare(Employee180 o1, Employee180 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
