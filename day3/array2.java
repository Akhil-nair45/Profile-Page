import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int arr[]= new int[number];
        if(number<0)
        {
            System.out.println("Invalid array size");
        }
        else{
            
            for (int i=0; i<number; i++)
            {
                arr[i] = sc.nextInt();
                if(arr[i]<0)
                {
                    System.out.println("Invalid Input");
                }
            }
        }
        int score = sc.nextInt();
        if(score<0)
        {
            System.out.println("Invalid score");
        }
        if(arr[3] > arr[1] && arr[5] > arr[1])
        {
            System.out.println(arr[2]);
            System.out.println(arr[4]);
        }
    }
}
