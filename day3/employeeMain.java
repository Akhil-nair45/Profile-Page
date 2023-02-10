import java.util.Scanner;

public class employeeMain {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the name");
        String name1 = sc.nextLine();

        System.out.println("enter the address");
        String address2 = sc.nextLine();

        System.out.println("enter the mobile");
        String mobile1 = sc.nextLine();
        System.out.println("Employee Details");
        employee1 e1 = new employee1();
        e1.setName(name1);
        e1.setAddress(address2);
        e1.setmobile(mobile1);
        e1.getName();
        e1.getAddress();
        e1.getmobile();
    }
}