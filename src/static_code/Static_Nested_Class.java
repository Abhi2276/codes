package static_code;

public class Static_Nested_Class {
	
	private static String s="Abhishek";
	
	 static class NestedStaticClass
	 {
		 public void display()
		 {
			 System.out.println("s"+" "+s);
		 }
	 }
	 
	 public static void main(String[] args)
	 {
		 Static_Nested_Class.NestedStaticClass obj=new Static_Nested_Class.NestedStaticClass();
		 
		obj.display();
		 
	 }

}
