
public class StackImplementationArray {
	int[] a;
	int top;
	int capacity;
	public StackImplementationArray(int capacity) {
		System.out.println("Stack has been Created");
		this.capacity=capacity;
		this.a=new int[capacity];
		this.top=-1;
	}
	public void push(int data) {
		if(top==capacity-1) {
			System.out.println("Overflow situation in stack");
		}
		else {
			top++;
			a[top]=data;
			System.out.println("The element pushed is"+a[top]);
		}
	}
	public int pop() {
		if(top==-1) {
			System.out.println("Underflow Situation has occured");
			return -1;
		}
		else {
			System.out.println("The element popped  is"+a[top]);
			int res=a[top];
			top--;
			return res;
			
		}	
	}
	public int peek() {
		return a[top];
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public void size() {
		System.out.println("The size of stack is "+(top+1));
	}
	public static void main(String[] args) {
		int size=5;
		StackImplementationArray s1=new StackImplementationArray(size);
		s1.push(8);
		s1.push(0);
		s1.push(5);
		s1.push(5);
		s1.push(5);
		s1.push(3);
		s1.size();
		s1.pop();
		s1.isEmpty();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.size();
		s1.pop();
		s1.pop();
		s1.isEmpty();	
		
	}

}
