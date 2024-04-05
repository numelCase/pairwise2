public class Team {
    private int teamNum;
    private int rank;
    private String note;
    public Team(int num, int r, String n){
        teamNum = num;
        rank = r;
        note = n;
    }
    public int getTeamNum(){
        return teamNum;
    }
    public int getRank(){
        return rank;
    }
    public String getNote(){
        return note;
    }
}
