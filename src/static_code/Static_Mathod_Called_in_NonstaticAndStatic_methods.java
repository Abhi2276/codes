package static_code;

public class Static_Mathod_Called_in_NonstaticAndStatic_methods {
	
	static int i=10;
	static String s="Abhishek";
	
	static void display()
	{
		System.out.println("i" + i);
		System.out.println("s" +s);
	}

	void nonstatic()
	{
		display();
	}
	
	public static void main(String[] args)
	{
		Static_Mathod_Called_in_NonstaticAndStatic_methods obj=new Static_Mathod_Called_in_NonstaticAndStatic_methods();
		obj.nonstatic();
		display();
	}
}
