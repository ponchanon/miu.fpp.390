package lab8_2_doubly_linkedlist;


public class MyStringLinkedList {
	Node header;
	MyStringLinkedList(){
		header = new Node(null,null, null);
	}
	public void addFirst(String item){
		Node n = new Node(header.next,header,item);
		if(header.next != null){
			header.next.previous = n;
		}		
		header.next = n;
		
	}
	
	void addLast(String s) {
		Node newNode = new Node(null, null, s);
		//if header.next == null, set first to be newNode
		if(header.next == null) {
			header.next = newNode;
			newNode.previous = header;
		}
		else { //find last non-null node
			Node last = header.next;
			while(last.next != null) {
				last = last.next;
			}
			//now last is the last non-null node
			last.next = newNode;
			newNode.previous = last;
			
		}		
	}
	
	//inserts a new Node containing data so that its
	//position in the list is now pos
	void insert(String data, int pos) {
		int size = size();
		if(pos < 0 || pos > size) 
			throw new IllegalArgumentException("Illegal position for new node");
		if(pos == 0)
			addFirst(data);
		else if(pos == size) {
			addLast(data);
		}
		else {
			Node newNode = new Node(null, null, data);
			
			//first node will not be null here
			Node temp = header.next;
			int count = 1;
		
			while(count < pos) {
				temp = temp.next;
				count++;
			}
			//insert newNode between temp and temp.next
			Node last = temp.next;
			temp.next = newNode;
			newNode.previous = temp;
			newNode.next = last;
			last.previous = newNode;
		}
	}
	
	//attempts to remove the first Node that contains
	//data; if successful, returns true; otherwise, false.
	boolean remove(String data) {
		if(data == null) return false;
		if(header.next != null && header.next.value.equals(data)){
			//startNode = startNode.node;
			Node firstNode = header.next;
			Node secondNode = firstNode.next;
			header.next = secondNode;
			secondNode.previous = header;
			firstNode.next = null;
			firstNode.previous = null;
			
			return true;
		}
		Node first = header.next;
		Node second = first.next;
		while(second != null) {
			if(data.equals(second.value) && second.next != null) {
				Node temp = second.next;
				first.next = temp;
				temp.previous = first;
				return true;
			}
			else if(data.equals(second.value) && second.next == null) {
				first.next = second.next;
			}
			first = second;
			second = second.next;	
		}
		
		return false;
	}
	
	//recursively attempts to find a String in some Node in the
	//list; returns true if found, false otherwise boolean recurSearch(String data)
	boolean recurSearch(String data) {
		if(data == null) return false;
		if(header.next != null && header.next.value.equals(data)) {
			return true;
		}
		return recurSearch(header.next, data);
	}

	boolean recurSearch(Node start, String data) {
		if(start.next == null)
			return false;
		if(start.next.value.equals(data))
			return true;
		return recurSearch(start.next, data);
	}

	/***************** search method *****************/

//	// search a sorted array
	boolean search(String val) {
		boolean b = recurse(0, size() - 1, val);
		return b;
	}

	boolean recurse(int a, int b, String val) {
		int mid = (a + b) / 2;
		Node temp = header.next;
		int count = 0;
	
		while(count < mid) {
			temp = temp.next;
			count++;
		}
		
		if (temp.value.compareTo(val) == 0)
			return true;
		if (a > b)
			return false;
		if (val.compareTo(temp.value) > 0)
			return recurse(mid + 1, b, val);
		return recurse(a, mid - 1, val);
	}

	/***************** end of search method *****************/

	/***************** sort method *****************/
	public void sort() {
		if (header.next == null)
			return;
		Node temp = header.next;
		if(temp.next == null)
			return;
		while(temp.next != null)
		{
			Node min = minNode(temp);
			swap(temp, min);
			temp = temp.next;
		}
	}

	//void swap(int i, int j) 
	void swap(Node n1, Node n2){
		String temp = n1.value;
		n1.value = n2.value;
		n2.value = temp;

	}

	//find minimum of arr between the indices bottom and top
	public Node minNode(Node n) {
		Node min = n;
		Node temp = n;
		while (temp.next != null) {
			if (min.value.compareTo(temp.next.value) > 0) {
				min = temp.next;
			}
			temp = temp.next;
		}
		return min;
	}

	/***************** end of sort method *****************/

	/** size = the number of non-null nodes */
	int size() {
		if(header.next == null) return 0;
		Node temp = header.next;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;	
	}
	
	void printNodes() {
		Node next = header.next;
		if(next == null) System.out.println("");
		else {
			String s= next.toString();
			System.out.println(s);
		}
	}
	
	class Node {
		String value;
		Node next;
		Node previous;
		Node(Node next, Node previous, String value){
			this.next = next;
			this.previous = previous;
			this.value = value;
		}
		@Override
		public String toString() {
		    if(value == null) return "";
			StringBuilder sb = new StringBuilder(value + " ");
			sb = toString(sb, next);
			return sb.toString();
		}
		private StringBuilder toString(StringBuilder sb, Node n) {
			if(n == null) return sb;
			sb.append(n.value + " ");
			return toString(sb, n.next);
		}
	}
	
	public static void main(String[] args) {
		MyStringLinkedList l = new MyStringLinkedList();
		l.addLast("big");
		l.addLast("small");
		l.addLast("tall");
		l.addLast("short");
		l.addLast("square");
		l.addLast("round");
		l.addLast("enormous");
		l.addLast("tiny");
		l.addLast("gargantuan");
		l.addLast("lilliputian");
		l.addLast("numberless");
		l.addLast("none");
		l.addLast("vase");
		l.addLast("miniscule");
		System.out.println("Before sort:");
		l.printNodes();
		System.out.println("After sort:");
		l.sort();
		l.printNodes();
		
		System.out.println(l.search("number"));
		System.out.println(l.search("tiny"));
		
		
		System.out.println(l.remove("big"));
		l.printNodes();
		System.out.println(l.recurSearch("none"));
		System.out.println(l.recurSearch("None"));
	}
}


