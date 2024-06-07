package IntellijStarting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main214Map {
    public static void main(String[] args) {
        List<Contact206> phones = ContactData206.getData("phone");
        List<Contact206> emails = ContactData206.getData("email");

        List<Contact206> fullList = new ArrayList<>(phones);
        fullList.addAll(emails);
        fullList.forEach(System.out::println);
        System.out.println("--------------------------------");

        Map<String, Contact206> contacts = new HashMap<>();
        for (Contact206 contact : fullList) {
            contacts.put(contact.getName(), contact);
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));

        System.out.println("-----------------------------");
        System.out.println(contacts.get("Charlie Brown"));

        System.out.println(contacts.get("Chuck Brown"));

        Contact206 defaultContact = new Contact206("Chuck Brown");
        System.out.println(contacts.getOrDefault("Chuck Brown", defaultContact));

        System.out.println("-----------------------------");
        contacts.clear();
        for (Contact206 contact : fullList) {
            Contact206 duplicate = contacts.put(contact.getName(), contact);
            if (duplicate != null) {
//                System.out.println("duplicate = " + duplicate);
//                System.out.println("current = " + contact);
                contacts.put(contact.getName(), contact.mergeContactData(duplicate));

            }
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));

        System.out.println("-----------------------------");
        contacts.clear();
        for (Contact206 contact : fullList) {
            contacts.putIfAbsent(contact.getName(), contact);
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));

        System.out.println("-----------------------------");
        contacts.clear();
        for (Contact206 contact : fullList) {
            Contact206 duplicate = contacts.putIfAbsent(contact.getName(), contact);
            if (duplicate != null) {
                contacts.put(contact.getName(), contact);
            }
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));

        System.out.println("-----------------------------");
        contacts.clear();
        fullList.forEach(contact -> contacts.merge(contact.getName(), contact,
                Contact206::mergeContactData));

        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));

        System.out.println("-----------------------------");
        for (String contactName : new String[] {"Daisy Duck", "Daffy Duck", "Scrooge McDuck"}) {
            contacts.computeIfAbsent(contactName, Contact206::new);
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));

        System.out.println("-----------------------------");
        for (String contactName : new String[] {"Daisy Duck", "Daffy Duck", "Scrooge McDuck"}) {
            contacts.computeIfPresent(contactName, (k, v) -> {
                v.addEmail("Fun place"); return v;
            });
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));

        System.out.println("-----------------------------");
        contacts.replaceAll((k, v) -> {
            v.replaceEmailIfExists("DDuck@funplace.com",
                    k.replaceAll(" ", "") + "@funplace.com");
            return v;
        });
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));

        System.out.println("-----------------------------");
        Contact206 daisy = new Contact206("Daisy Jane Duck", "daisyj@duck.com");
        Contact206 replacedContact = contacts.replace("Daisy Duck", daisy);
        System.out.println("Daisy = " + daisy);
        System.out.println("replacedContact = " + replacedContact);
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value= " + v));
        System.out.println("-----------------------------");

        Contact206 updatedDaisy = replacedContact.mergeContactData(daisy);
        System.out.println("updatedDaisy = " + updatedDaisy);
        boolean success = contacts.replace("Daisy Duck", replacedContact, updatedDaisy);
        if (success) {
            System.out.println("Successfully replaced element");
        } else {
            System.out.printf("Did not match on both key: %s and value: %s %n", "Daisy Duck",
                    replacedContact);
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));
        System.out.println("-----------------------------");
        success = contacts.remove("Daisy Duck", daisy);
        if (success) {
            System.out.println("Successfully removed element");
        } else {
            System.out.printf("Did not match on both key: %s and value: %s %n".formatted("Daisy Duck", daisy));
        }
        contacts.forEach((k, v) -> System.out.println("key=" + k + ", value=" + v));
    }
}
