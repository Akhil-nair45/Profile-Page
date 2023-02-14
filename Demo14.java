import java.util.*;
public class Demo14 {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<Integer>();
        hs1.add(10);
        hs1.add(45);
        hs1.add(44);
        hs1.add(55);
        hs1.add(16);
        System.out.println("Hash set: "+hs1);
        TreeSet<Integer> ts1 = new TreeSet<Integer>();
        ts1.add(10);
        ts1.add(45);
        ts1.add(55);
        ts1.add(44);
        ts1.add(16);
        System.out.println("Tree set: "+ts1);
    }
}
