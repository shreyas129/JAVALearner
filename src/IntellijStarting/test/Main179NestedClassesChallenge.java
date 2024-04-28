package IntellijStarting.test;

import java.util.ArrayList;
import java.util.List;

public class Main179NestedClassesChallenge {
    public static void main(String[] args) {
        List<Employee179> employees = new ArrayList<>(List.of(new Employee179(10001, "Ralph", 2015), new Employee179(10005, "Carol", 2021), new Employee179(10022, "Jane", 2013), new Employee179(13151, "Laura", 2020), new Employee179(10050, "Jim", 2018)));

//        var comparator = new EmployeeComparator179<>();
//        employees.sort(comparator);

        employees.sort(new Employee179.EmployeeComparator179<>("yearStarted").reversed());

        for(Employee179 e:employees){
            System.out.println(e);
        }

        System.out.println("Store members");

        List<StoreEmployee179> storeEmployees=new ArrayList<>(List.of(new StoreEmployee179(10015, "Meg", 2019, "Target"), new StoreEmployee179(10515, "Joe", 2021, "Walmart"), new StoreEmployee179(10105, "Tom", 2020, "Macys"), new StoreEmployee179(10215, "Marty", 2018, "Walmart"), new StoreEmployee179(10322, "Bud", 2016, "Target")));

        var comparator=new StoreEmployee179().new StoreComparator179<>();
        storeEmployees.sort(comparator);

        for(StoreEmployee179 e:storeEmployees){
            System.out.println(e);
        }
    }
}
