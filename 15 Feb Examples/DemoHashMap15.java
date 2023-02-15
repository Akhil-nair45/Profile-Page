import java.util.HashMap;

public class DemoHashMap15 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("Rohit", 5945);
        hm.put("Kohli", 1818);
        hm.put("Jadeja",  999);
        System.out.println(hm);
        System.out.println(hm.put("Raina", 9090));
        System.out.println(hm.put("Rohit", 5040));
        

        hm.put(null, 222);
        hm.put(null, 121);

        
    }
}
