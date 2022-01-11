package Javatraining;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		int sum=0;
		int i;
		for(i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of array elements is:"+ sum);

	}

}
