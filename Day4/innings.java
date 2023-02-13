    class innings{
    private String teamname;
    private String inningsname;
    private int runs;

    public void setTeamname(String teamname)
    {
        this.teamname = teamname;
    }
    public void setInningsname(String inningsname)
    {
        this.inningsname = inningsname;
    }
    public void setRuns(int runs)
    {
        this.runs = runs;
    }

    String getTeamname()
    {
        return this.teamname;
    }
    String getInningsname()
    {
        return this.inningsname;
    }
    int getRuns()
    {
        return this.runs;
    }

    public void displayInningsDetails() {
        System.out.println("Name: " + this.teamname);
        System.out.println("Scored : " + this.runs);
        if (this.inningsname.toLowerCase().equals("first"))
            System.out.println("Need " + (this.runs + 1) + " to win ");
        else
            System.out.println("Match ended");
}
}