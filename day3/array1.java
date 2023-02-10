import java.util.Scanner;

public class array1 {
public static void main(String[] args) {
    int sumodd = 0;
    int sumeven = 0;
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if(number < 0)
    {
        System.out.println("Invalid array size");
    }
    else{
        int arr[] = new int[number];

        for(int i=0; i< number; i++)
        {
             arr[i] = sc.nextInt();
        }
        for ( int i=0; i< number; i++)
        {
            if(arr[i] %2 == 0)
            {
                sumeven =sumeven + arr[i];
            }
            else{
                sumodd =sumodd + arr[i];
            }
        }
        if (sumeven > sumodd)
        {
            System.out.println(sumeven);
        }
        else{
            System.out.println(sumodd);
        }
    }
}
}
