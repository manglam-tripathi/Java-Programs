//Problem: Print the span of Array
//Span of array is the difference between maximum and minimum number

import java.util.Arrays;
import java.util.Scanner;
public class SpanOfArray  {
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
		int max=arr[0];
		int min=arr[0];
		for(int element: arr) {
			if(element>max) {
				max=element;
			}
			if(element<min) {
				min=element;
			}
		}
		System.out.println(" Max and min are "+max+" and "+min);
		System.out.println("Span of Array is "+(max-min));
		
	}

}
