import java.util.*;
public class MultiDimensionalArray {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[][] arr= {{1,2,3},{2,4,5},{2,4},{1,2,3,4,5,3,4}};
		
		
//		System.out.println("Enter the array : ");
//		 
//		 for(int row=0;row<arr.length;row++) {
//			 for(int col=0;col<arr[row].length;col++) {
//				 arr[row][col]=scn.nextInt();
//			 }
//			 System.out.println();
//		 }
		 
		 for(int[] a:arr) {
			 System.out.println(Arrays.toString(a));
		 }
	}

}
