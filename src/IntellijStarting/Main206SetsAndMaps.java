package IntellijStarting;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main206SetsAndMaps {
    public static void main(String[] args) {
        List<Contact206> emails = ContactData206.getData("email");
        List<Contact206> phones = ContactData206.getData("phone");
        printData("Phone List", phones);
        printData("Email List", emails);

        Set<Contact206> emailContacts = new HashSet<>(emails);
        Set<Contact206> phoneContacts = new HashSet<>(phones);
        printData("Phone Contacts", phoneContacts);
        printData("Email Contacts", emailContacts);

        int index = emails.indexOf(new Contact206("Robin Hood"));
        Contact206 robinHood = emails.get(index);
        robinHood.addEmail("Sherwood Forest");
        robinHood.addEmail("Sherwood Forest");
        robinHood.replaceEmailIfExists("RHood@sherwoodforest.com", "RHood@sherwoodforest.org");
        System.out.println(robinHood);

    }

        public static void printData(String header, Collection<Contact206> contacts) {
        System.out.println("---------------------------------------------");
        System.out.println(header);
        System.out.println("---------------------------------------------");
        contacts.forEach(System.out::println);
    }
}
