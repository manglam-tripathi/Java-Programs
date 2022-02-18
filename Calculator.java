import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int ans=0;
		while(true) {
			System.out.println("Enter the operator ");
			char op=scn.next().trim().charAt(0);
			if(op=='+'||op=='-'||op=='*'||op=='/') {
				System.out.println("Enter the numbers :");
				int num1=scn.nextInt();
				int num2=scn.nextInt();
				if(op=='+')
					ans=num1+num2;
				if(op=='-')
					ans=num1-num2;
				if(op=='*')
					ans=num1*num2;
				if(op=='/')
					ans=num1/num2;
				System.out.println("Your answer is");
				System.out.println(ans);
			}
			else if(op=='x'||op=='X')
				break;
			else
				System.out.println("Invalid Input");
		}
	}

}
