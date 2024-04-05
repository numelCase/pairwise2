import java.util.ArrayList;
import java.util.Arrays;

public class Match {
    int matchNum;
    // all teams in each alliance by team number
    ArrayList<Team> blueTeams = new ArrayList<Team>();
    ArrayList<Team> redTeams = new ArrayList<Team>();

    Match(int matchNum, ArrayList<Team> blueTeams, ArrayList<Team> redTeams){
        matchNum = this.matchNum;
        blueTeams = this.blueTeams;
        blueTeams = this.blueTeams;
    }

    Match(int matchNum, Team blue1, Team blue2, Team blue3, Team red1, Team red2, Team red3){
        matchNum = this.matchNum;
        //idfk if this works but it probably does
        blueTeams = new ArrayList<Team>(Arrays.asList(blue1, blue2, blue3));
        redTeams = new ArrayList<Team>(Arrays.asList(red1, red2, red3));
    }
    public void export(){

    }
}
