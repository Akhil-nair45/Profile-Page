class A extends Thread{
    public void run()
    {
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println("i "+i+ "Thread A");
        }
    }

    }


    class B extends Thread{
        public void run()
        {
            int i;
            for(i=1;i<=10;i++)
            {
                System.out.println("i "+i+ "Thread B");
            }
        }
    
        }






public class ThreadclassThread
{
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();

        a1.start();
        b1.start();
    }
}