package cloning;

public class Employee_Cloning implements Cloneable {

	private int id;
	private  String name;
	private int age;
	private String email;
	private String password;
	
	private Address_cloning address_cloning;

	public Employee_Cloning(int id, String name, int age, String email, String password,
			Address_cloning address_cloning) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.address_cloning = address_cloning;
	}

	public Employee_Cloning() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address_cloning getAddress_cloning() {
		return address_cloning;
	}

	public void setAddress_cloning(Address_cloning address_cloning) {
		this.address_cloning = address_cloning;
	}

	// for deep cloning...
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		 Employee_Cloning employee_Cloning=(Employee_Cloning)super.clone();
		 employee_Cloning.setAddress_cloning(new Address_cloning(getAddress_cloning().getId(),getAddress_cloning().getAddressLine1(),getAddress_cloning().getAddressLinme2(),getAddress_cloning().getCity(),getAddress_cloning().getZipcode()));
		 return employee_Cloning;
	}
	
	//for shallow cloning
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}

	@Override
	public String toString() {
		return "Employee_Cloning [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", password="
				+ password + ", address_cloning=" + address_cloning + "]";
	}
	
	
}
