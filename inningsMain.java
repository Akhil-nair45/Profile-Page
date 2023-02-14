class Innings{
    private String teamname;
    private String inningsname;
    private int runs;

    public void setTeamname(String teamname){
        this.teamname =teamname;
        }

          void getTeamname()
          {
            System.out.println("Teamname: " + teamname);
          }
        
        public void setInningsname(String inningsname){
            this.inningsname =inningsname ;
            }
    
              void getInningsname()
              {
                System.out.println("Inningsname: " + inningsname);
              }

         public void setRuns(int runs){
                this.runs = runs;
                }
        
                  void getruns()
                  {
                    System.out.println("Runs: " + runs);
                  }
}