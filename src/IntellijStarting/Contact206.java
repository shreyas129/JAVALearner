package IntellijStarting;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Contact206 {
    private String name;
    private Set<String> emails = new HashSet<>(), phones = new HashSet<>();

    public Contact206(String name) {
        this(name, null);
    }

    public Contact206(String name, String email) {
        this(name, email, 0);
    }

    public Contact206(String name, long phone) {
        this(name, null, phone);
    }

    public Contact206(String name, String email, long phone) {
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

    public String getNameLastFirst() {
        return name.substring(name.indexOf(" ") + 1) + ", " +
                name.substring(0, name.indexOf(" "));
    }

    @Override
    public String toString() {
        return "%s: %s %s".formatted(name, emails, phones);
    }

    public Contact206 mergeContactData(Contact206 contact) {
        Contact206 newContact = new Contact206(name);
        newContact.emails = new HashSet<>(this.emails);
        newContact.phones = new HashSet<>(this.phones);
        newContact.emails.addAll(contact.emails);
        newContact.phones.addAll(contact.phones);
        return newContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact206 that = (Contact206) o;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return 33 * Objects.hashCode(getName());
    }

    public void addEmail(String companyName) {
        String[] names = name.split(" ");
        String email = "%c%s@%s.com".formatted(name.charAt(0), names[names.length - 1], companyName.replaceAll(" ", "").toLowerCase());
        if (!emails.add(email)) System.out.println(name + " already has email " + email);
        else System.out.println(name + " now has email " + email);
    }

    public void replaceEmailIfExists(String oldEmail, String newEmail) {
        if (emails.contains(oldEmail)) {
            emails.remove(oldEmail);
            emails.add(newEmail);
        }
    }
}
