package Javatraining;

public class Tester extends Employee{
	double Testsal;
	public Tester(int empID, String empName, double empSal) {
		super(empID, empName, empSal);
		// TODO Auto-generated constructor stub
	}

	public double SalCal(int TestSal){
		double hra=0.20*TestSal;
		double da=0.90*TestSal;
		double totalsal=TestSal+hra+da;
		 return totalsal;
	}
	

}
