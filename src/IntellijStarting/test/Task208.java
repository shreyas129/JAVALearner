package IntellijStarting.test;

enum Priority208 {HIGH, MEDIUM, LOW}

enum Status208 {IN_QUEUE, ASSIGNED, IN_PROGRESS}

public class Task208 implements Comparable<Task208> {
    private String project, description, assignee;
    private Priority208 priority;
    private Status208 status;

    public Task208(String project, String description, String assignee, Priority208 priority, Status208 status) {
        this.project = project;
        this.description = description;
        this.assignee = assignee;
        this.priority = priority;
        this.status = status;
    }

    public Task208(String project, String description, String assignee, Priority208 priority) {
        this(project, description, assignee, priority, assignee == null ? Status208.IN_QUEUE : Status208.ASSIGNED);
    }

    public Task208(String project, String description, Priority208 priority) {
        this(project, description, null, priority);
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public Priority208 getPriority() {
        return priority;
    }

    public void setPriority(Priority208 priority) {
        this.priority = priority;
    }

    public Status208 getStatus() {
        return status;
    }

    public void setStatus(Status208 status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "%-20s %-25s %-10s %-10s %s".formatted(project, description, priority, assignee, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task208 task208 = (Task208) o;
        return getProject().equals(task208.getProject()) && getDescription().equals(task208.getDescription());
    }

    @Override
    public int hashCode() {
        int result = getProject().hashCode();
        result = 31 * result + getDescription().hashCode();
        return result;
    }

    @Override
    public int compareTo(Task208 o) {
        int result = this.project.compareTo(o.project);
        if (result == 0) {
            result = this.description.compareTo(o.description);
        }
        return result;
    }
}
