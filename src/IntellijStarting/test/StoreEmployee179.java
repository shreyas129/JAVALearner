package IntellijStarting.test;

import java.util.Comparator;

public class StoreEmployee179 extends Employee179 {
    private String store;

    public StoreEmployee179() {}

    public StoreEmployee179(int employeeId, String name, int yearStarted, String store) {
        super(employeeId, name, yearStarted);
        this.store = store;
    }

    @Override
    public String toString() {
        return "%-8s%s".formatted(store, super.toString());
    }

    public class StoreComparator179<T extends StoreEmployee179> implements Comparator<StoreEmployee179>{

        @Override
        public int compare(StoreEmployee179 o1, StoreEmployee179 o2) {
            int result = o1.store.compareTo(o2.store);
            if(result == 0){
                return new EmployeeComparator179<>("yearStarted").compare(o1,o2);
            }
            return result;
        }
    }
}
