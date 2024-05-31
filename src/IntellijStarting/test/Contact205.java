package IntellijStarting.test;

import java.util.HashSet;
import java.util.Set;

public class Contact205 {
    private String name;
    private Set<String> emails = new HashSet<>(), phones = new HashSet<>();

    public Contact205(String name) {
        this(name, null);
    }

    public Contact205(String name, String email) {
        this(name, email, 0);
    }

    public Contact205(String name, long phone) {
        this(name, null, phone);
    }

    public Contact205(String name, String email, long phone) {
        this.name = name;
        if (email != null) {
            emails.add(email);
        }
        if (phone > 0) {
            String p = String.valueOf(phone);
            p = "(%s) %s-%s".formatted(p.substring(0, 3), p.substring(3, 6), p.substring(6));
            phones.add(p);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%s: %s %s".formatted(name, emails, phones);
    }

    public Contact205 mergeContactData(Contact205 contact) {
        Contact205 newContact = new Contact205(name);
        newContact.emails = new HashSet<>(this.emails);
        newContact.phones = new HashSet<>(this.phones);
        newContact.emails.addAll(contact.emails);
        newContact.phones.addAll(contact.phones);
        return newContact;
    }
}
