package lab9_3_queueusingarray;

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int size = 0;
	private int front = 0;
	private int rear = 0;
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int peek() {
		if(isEmpty()) throw new IllegalStateException("Cannot peek because Queue is empty!");
		
		return arr[front];
	}
	
	public int size() {
		return size;
	}
	
	public void enqueue(int n) {
		if(rear == arr.length)
			resize();
		arr[rear++] = n;
		size++;
	}
	
	public int dequeue() {
		if(isEmpty()) throw new IllegalStateException("Cannot dequeue because Queue is empty!");
		
		size--;
		return arr[front++];
	}
	
	public void resize() {
		System.out.println("resizing");
		int len = arr.length;
		int newlen = 2*len;
		int[] temp = new int[newlen];
		System.arraycopy(arr,0,temp,0,len);
		arr = temp;
	}
	
	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		
		//uncomment when ready
		for(int i = 0; i < 15; i ++)
			q.enqueue(i);
		for(int i = 0; i < 14; i ++)
			q.dequeue();
		System.out.println(q.size());
		System.out.println(q.peek());
	}
}

