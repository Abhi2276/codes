package static_code;

public class Static_variable_sharing_forObject {
	
	int roll;
	String name;
	static String college="Lnct";
	public Static_variable_sharing_forObject(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	public void display()
	{
		System.out.println(roll+" "+name+" "+college);
	}
	
	

}
