package IntellijStarting.test;

import java.util.*;

public class Main208SetOperationsChallenge {
    public static void main(String[] args) {
        Set<Task208> tasks = TaskData208.getTasks("all");
        sortAndPrint("All Tasks", tasks);

        Comparator<Task208> sortByPriority = Comparator.comparing(Task208::getPriority);
        Set<Task208> annsTasks = TaskData208.getTasks("Ann");
        sortAndPrint("Ann's Tasks", annsTasks, sortByPriority);
    }

    private static void sortAndPrint(String header, Collection<Task208> collection) {
        sortAndPrint(header, collection, null);
    }

    private static void sortAndPrint(String header, Collection<Task208> collection, Comparator<Task208> sorter) {
        String lineSeparator = "_".repeat(90);
        System.out.println(lineSeparator);
        System.out.println(header);
        System.out.println(lineSeparator);

        List<Task208> list = new ArrayList<>(collection);
        list.sort(sorter);
        list.forEach(System.out::println);
    }
}
