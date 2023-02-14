import java.util.ArrayList;
import java.util.TreeSet;

class player implements Comparable<player> {
    private String playerName;
    private String country;
    private String skills;
    private int runs;


    
    public player() {
        super();
    }
    public player(String playerName, String country, String skills,int runs) {
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
    @Override
    public int compareTo(player o) {
        // TODO Auto-generated method stub
        return this.playerName.compareTo(o.getPlayerName());
    }
}



    public class playerMain14{
        public static void main(String[] args) {
           // player p1 = new player("Rohit","India", "Opener");
           // System.out.println(p1);

           //ArrayList<player> al = new ArrayList<player>();
           TreeSet<player> al = new TreeSet<player>();
 
           al.add(new player("Rohit", "India", "Opener", 121));
           al.add(new player("Virat", "India", "Cover Drive", 110));
           //al.add(new player("Surya", "India", "Hard Hitter",150));
           //al.add(new player("Hardik", "India", "Hard Hitter",50));
           //al.add(new player("Jadeja", "India", "Fielding",45));
           al.add(new player("Virat", "India", "Carrom ball",40));
           //System.out.println(al);
           for(player p1:al)
           {
            System.out.println(al);
           }
        }
    }

    

