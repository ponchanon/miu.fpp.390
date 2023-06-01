package lab9_1_stringstack;

public class MyStringStack {
	private MyStringLinkedList list;
	public MyStringStack() {
		list = new MyStringLinkedList();
	}
	
	public String pop() {
		String ret = peek();
		if (peek() == null)
			return "Cannot pop. Stack is Empty";
		else {
			list.remove(0);
			return ret;
		}
	}
	public String peek() {
		if (list.get(0) == null)
			return null;
		else
			return list.get(0);
	}
	
	public void push(String s) {
		if(s == null)
			return;
		else
			list.add(s);
	}
	
	public static void main(String[] args) {
		MyStringStack stack = new MyStringStack();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		System.out.println("Popping…"+stack.pop());
		System.out.println("Peeking…."+stack.peek());
		System.out.println("Popping…"+stack.pop());
	}
}
