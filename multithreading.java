package Day4;

class Demo extends Thread{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Chile thread"+ i);
		}
	}
}



 class multithreading{
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