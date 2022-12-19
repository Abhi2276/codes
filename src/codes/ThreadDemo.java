package codes;

public  class ThreadDemo {
	
 synchronized	void printTable(int n)
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	
	

}

   class MyThread1 extends Thread
{
	ThreadDemo t;
	MyThread1(ThreadDemo t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
   
   class MyThread2 extends Thread
   {
	   ThreadDemo t;
	   MyThread2(ThreadDemo t)
	   {
		   this.t=t;
	   }
	   public void run()
	   {
		   t.printTable(100);
	   }
   }
   
//    class TestSync{
//	   public static void main(String[] args)
//	   {
//		   ThreadDemo obj=new ThreadDemo();
//		   MyThread1 t1= new MyThread1(obj);
//		   MyThread2 t2= new MyThread2(obj);
//		   t1.start();
//		   t2.start();
//		   
//	   }
//   }
