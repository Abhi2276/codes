//cloning- creating exact copy of object
// shallow cloning- any change in cloned object will also effect original object(referenced data /object) except primitive data type
// so go for deep cloning.
//deep cloning- any change in clone object(mutable/referenced data type) will not effect in original object 
// If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.

//The clone() method is defined in the Object class.
package cloning;

public class Cloning_Shallow {
	
	public static void main(String [] args) throws CloneNotSupportedException
	{
		Address_cloning ac= new Address_cloning(112,"tata"," btm","delhi",560064);
		Employee_Cloning ec1= new Employee_Cloning(111,"Abhi",25,"abhi@gmail","abhi123",ac);
		System.out.println("orignal object");
		System.out.println(ec1);
		
		Employee_Cloning ec2=(Employee_Cloning) ec1.clone();
		System.out.println("clone object");
		System.out.println(ec2);
		
		//changing value of clone object..  primitive data type will not get changed in original object
		ec2.setEmail("pratap@gmail");
		ec2.setAge(43);
		
		System.out.println("shallow cloning  if we change clone object(reference data) it will change original object");
		ec2.getAddress_cloning().setCity("bangalore");
		
		
		System.out.println("orignal object");
		System.out.println(ec1);
		
		System.out.println("clone object");
		System.out.println(ec2);
		
		
		
		
	}
	

}
