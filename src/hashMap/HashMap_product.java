package hashMap;

public class HashMap_product {
	
	private String product;
	
	private int price;

	public HashMap_product(String product, int price) {
		super();
		this.product = product;
		this.price = price;
	}

	public HashMap_product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "HashMap_product [product=" + product + ", price=" + price + "]";
	}
	

}
