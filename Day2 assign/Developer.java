package Javatraining;

public class Developer extends Employee {
	double Devsal;
	public Developer(int empID, String empName, double empSal) {
		super(empID, empName, empSal);
		
	}

	public double SalCal(int DevSal){
		double hra=0.20*DevSal;
		double da=0.90*DevSal;
		double totalsal=DevSal+hra+da;
		 return totalsal;
		
	}
}
