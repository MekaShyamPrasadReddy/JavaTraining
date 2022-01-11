package Javatraining;

public class Product {
	int proID;
	String proName;
	int proPrice;
	

	public Product(int proID, String proName, int proPrice) {
		super();
		this.proID = proID;
		this.proName = proName;
		this.proPrice = proPrice;
	}
	// Calculating total price after calculating GST
	public double TotalPrice() {
		if(proPrice>=1000) {
		return proPrice+(1000*0.18);
		}
		else 
			return proPrice;
	}
	public void display() {
		System.out.println("Product id is :"+proID);
		System.out.println("Product Name is :"+proName);
		System.out.println("Product price is :"+proPrice);
		System.out.println("Product price after GST is :"+TotalPrice());
		
		
	}

	public static void main(String[] args) {
		Product p=new Product(111, "perfume", 9999);
		p.display();

	}

}
