import java.util.*;
public class Count_Distinct_Elements {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Choose 1 for Naive approach and 2 for optimised approach");
		int choice=scn.nextInt();
		int[] a=new int[]{5,10,15,5,4,5};
		switch(choice) {
		case 1:
			naiveApproach(a);
			break;
		case 2:
			Optimised(a);
			break;
		default:
			System.out.println("Chutiya ho tum");
		}
	}
	public static void naiveApproach(int a[]) {
		int count=1;
		for(int i=1;i<a.length;i++) {
			int j=0;
			for(j=0;j<i;j++) {
				if(a[i]==a[j])
					break;
			
			}
			if(i==j)
				count++;
		}
		System.out.println(count);
		
	}
	public static void Optimised(int a[]) {
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		System.out.println(set.size());
	}

} 
