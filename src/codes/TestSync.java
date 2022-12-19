package codes;

public class TestSync {
	public static void main(String[] args)
	   {
		   ThreadDemo obj=new ThreadDemo();
		   MyThread1 t1= new MyThread1(obj);
		   MyThread2 t2= new MyThread2(obj);
		   t1.start();
		   t2.start();
		   
	   }
}
