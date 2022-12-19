package cloning;

public class Address_cloning  implements Cloneable{
	
	 private int id;
	 private String addressLine1;
	 private String addressLinme2;
	 private String city;
	 private int zipcode;
	public Address_cloning(int id, String addressLine1, String addressLinme2, String city, int zipcode) {
		super();
		this.id = id;
		this.addressLine1 = addressLine1;
		this.addressLinme2 = addressLinme2;
		this.city = city;
		this.zipcode = zipcode;
	}
	public Address_cloning() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLinme2() {
		return addressLinme2;
	}
	public void setAddressLinme2(String addressLinme2) {
		this.addressLinme2 = addressLinme2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Address_cloning [id=" + id + ", addressLine1=" + addressLine1 + ", addressLinme2=" + addressLinme2
				+ ", city=" + city + ", zipcode=" + zipcode + "]";
	}

	 
	 
}
