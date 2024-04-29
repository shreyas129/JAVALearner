package IntellijStarting;

import java.util.ArrayList;
import java.util.List;

public class MainNestedClasses180 {
    public static void main(String[] args) {
        List<Employee180> employees = new ArrayList<>(List.of(
                new Employee180(10001, "Ralph", 2015),
                new Employee180(10005, "Carol", 2021),
                new Employee180(10022, "Jane", 2013),
                new Employee180(13151, "Laura", 2020),
                new Employee180(10050, "Jim", 2018))
        );

//        var comparator = new EmployeeComparator180<>();
//        employees.sort(comparator);

        employees.sort(new Employee180.EmployeeComparator180<>("yearStarted").reversed());

        for(Employee180 e:employees){
            System.out.println(e);
        }

        System.out.println("Store members");

        List<StoreEmployee180> storeEmployees=new ArrayList<>(List.of(
                new StoreEmployee180(10015, "Meg", 2019, "Target"),
                new StoreEmployee180(10515, "Joe", 2021, "Walmart"),
                new StoreEmployee180(10105, "Tom", 2020, "Macys"),
                new StoreEmployee180(10215, "Marty", 2018, "Walmart"),
                new StoreEmployee180(10322, "Bud", 2016, "Target"))
        );

        var comparator=new StoreEmployee180().new StoreComparator180<>();
        storeEmployees.sort(comparator);

        for(StoreEmployee180 e:storeEmployees){
            System.out.println(e);
        }

        System.out.println("With Pig latin names");
        addPigLatinName(storeEmployees);

    }

    public static void addPigLatinName(List<?extends StoreEmployee180> list) {
        String lastName= "Piggy";

        class DecoratedEmployee180 extends StoreEmployee180 implements Comparable<DecoratedEmployee180>{
            private String pigLatinName;
            private Employee180     originalInstance;

            public DecoratedEmployee180(String pigLatinName, Employee180 originalInstance) {
                this.pigLatinName = pigLatinName+" "+lastName;
                this.originalInstance = originalInstance;
            }

            @Override
            public String toString() {
                return originalInstance.toString()+" "+pigLatinName;
            }

            @Override
            public int compareTo(DecoratedEmployee180 o) {
                return pigLatinName.compareTo(o.pigLatinName);
            }
        }
        List<DecoratedEmployee180> newList=new ArrayList<>(list.size());
        for(var employee:list){
            String name= employee.getName();
            String pigLatin = name.substring(1)+name.charAt(0)+"ay";
            newList.add(new DecoratedEmployee180(pigLatin, employee));
        }

        newList.sort(null);

        for(var dEmployee:newList){
            System.out.println(dEmployee.originalInstance.getName()+" "+dEmployee.pigLatinName);
        }
    }
}
