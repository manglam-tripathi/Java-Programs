import java.util.*;

public class BalancingBrackets {
//	Program Algorithm: Get the String as input
	
//	Take out each character of it and take into consideration only the brackets and
//	ignore other things
//	If its a opening bracket push the bracket into the stack
//	
//	If its a closing bracket then 
//			1)check if the size of stack is zero , If its zero then we have extra 
//				closing bracket and we will return false
//			2)check if the top value of the stack is not equal to corresponding bracket
//				then return false
//			3)If its not in above two cases means we are getting the corresponding bracket 
//				then we will pop it
	
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		String s=scn.nextLine();
		Stack<Character> stk=new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='(' ||ch=='{' ||ch=='[') {
				stk.push(ch);
				System.out.println(stk +" Stack Size "+stk.size());
				
			}
			else if(ch==')'){
				if(stk.size()==0 || stk.peek()!='(') {
					System.out.println(false);
					return;
				}else {
					stk.pop();
					System.out.println(stk +" Stack Size "+stk.size());
				}
				
			}
			else if(ch=='}') {
				if(stk.size()==0 || stk.peek()!='{') {
					System.out.println(false);
					return;
				}else {
					stk.pop();
					System.out.println(stk +" Stack Size "+stk.size());
				}
				
			}
			else if(ch==']') {
				if(stk.size()==0 || stk.peek()!='[') {
					System.out.println(false);
					return;
				}else {
					stk.pop();
					System.out.println(stk +" Stack Size "+stk.size());
				}
				
			}else {
				//do nothing
			}
		}
		if(stk.size()==0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}
//	[(a + b) + {(c + d) * (e / f)}]  true
//	([(a + b) + {(c + d) * (e / f)}] false

//		[(a + b) + {(c + d) * (e / f)}]
//		[[] Stack Size 1
//		[[, (] Stack Size 2
//		[[] Stack Size 1
//		[[, {] Stack Size 2
//		[[, {, (] Stack Size 3
//		[[, {] Stack Size 2
//		[[, {, (] Stack Size 3
//		[[, {] Stack Size 2
//		[[] Stack Size 1
//		[] Stack Size 0
//		true
