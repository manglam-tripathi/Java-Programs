import java.util.*;
public class FibonacciNumber {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a=0;
		int b=1;
		int n=scn.nextInt();
		int count=2;
		while(count<=n) {
			int temp=b;
			b=b+a;
			a=temp;
			count++;
		}
		System.out.println(b);
	}
}
