package IntellijStarting;

interface Player165 {}

record BaseballPlayer164(String name, String position) implements Player165{}

record FootballPlayer164(String name, String position) implements Player165{}

public class MainGenerics164 {
    public static void main(String[] args) {
        BaseballTeam164 phillies1=new BaseballTeam164("Philadelphia phillies");
        BaseballTeam164 astros1 =new BaseballTeam164("Houston astros");
        scoreResult(phillies1, 3, astros1, 5);

        SportsTeam165 phillies2=new SportsTeam165("Philadelphia phillies");
        SportsTeam165 astros2 =new SportsTeam165("Houston astros");
        scoreResult(phillies2,3, astros2, 5);

        Team165<BaseballPlayer164> phillies=new Team165<>("Philadelphia phillies");
        Team165<BaseballPlayer164> astros =new Team165<>("Houston astros");
        scoreResult(phillies,3, astros, 5);

        var harper = new BaseballPlayer164("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer164("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        var guthrie = new BaseballPlayer164("D Guthrie", "Center Fielder");
        phillies.addTeamMember(guthrie);
        phillies.listTeamMembers();

        SportsTeam165 afc1 = new SportsTeam165("Adelaide crows");
        Team165<FootballPlayer164> afc = new Team165<>("Adelaide crows");
        var tex = new FootballPlayer164("Tex walker", "Center half forward");
        afc.addTeamMember(tex);
        var rory = new FootballPlayer164("Rory Laird", "Midfield");
        afc.addTeamMember(rory);
        afc.listTeamMembers();
    }

    public static void scoreResult(BaseballTeam164 team1, int t1_score, BaseballTeam164 team2, int t2_score) {
        String message=team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam165 team1, int t1_score, SportsTeam165 team2, int t2_score) {
        String message=team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team165 team1, int t1_score, Team165 team2, int t2_score) {
        String message=team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
