package IntellijStarting;

import java.util.ArrayList;
import java.util.List;

public class Team165<T> {
    private String teamName;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0, totalLosses = 0, totalTies = 0;

    public Team165(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(T t) {
        if (!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }

    public void listTeamMembers() {
        System.out.println(teamName + " Roster:");
        System.out.println(teamMembers);
    }

    public int ranking() {
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore) {
        String message = "lost to";
        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message="tied";
        } else{
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return teamName+" (Ranked "+ranking()+")";
    }
}
