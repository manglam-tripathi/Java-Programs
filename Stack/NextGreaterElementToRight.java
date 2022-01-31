import java.util.*;
public class NextGreaterElementToRight {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		//Take the input of size and array
		System.out.println("Enter the size of array");
		int size=scn.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=scn.nextInt();
		}
		//to print the input array
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//Creating new array in which the nge of each element would be stored
		int[] nge=new int[arr.length];
		
		//We will use stack to reduce time complexity to O(n*n) 
		Stack<Integer> stk=new Stack<>();
		
		//We will start from the end of array and go backwards from that
		
		//Initially we will be pushing the last element nge as -1 as it will 
		//		always be -1 as no one right is greater than it.
		stk.push(arr[arr.length-1]);
		nge[arr.length-1]=-1;
		
		for(int i=arr.length-2;i>=0;i--) {
			//-a+
			//First we pop all the numbers who are smaller than i  
			while(stk.size()>0 && arr[i]>= stk.peek()) {
				stk.pop();
			}
			
			//If stack is empty means no element is greater than it so -1
			if(stk.size()==0) {
				nge[i]=-1;
			}else {
				nge[i]=stk.peek();
			}
			stk.push(arr[i]);
		}
		
		//Printing the final verdict
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+"->"+nge[i]+" ");
		}
		
	}
		
}

