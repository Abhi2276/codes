package codes;

public class Emp {
	
	
	//name,age..
 // name of emp who age is max..
	
	private int age;
	private String name;
	public Emp(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [age=" + age + ", name=" + name + "]";
	}
	
}
