package IntellijStarting;

import java.util.Comparator;

public class StoreEmployee177 extends Employee176{
    private String store;

    public StoreEmployee177() {}

    public StoreEmployee177(int employeeId, String name, int yearStarted, String store) {
        super(employeeId, name, yearStarted);
        this.store = store;
    }

    @Override
    public String toString() {
        return "%-8s%s".formatted(store, super.toString());
    }

    public class StoreComparator177<T extends StoreEmployee177> implements Comparator<StoreEmployee177>{

        @Override
        public int compare(StoreEmployee177 o1, StoreEmployee177 o2) {
            int result = o1.store.compareTo(o2.store);
            if(result == 0){
                return new Employee176.EmployeeComparator176<>("yearStarted").compare(o1,o2);
            }
            return result;
        }
    }
}
