package Javatraining;

public class Manager extends Employee {
	
	double MgrSal;
	public Manager(int empID, String empName, double empSal) {
		super(empID, empName, empSal);
	}
		
		
	
	public double SalCal(int MgrSal){
		double hra=0.20*MgrSal;
		double da=0.90*MgrSal;
		double totalsal=MgrSal+hra+da;
		 return totalsal;
	}
	
	
	
	
	
}