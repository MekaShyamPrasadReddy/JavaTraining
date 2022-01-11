package Javatraining;

public class Employee {
	public int empID;
	public String empName;
	public double empSal;
	
	

	public Employee(int empID, String empName, double empSal) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSal = empSal;
	}
		
	
	public double SalCal(int empSal){
		double hra=0.20*empSal;
		double da=0.90*empSal;
		double totalsal=empSal+hra+da;
		 return totalsal;
		
		
		
	}
	public void display() {
		System.out.println(empID);
		System.out.println(empName);
		System.out.println(empSal);
		System.out.println(SalCal(10000));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(21465,"shyam",29000);
		e.empID=21465;
		e.empName="shyam";
		Manager m=new Manager(21345,"prasad",40000);
		Developer d=new Developer(4532,"raj",25000);
		e.display();
		e.SalCal(29000);
		m.display();
		m.SalCal(28000);
		d.display();
		d.SalCal(10000);

	}

}
