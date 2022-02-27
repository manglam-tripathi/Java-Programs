import java.util.*;
public class RandomNumber {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int number;
		int random=(int)(Math.random()*100);
		System.out.println(random);
		
		do {
			System.out.println("Enter a number to be guessed");
			number=scn.nextInt();
			if(number>random) {
				System.out.println("Too high,Try again");
				
			}
			else if(number<random) {
				System.out.println("Too low,Try again");
			}
			else {
				System.out.println("Correct ");
			}
		}while(random!=number);
		
		
		

	}

}
