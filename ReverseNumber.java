import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int reverse=0;
		while(n>0) {
			int rem=n%10;
			n/=10;
			reverse=reverse*10+rem;
		}
		System.out.println(reverse);
		
}
}