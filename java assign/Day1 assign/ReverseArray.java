package Javatraining;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		System.out.println(" Elements of an array elements:");
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+"");
		}
		System.out.println("reverse of an array elements:");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]+"");
		}

	}

}
