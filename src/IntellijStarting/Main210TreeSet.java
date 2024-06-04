package IntellijStarting;

import java.util.*;

public class Main210TreeSet {
    public static void main(String[] args) {
        List<Contact206> phones = ContactData206.getData("phone");
        List<Contact206> emails = ContactData206.getData("email");

//        NavigableSet<Contact206> sorted = new TreeSet<>(phones);
        Comparator<Contact206> mySort = Comparator.comparing(Contact206::getName);
        NavigableSet<Contact206> sorted = new TreeSet<>(mySort);
        sorted.addAll(phones);
        sorted.forEach(System.out::println);

        NavigableSet<String> justNames = new TreeSet<>();
        phones.forEach(c -> justNames.add(c.getName()));
        System.out.println(justNames);

        NavigableSet<Contact206> fullSet = new TreeSet<>(sorted);
        fullSet.addAll(emails);
        fullSet.forEach(System.out::println);

        List<Contact206> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.sort(sorted.comparator());
        System.out.println("--------------------------");
        fullList.forEach(System.out::println);

        Contact206 min = Collections.min(fullSet, fullSet.comparator());
        Contact206 max = Collections.max(fullSet, fullSet.comparator());

        Contact206 first = fullSet.first();
        Contact206 last = fullSet.last();

        System.out.println("----------------------------");
        System.out.printf("min = %s, first =%s %n", min.getName(), first.getName());
        System.out.printf("max = %s, last =%s %n", max.getName(), last.getName());
        System.out.println("----------------------------");

        NavigableSet<Contact206> copiedSet = new TreeSet<>(fullSet);
        System.out.println("First element = " + copiedSet.pollFirst());
        System.out.println("Last element = " + copiedSet.pollLast());
        copiedSet.forEach(System.out::println);
        System.out.println("----------------------------");

        Contact206 daffy = new Contact206("Daffy Duck");
        Contact206 daisy = new Contact206("Daisy Duck");
        Contact206 snoopy = new Contact206("Snoopy");
        Contact206 archie = new Contact206("Archie");

        for (Contact206 c : List.of(daffy, daisy, daisy, snoopy)) {
            System.out.printf("ceiling(%s)=%s%n", c.getName(), fullSet.ceiling(c));
            System.out.printf("higher(%s)=%s%n", c.getName(), fullSet.higher(c));
        }
        System.out.println("-----------------------------");

        for (Contact206 c : List.of(daffy, daisy, first, archie)) {
            System.out.printf("floor(%s)=%s%n", c.getName(), fullSet.floor(c));
            System.out.printf("lower(%s)=%s%n", c.getName(), fullSet.lower(c));
        }
        System.out.println("-----------------------------");

        NavigableSet<Contact206> descendingSet = fullSet.descendingSet();
        descendingSet.forEach(System.out::println);
        System.out.println("------------------------------");

        Contact206 lastContact = descendingSet.pollLast();
        System.out.println("Removed " + lastContact);
        descendingSet.forEach(System.out::println);
        System.out.println("-------------------------------");

        fullSet.forEach(System.out::println);
        System.out.println("-------------------------------");

        Contact206 marion = new Contact206("Maid Marion");
        var headSet = fullSet.headSet(marion, true);
        headSet.forEach(System.out::println);
        System.out.println("-------------------------------");

        var tailSet = fullSet.tailSet(marion, false);
        tailSet.forEach(System.out::println);
        System.out.println("-------------------------------");

        Contact206 linus = new Contact206("Linus Van Pelt");
        var subset = fullSet.subSet(linus, false, marion, true);
        subset.forEach(System.out::println);
    }
}
