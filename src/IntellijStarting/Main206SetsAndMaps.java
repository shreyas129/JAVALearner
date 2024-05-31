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

        Set<Contact206> unionAB = new HashSet<>();
        unionAB.addAll(emailContacts);
        unionAB.addAll(phoneContacts);
        printData("(A ∪ B) Union of emails (A) with phones (B)", unionAB);

        Set<Contact206> intersectAB = new HashSet<>(emailContacts);
        intersectAB.retainAll(phoneContacts);
        printData("(A ∩ B) Intersect emails (A) with phones (B)", intersectAB);

        Set<Contact206> intersectBA = new HashSet<>(phoneContacts);
        intersectBA.retainAll(emailContacts);
        printData("(B ∩ A) Intersect phones (B) with emails (A)", intersectBA);

        Set<Contact206> AMinusB = new HashSet<>(emailContacts);
        AMinusB.removeAll(phoneContacts);
        printData("(A - B) emails (A) - phones (B)", AMinusB);

        Set<Contact206> BMinusA = new HashSet<>(phoneContacts);
        BMinusA.removeAll(emailContacts);
        printData("(B - A) phones (B) - emails (A)", BMinusA);

        Set<Contact206> symmetricDiff = new HashSet<>(AMinusB);
        symmetricDiff.addAll(BMinusA);
        printData("Symmetric Difference: phones and emails", symmetricDiff);

        Set<Contact206> symmetricDiff2 = new HashSet<>(unionAB);
        symmetricDiff2.removeAll(intersectAB);
        printData("Symmetric Difference: phones and emails", symmetricDiff2);
    }

    public static void printData(String header, Collection<Contact206> contacts) {
        System.out.println("---------------------------------------------");
        System.out.println(header);
        System.out.println("---------------------------------------------");
        contacts.forEach(System.out::println);
    }
}
