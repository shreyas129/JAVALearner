package IntellijStarting.test;

import java.util.Collection;
import java.util.List;

public class Main205SetsAndMaps {
    public static void main(String[] args) {
        List<Contact205> emails = ContactData205.getData("email");
        List<Contact205> phones = ContactData205.getData("phone");
        printData("Phone List", phones);
        printData("Email List", emails);

    }

    public static void printData(String header, Collection<Contact205> contacts) {
        System.out.println("---------------------------------------------");
        System.out.println(header);
        System.out.println("---------------------------------------------");
        contacts.forEach(System.out::println);
    }
}
