package IntellijStarting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RunMethods181 {
    public static void main(String[] args) {
        List<StoreEmployee180> storeEmployees=new ArrayList<>(List.of(
                new StoreEmployee180(10015, "Meg", 2019, "Target"),
                new StoreEmployee180(10515, "Joe", 2021, "Walmart"),
                new StoreEmployee180(10105, "Tom", 2020, "Macys"),
                new StoreEmployee180(10215, "Marty", 2018, "Walmart"),
                new StoreEmployee180(10322, "Bud", 2016, "Target"))
        );

        var c0=new EmployeeComparator180<StoreEmployee180>();
        var c1=new Employee180.EmployeeComparator180<StoreEmployee180>();
        var c2=new StoreEmployee180().new StoreComparator180<StoreEmployee180>();

//        Using local class
        class NameSort<T> implements Comparator<StoreEmployee180> {

            @Override
            public int compare(StoreEmployee180 o1, StoreEmployee180 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }

        var c3=new NameSort<StoreEmployee180>();

//        Using anonymous class
        var c4=new Comparator<StoreEmployee180>() {

            @Override
            public int compare(StoreEmployee180 o1, StoreEmployee180 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        sortIt(storeEmployees, c0);
        sortIt(storeEmployees, c1);
        sortIt(storeEmployees, c2);
        sortIt(storeEmployees, c3);
        sortIt(storeEmployees, c4);
        sortIt(storeEmployees, (o1, o2) -> o1.getName().compareTo(o2.getName()));
    }

    public static <T> void sortIt(List<T> list, Comparator<? super T> comparator) {
        System.out.println("Sorting with comparator: "+comparator.toString());
        list.sort(comparator);
        for(var employee:list){
            System.out.println(employee);
        }
    }
}
