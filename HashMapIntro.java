import java.util.*;
public class HashMapIntro {
	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("India", 150);
		hm.put("China", 200);
		hm.put("Usa", 10);
		hm.put("uk", 20);
		hm.put("Pakistan", 50);
		System.out.println(hm);
		
		System.out.println(hm.get("India"));
		hm.put("India", 130);
		System.out.println(hm);
		System.out.println(hm.get("Utopia"));
		
		Set<String> keys=hm.keySet();
		System.out.println(keys);
		
		for(String key:hm.keySet()) {
			Integer val=hm.get(key);
			System.out.println(key+" "+val);
		}
		
	}

}
