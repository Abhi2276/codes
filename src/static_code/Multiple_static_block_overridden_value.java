package static_code;

public class Multiple_static_block_overridden_value {
	
	static int num;
	static String str;
	
	static
	{
		System.out.println("1st static block");
		num=11;
		str="Abhishek";
	}
	
	static
	{
		System.out.println("2nd static block");
		num=15;
		str="jhon";
	}
	
	public static void main(String[] args)
	{
		System.out.println("num is"+  num);
		System.out.println("string"+ str);
	}

}
