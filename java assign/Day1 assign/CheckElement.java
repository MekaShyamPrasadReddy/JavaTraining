package Javatraining;

public class CheckElement {
	public static boolean contains(int[] arr, int item) {
	      for (int num : arr) {
	         if (item == num) {
	            return true;
	         }
	      }
	      return false;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1,2,3,4,5};
	      System.out.println(contains(arr, 5));
	      System.out.println(contains(arr, 0));

	}

}
