 class player {
    private String playerName;
    private String country;
    private String skills;
    private int runs;
    
    public player() {
    }

    public player(String playerName, String country, String skills, int runs) {
        this.playerName = playerName;
        this.country = country;
        this.skills = skills;
        this.runs = runs;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    @Override
    public String toString() {
        return "player [playerName=" + playerName + ", country=" + country + ", skills=" + skills + ", runs=" + runs
                + "]";
    }

    public int compareTo(player o) {
        // TODO Auto-generated method stub
        return this.playerName.compareTo(o.getPlayerName());
    }
    
    
}
