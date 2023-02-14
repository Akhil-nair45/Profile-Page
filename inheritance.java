class inheritance123 {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

}

class inheritance1 extends inheritance123 {
    private int rollno;

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getRollno() {
        return this.rollno;
    }
}

public class inheritance {

    public static void main(String[] args) {
        inheritance1 i1 = new inheritance1();
        i1.setAge(21);
        i1.setName("ram");
        i1.setRollno(12);
        i1.getAge();
        i1.getName();
        i1.getRollno();
        System.out.println("Name : " + i1.getName());
        System.out.println("age : " + i1.getAge());
        System.out.println("roll no : " + i1.getRollno());
    }
}
