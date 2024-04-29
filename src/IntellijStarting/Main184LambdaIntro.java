package IntellijStarting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main184LambdaIntro {
    record Person184 (String firstName, String lastName) {
        @Override
        public String toString() {
            return firstName+" "+lastName;
        }
    }
    public static void main(String[] args) {
        List<Person184> people = new ArrayList<>(Arrays.asList(
                new Main184LambdaIntro.Person184("Lucy", "Van Pelt"),
                new Person184("Sally", "Brown"),
                new Person184("Linus", "Van Pelt"),
                new Person184("Peppermint", "Patty"),
                new Person184("Charlie", "Brown")
        ));

//        Using anonymous class
        var comparatorLastName = new Comparator<Person184>() {
            @Override
            public int compare(Person184 o1, Person184 o2) {
                return o1.lastName().compareTo(o2.lastName());
            }
        };

        people.sort((o1, o2) -> o1.lastName().compareTo(o2.lastName()));
        System.out.println(people);

        interface EnhancedComparator184<T> extends Comparator<T> {
            int secondLevel(T o1, T o2);
        }

        var comparatorMixed=new EnhancedComparator184<Person184>() {

            @Override
            public int compare(Person184 o1, Person184 o2) {
                return (o1.lastName().compareTo(o2.lastName()) == 0 ? secondLevel(o1, o2) : o1.lastName().compareTo(o2.lastName()));
            }

            @Override
            public int secondLevel(Person184 o1, Person184 o2) {
                return o1.firstName().compareTo(o2.firstName());
            }
        };

        people.sort(comparatorMixed);
        System.out.println(people);
    }
}
