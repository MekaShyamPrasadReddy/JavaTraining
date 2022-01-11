package Javatraining;

public class Shape {
	private double height;  
	   private double width; 
	   private double length;
	   public void setValues(double height, double width,double lenght)
	   {
	      this.height = height;
	      this.width = width;
	     // this.length= length;
	   }
	   public double getHeight() 
	   {
	       return height;
	   }
	   public double getWidth() 
	   {
	       return width;
	   } 
	   public double getLength() 
	   {
	       return length;
	   } 
	   public  double getradius() {
		   return length;
	   }
	   
}
class test
{
public static void main(String[] args)
{
 Shape shape = new Shape();
 Rectangle rect = new Rectangle();
 shape.setValues(8,5,4);
 shape=rect;
 System.out.println("radiu of rectangle : " + shape.getradius());
 Triangle tri = new Triangle();
 shape = tri;
 shape.setValues(4,3,6);
 System.out.println("radiu of triangle : " + shape.getradius());
 Square sq= new Square();
 shape= sq;
 shape.setValues(8,4,6);
 System.out.println("radius of Square : " + shape.getradius());
 
}

}
