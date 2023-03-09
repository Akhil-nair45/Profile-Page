class Demo extends Thread{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Child thread"+ i);
		}
	}
}



class MainThread{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.start();
		for (int i=1; i<=5; i++)
		{
			System.out.println("Master Thread: "+ i);
		}
		
	}
}