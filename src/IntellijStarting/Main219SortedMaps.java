package IntellijStarting;

import java.time.LocalDate;
import java.util.*;

public class Main219SortedMaps {
    private static final Map<String, Purchase219> purchases = new LinkedHashMap<>();
    private static final NavigableMap<String, Student219> students = new TreeMap<>();

    public static void main(String[] args) {
        Course219 jmc = new Course219("jmc101", "Java Master Class", "Java");
        Course219 python = new Course219("pyt101", "Python Master Class", "Java");

        addPurchase("Mary Martin", jmc, 129.99);
        addPurchase("Andy Martin", jmc, 139.99);
        addPurchase("Mary Martin", python, 149.99);
        addPurchase("Joe Jones", jmc, 149.99);
        addPurchase("Bill Brown", python, 119.99);

        addPurchase("Chuck Cheese", python, 119.99);
        addPurchase("Davey Jones", jmc, 139.99);
        addPurchase("Eva East", python, 139.99);
        addPurchase("Fred Forker", jmc, 139.99);
        addPurchase("Greg Brady", python, 129.99);

        purchases.forEach((key, value) -> System.out.println(key + ": " + value));
        System.out.println("-----------------------");
        students.forEach((key, value) -> System.out.println(key + ": " + value));

        NavigableMap<LocalDate, List<Purchase219>> datedPurchases = new TreeMap<>();

        for (Purchase219 p : purchases.values()) {
            datedPurchases.compute(p.purchaseDate(), (_, plist) -> {
                List<Purchase219> list = plist == null ? new ArrayList<>() : plist;
                list.add(p);
                return list;
            });
        }
        datedPurchases.forEach((key, value) -> System.out.println(key + ": " + value));

        int currentYear = LocalDate.now().getYear();
        LocalDate firstDay = LocalDate.ofYearDay(currentYear, 1);
        LocalDate week1 = firstDay.plusDays(7);
        Map<LocalDate, List<Purchase219>> week1Purchases = datedPurchases.headMap(week1);
        Map<LocalDate, List<Purchase219>> week2Purchases = datedPurchases.tailMap(week1);

//        System.out.println("-----------------------");
//        week1Purchases.forEach((key, value) -> System.out.println(key + ": " + value));
//        System.out.println("-----------------------");
//        week2Purchases.forEach((key, value) -> System.out.println(key + ": " + value));

        displayStats(1, week1Purchases);
        displayStats(2, week2Purchases);

        System.out.println("------------------------");

        LocalDate lastDate = datedPurchases.lastKey();
        var previousEntry = datedPurchases.lastEntry();

        while (previousEntry != null) {
            List<Purchase219> lastDaysData = previousEntry.getValue();
            System.out.println(lastDate + " purchases : " + lastDaysData.size());

            LocalDate prevDate = datedPurchases.lowerKey(lastDate);
            previousEntry = datedPurchases.lowerEntry(lastDate);
            lastDate = prevDate;
        }

        System.out.println("-----------------------");

        var reversed = datedPurchases.descendingMap();
        LocalDate firstDate = reversed.firstKey();
//        var nextEntry = reversed.firstEntry();
        var nextEntry = reversed.pollFirstEntry();
        while (nextEntry != null) {
            List<Purchase219> lastDaysData = nextEntry.getValue();
            System.out.println(firstDate + " purchases : " + lastDaysData.size());

            LocalDate nextDate = reversed.higherKey(firstDate);
//            nextEntry = reversed.higherEntry(firstDate);
            nextEntry = reversed.pollFirstEntry();
            firstDate = nextDate;
        }

        System.out.println("-----------------------");

        datedPurchases.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    private static void addPurchase(String name, Course219 course, double price) {
        Student219 existingStudent = students.get(name);
        if (existingStudent == null) {
            existingStudent = new Student219(name, course);
            students.put(name, existingStudent);
        } else {
            existingStudent.addCourse(course);
        }

        int day = new Random().nextInt(1, 15);
        String key = course.courseId() + "_" + existingStudent.getId();
        int year = LocalDate.now().getYear();
        Purchase219 purchase = new Purchase219(course.courseId(), existingStudent.getId(), price, year, day);
        purchases.put(key, purchase);
    }

    private static void displayStats(Integer period, Map<LocalDate, List<Purchase219>> periodData) {
        System.out.println("----------------------");
        Map<String, Integer> weeklyCounts = new TreeMap<>();
        periodData.forEach((key, value) -> {
            System.out.println(key + ": " + value);
            for (Purchase219 p : value) {
                weeklyCounts.merge(p.courseId(), 1, Integer::sum);
            }
        });

        System.out.printf("Week %d purchases = %s%n", period, weeklyCounts);
    }
}
