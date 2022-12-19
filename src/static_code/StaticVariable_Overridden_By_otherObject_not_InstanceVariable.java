package static_code;

public class StaticVariable_Overridden_By_otherObject_not_InstanceVariable {
	
	static int var1=88;
	String var2;
	public static void main(String[] args)
	{
		StaticVariable_Overridden_By_otherObject_not_InstanceVariable obj1=new StaticVariable_Overridden_By_otherObject_not_InstanceVariable();
		StaticVariable_Overridden_By_otherObject_not_InstanceVariable obj2= new StaticVariable_Overridden_By_otherObject_not_InstanceVariable();
		
		obj1.var1=90;
		obj1.var2="Object1";
		
		obj2.var1=100;
		obj2.var2="Object2";
		
		System.out.println(obj1.var1);
		System.out.println(obj1.var2);
		System.out.println(obj2.var1);
		System.out.println(obj2.var2);
		
	}

}
