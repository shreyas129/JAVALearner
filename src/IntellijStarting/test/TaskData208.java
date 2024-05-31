package IntellijStarting.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TaskData208 {
    private static final String tasks = """
            Infrastructure, Logging, High
            Infrastructure, DB Access, Medium
            Infrastructure, Security, High
            Infrastructure, Password Policy, Medium
            Infrastructure, Task Table, Medium
            Infrastructure, Employee Table, Medium
            Infrastructure, Cross Reference Tables, High
            Infrastructure, Encryption Policy, High
            Infrastructure, Write Views, Low
            Infrastructure, Set Up Users, Low
            Infrastructure, Set Up Access Policy, Low
            """, annsTasks = """
            Infrastructure, Security, High, In Progress
            Infrastructure, Password Policy, Medium, In Progress
            Infrastructure, Cloud solutions	 Medium, In Progress
            Infrastructure, Encryption Policy, High
            Infrastructure, Project Table, Medium
            Infrastructure, Write Views	Low, In Progress
            """, bobsTasks = """
            Infrastructure Security, High, In Progress
            Infrastructure Password Policy, Medium
            Infrastructure Encryption Policy, High
            Infrastructure Write Views, Low, In Progress
            """, carolsTasks = """
            Infrastructure, Infrastructure, Infrastructure, Infrastructure
            Infrastructure, DB Access, Medium
            Infrastructure, Password Policy, Medium
            Data Design, Task Table, High
            Data Access, Write Views, Low
            """;

    public static Set<Task208> getTasks(String owner) {
        Set<Task208> taskList = new HashSet<>();
        String user = "ann,bob,carol".contains(owner.toLowerCase()) ? owner : null;
        String selectedList = switch (owner.toLowerCase()) {
            case "ann" -> annsTasks;
            case "bob" -> bobsTasks;
            case "carol" -> carolsTasks;
            default -> tasks;
        };

        for (String taskData : selectedList.split("\n")) {
            String[] data = taskData.split(",");
            Arrays.asList(data).replaceAll(String::trim);

            Priority208 priority = Priority208.valueOf(data[2].toUpperCase());
            Status208 status = (data.length <= 3) ? Status208.IN_QUEUE : Status208.valueOf(data[3].toUpperCase().replace(' ', '_'));

            taskList.add(new Task208(data[0], data[1], user, priority, status));
        }
        return taskList;
    }

}
