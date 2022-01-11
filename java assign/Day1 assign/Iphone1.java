package Javatraining;

public class Iphone1 {
	int memory;
	
	void cost() {
		if(memory==32) {
			System.out.println("Price is 25000");
		}
		else if(memory==64) {
			System.out.println("Price is 35000");
		}
		else if(memory==128) {
			System.out.println("Price is 50000");
		}
		else if(memory==256) {
			System.out.println("Price is 70000");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone1 ph=new Iphone1();
		ph.memory=256;
		ph.cost();

	}

}
