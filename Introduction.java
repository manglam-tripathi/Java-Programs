import java.util.*;
public class Introduction {
	
	public static void main(String[] args) {
		//To take input
//		Scanner class which we use to take input and it is in the java.util library.
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your age");
		int personAge1=scn.nextInt();
		
		
		
		
		//Conditional Statement example
		if(personAge1<18 ) {
			System.out.println("You are not eligible to vote.");
		}
		else if(personAge1>=18 && personAge1<21) {
			System.out.println("You are eligible to vote but not marriage (wait bro) ");
		}
		else if(personAge1>=21) {
			System.out.println("You are eligible for marriage");
		}
		else {
			System.out.println("You are not eligible to vote nor marriage");
		}
		
		
		//How to print the statement
//		System.out.println("Hello world");
//		System.out.print("Hello world");
		 
//		int personAge1=22; //This is the age of Gaurav
//		int personAge2=21;
//		System.out.println("Gaurav age is "+personAge1);
//		System.out.println("Manglam age is "+personAge2);
		
		
		
	
		
		
		
	}

}
