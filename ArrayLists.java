//ArrayList is part of collection framework providing us dynamic arrays.
//Problems with Array:- 1)Contiguous memory allocation 2)Fixed Size Array
//These all problems are overcomed with the use of arraylilst.
//Methods in ArrayList are:- 1)Addition 2) get 3) modify 4) delete/Remove 5) Iterate 6)Sort
import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
	 public static void main(String[] args) {
		 //Initialisation 
		 ArrayList<Integer> list=new ArrayList<Integer>();
		 ArrayList<String> list2=new ArrayList<String>();
		 ArrayList<Boolean> list3=new ArrayList<>();
		 
		 //Add Elements
		 list.add(0);
		 list.add(4);
		 list.add(5);
		 
		 //Print the ArrayList
		 System.out.println(list);
		 
		 //Get Elements
		 int element=list.get(0);
		 System.out.println(element);
		 
		 //Add Elements in between
		 list.add(1,8);
		            //list_name.add(index_to_add,Value_to_add);
		 System.out.println(list);
		 
		 //Set Element:Replaces the element at the specified position in this list withthe specified element.
		 list.set(0,5);
		            //list_name.set(index,integer);
		 System.out.println(list);
		 
		 //Delete Element
		 list.remove(3);
		 System.out.println(list);
		 
		 //Size
		 int size=list.size();
		 System.out.println(size);
		 
		 //Loops
		 for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i));
		 }
		 
		 //Sorting
		 Collections.sort(list);
		 System.out.println(list);
		 
	 }

}
