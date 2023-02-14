import java.util.*;
// import DemoCollection2.java;
// class student{
//     public student(String name, String location, String email){

//     }
// }


// class em{
//     public em(String name, String location)
//     {

//     }
// }


public class DemoCollection {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(12);
        //al.add(true);
        //al.add("abc");
        al.add(45);
        al.add(12);
        //al.add(13.5);
        //al.add("abc");
        //al.add(new em("xyz", "Ahmedabad"));
        System.out.println(al);
        al.add(56);
        al.add(264);
        al.add(209);
        al.add(208);
        al.add(5);
        System.out.println(al);




        //1st example
        for(int i : al)
        {
            System.out.println(i);
        }
        al.remove(0);
        System.out.println(al);
        //System.out.println(al);




        //2nd example 
       ArrayList <student> al1= new ArrayList <student>();
       al1.add(new student("abc","Ahmedabad","ab@ab.com"));
       


student s1 = new student(null, null, null);

        //3rd example
        for( student e1 : al1){
            System.out.println(e1.getName() + " " + e1.getEmail());
        }

System.out.println(al1);

        }
    }
