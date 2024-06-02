package IntellijStarting.test;

import java.util.*;

public class Main208SetOperationsChallenge {
    public static void main(String[] args) {
        Set<Task208> tasks = TaskData208.getTasks("all");
        sortAndPrint("All Tasks", tasks);

        Comparator<Task208> sortByPriority = Comparator.comparing(Task208::getPriority);
        Set<Task208> annsTasks = TaskData208.getTasks("Ann");
        sortAndPrint("Ann's Tasks", annsTasks, sortByPriority);

        Set<Task208> bobsTasks = TaskData208.getTasks("Bob");
        Set<Task208> carolsTasks = TaskData208.getTasks("Carol");
        List<Set<Task208>> sets = List.of(annsTasks, bobsTasks, carolsTasks);
        Set<Task208> assignedTasks = getUnion(sets);

        sortAndPrint("Assigned Tasks", assignedTasks);

        Set<Task208> everTask = getUnion(List.of(tasks, assignedTasks));
        sortAndPrint("The true is all tasks", everTask);

        Set<Task208> missingTasks = getDifference(everTask, tasks);
        sortAndPrint("Missing tasks", missingTasks);

        Set<Task208> unassignedTasks = getDifference(tasks, assignedTasks);
        sortAndPrint("Unassigned Tasks", unassignedTasks, sortByPriority);

        Set<Task208> overlap = getUnion(List.of(
                getIntersect(annsTasks, bobsTasks),
                getIntersect(carolsTasks, bobsTasks),
                getIntersect(annsTasks, carolsTasks)
        ));
        sortAndPrint("Assigned to multiples", overlap, sortByPriority);
        List<Task208> overlapping = new ArrayList<>();
        for (Set<Task208> set : sets) {
            Set<Task208> dupes = getIntersect(set, overlap);
            overlapping.addAll(dupes);
        }

        Comparator<Task208> priorityNatural = sortByPriority.thenComparing(Comparator.naturalOrder());
        sortAndPrint("Overlapping", overlapping, priorityNatural);
    }

    private static void sortAndPrint(String header, Set<Task208> collection) {
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

    private static Set<Task208> getUnion(List<Set<Task208>> sets) {
        Set<Task208> union = new HashSet<>();
        for (var taskSet : sets) {
           union.addAll(taskSet);
        }
        return union;
    }

    private static Set<Task208> getIntersect(Set<Task208> a, Set<Task208> b) {
        Set<Task208> intersect = new HashSet<>(a);
        intersect.removeAll(b);
        return intersect;
    }

    private static Set<Task208> getDifference(Set<Task208> a, Set<Task208> b) {
        Set<Task208> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }
}
