import java.util.*;
public class LargestNumber {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
//		int max=a;
//		if(b>max)
//			max=b;
//		if(c>max)
//			max=c;
//		System.out.println(max);
		System.out.println(Math.max(Math.max(a,b),c));
	}
}
