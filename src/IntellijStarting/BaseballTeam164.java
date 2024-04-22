package IntellijStarting;

import java.util.ArrayList;
import java.util.List;

public class BaseballTeam164 {
    private String teamName;
    private List<BaseballPlayer164> teamMembers = new ArrayList<>();
    private int totalWins = 0, totalLosses = 0, totalTies = 0;

    public BaseballTeam164(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(BaseballPlayer164 player) {
        if (!teamMembers.contains(player)) {
            teamMembers.add(player);
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
