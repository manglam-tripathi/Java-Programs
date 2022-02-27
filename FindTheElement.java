import java.util.*;
public class FindTheElement {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=scn.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the numbers in array");
		for(int i=0;i<size;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println("The Array is: "+ Arrays.toString(arr));
		System.out.println("Enter the number to be found");
		int found=scn.nextInt();
		int check=0;
		for(int element:arr) {
			if(element==found) {
				check=1;
			} 
		}
		if(check==0) {
			System.out.println("Element Not found");
		}else {
			System.out.println("Element found");
		}
		
	}

}
