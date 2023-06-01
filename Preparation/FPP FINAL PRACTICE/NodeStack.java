package f_practice;

public class NodeStack {

	private Node topNode = null;

	public void push(String val){
		
		if (topNode != null){
			Node nNode = new Node(val, topNode);
			topNode = nNode;
		}
		
	}

	public String peek(){
		
		if (topNode != null)
		{
			return topNode.data;
		}
		else{
			return null;
		}
		
	}

	public String pop(){
		
		if (topNode != null){
			String st = peek();
			topNode = topNode.next;

			return st;
		}
		else{
			return null;
		}
		
	}

	class Node {
		private String data;
		private Node next;
		Node(String data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
}