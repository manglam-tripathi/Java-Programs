import java.util.*;

public class AlphabetCaseCheck {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		char ch=scn.next().trim().charAt(0);
		//Problem : user will give me a character and I have to tell if its uppercase or lowercase
		if(ch>='a'&& ch<='z') {
			System.out.println("Lowercase");
		}
		else {
			System.out.println("Uppercase");
		}
	}

}
