import java.util.*;
public class CountingOccurences {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int f=scn.nextInt();
		int count=0;
		while(n>0) {
			int rem=n%10;
			if (rem==f) {
				count++;
			}
			n=n/10;
		}
		System.out.println(count);
	}

}
