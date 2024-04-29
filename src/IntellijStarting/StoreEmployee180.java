package IntellijStarting;

import java.util.Comparator;

public class StoreEmployee180 extends Employee180{
    private String store;

    public StoreEmployee180() {}

    public StoreEmployee180(int employeeId, String name, int yearStarted, String store) {
        super(employeeId, name, yearStarted);
        this.store = store;
    }

    @Override
    public String toString() {
        return "%-8s%s".formatted(store, super.toString());
    }

    public class StoreComparator180<T extends StoreEmployee180> implements Comparator<StoreEmployee180>{

        @Override
        public int compare(StoreEmployee180 o1, StoreEmployee180 o2) {
            int result = o1.store.compareTo(o2.store);
            if(result == 0){
                return new EmployeeComparator180<>("yearStarted").compare(o1,o2);
            }
            return result;
        }
    }
}
