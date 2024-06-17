package IntellijStarting;

import java.util.*;

public class Main221EnumCollections {
    enum WeekDay221 {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
    public static void main(String[] args) {
        List<WeekDay221> annsWorkDays = new ArrayList<>(List.of(WeekDay221.MONDAY,
                WeekDay221.TUESDAY, WeekDay221.THURSDAY, WeekDay221.FRIDAY));
        var annsDaysSet = EnumSet.copyOf(annsWorkDays);
        System.out.println(annsDaysSet.getClass().getSimpleName());
        annsDaysSet.forEach(System.out::println);
        var allDaysSet = EnumSet.allOf(WeekDay221.class);

        System.out.println("--------------------------");

        allDaysSet.forEach(System.out::println);

        Set<WeekDay221> newPersonDays = EnumSet.complementOf(annsDaysSet);

        System.out.println("------------------------");

        newPersonDays.forEach(System.out::println);

        Set<WeekDay221> anotherWay = EnumSet.copyOf(allDaysSet);
        anotherWay.removeAll(annsDaysSet);

        System.out.println("------------------------");

        anotherWay.forEach(System.out::println);

        Set<WeekDay221> businessDays = EnumSet.range(WeekDay221.MONDAY, WeekDay221.FRIDAY);

        System.out.println("------------------------");

        businessDays.forEach(System.out::println);

        Map<WeekDay221, String[]> employeeMap = new EnumMap<>(WeekDay221.class);
        employeeMap.put(WeekDay221.FRIDAY, new String[]{"Ann", "Mary", "Bob"});
        employeeMap.put(WeekDay221.MONDAY, new String[]{"Mary", "Bob"});
        employeeMap.forEach((k, v) -> System.out.println(k + " : " + Arrays.toString(v)));
    }
}
