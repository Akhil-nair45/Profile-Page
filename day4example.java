class person {
    private String name;
    private String email;

    public void setName(String name){
    this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
}


public class day4example{
    public static void main(String[] args) {
        person p = new person();
        p.setName("ravi");
        p.setEmail("ra@vi");
        System.out.println("Name: "+p.getName());
        System.out.println("Email: "+p.getEmail());
    
    }

}