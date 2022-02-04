import java.util.*;
public class HashSetIntro {
	public static void main(String[] args) {
		//Initialise the HashSet
		HashSet<Integer> s=new HashSet<>();
		
		//Adding some values
		s.add(5);
		s.add(10);
		s.add(10);//It does not add another 10 as every element is unique in HashSet.
		System.out.println(s);
		
		//Check if it contains the particular integer
		if(s.contains(10)) System.out.println("Good");
		else System.out.println("Bad");
		
		
		s.add(2);
		System.out.println(s);
		
		//To remove something
		s.remove(10);
		System.out.println(s);
		
		//To check if its empty
		System.out.println(s.isEmpty());
		
		//To check for its size
		System.out.println(s.size());
		s.clear();
		System.out.println(s.isEmpty());
		
	}

}
