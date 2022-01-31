import java.util.Stack;
public class Stack1 {
	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<>();
		stk.push(7);
		stk.push(5);
		System.out.println(stk+"-> Peek "+stk.peek()+" Stack Size "+stk.size());
		stk.push(7);
		System.out.println(stk+"-> Peek "+stk.peek()+" Stack Size "+stk.size());
		stk.pop();
		System.out.println(stk+"-> Peek "+stk.peek()+" Stack Size "+stk.size());
		stk.push(9);
		stk.push(5);
		System.out.println(stk+"-> Peek "+stk.peek()+" Stack Size "+stk.size());
		stk.push(7);
		System.out.println(stk+"-> Peek "+stk.peek()+" Stack Size "+stk.size());
		stk.pop();
		stk.pop();
		stk.pop();
		stk.pop();
		System.out.println(stk+"-> Peek "+stk.peek()+" Stack Size "+stk.size());
		stk.pop();
		System.out.println(stk+"-> Stack Size "+stk.size());
		
	}
}
