package IntellijStarting;

import java.util.Random;

public class Main146Enum {
    public static void main(String[] args) {
        DayOfTheWeek146 weekDay = DayOfTheWeek146.TUE;
        System.out.println(weekDay);

        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();

//            System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());
//
//            if (weekDay == DayOfTheWeek146.FRI) {
//                System.out.println("Found Friday!!!");
//            }

            switchDayOfWeek(weekDay);
        }

        for (Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }

    public static void switchDayOfWeek(DayOfTheWeek146 weekDay) {
        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay) {
            case WED -> System.out.println("Wednesday is the day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is the day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() + "day is Day " + weekDayInteger);
        }
    }

    public static DayOfTheWeek146 getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek146.values();

        return allDays[randomInteger];
    }
}