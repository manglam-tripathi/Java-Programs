import java.util.*;
import java.io.*;
public class DuplicateBracket {
	
	//Creating a function named duplicate in which whole String can be passed for checking
	public static void duplicate(String s) {
		
		//Using Stack data structure
		Stack<Character> stk=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);//Taking out each character from the String
			
//			Main algo behind is it the we will push the character until'(' or any character 
//			is there but as we reach to  ')' we will start pop until next ( bracket reached
//			If Between ) and ( in stack there is nothing then duplicacy is there 
//					means if we are directly reaching ( while popping then we have to 
//					return true
			if(ch==')') {
				if(stk.peek()=='(') {
					System.out.println(true);
					return;//as we directly reached ( bracket without any popping.
				}else {
					while(stk.peek() != '(') {
					//Used while because we have to do something until something reached
						stk.pop();
					}
					stk.pop();
				}	
			}else {
				stk.push(ch);
			}
		}
		System.out.println(false);
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String to be checked for duplicacy ");
		String s=scn.nextLine();
		duplicate(s);	
	}
}
