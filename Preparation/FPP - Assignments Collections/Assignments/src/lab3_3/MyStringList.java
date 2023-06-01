package lab3_3;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(String s){
		if(size == strArray.length)
			resize();
		strArray[size++] = s;
	}
	
	public String get(int i){
		if(i < 0 || i >= size)
			return null;
		
		return strArray[i];
	}
	
	public boolean find(String s){
		for(String key : strArray) {
			if(key.equals(s))
				return true;
		}
		return false;
	}
	
	public void insert(String s, int pos){
		if(size == strArray.length) {
			resize();
		}
		
		if(size == pos) {
			add(s);
		}
		else {
			System.arraycopy(strArray, pos, strArray, pos + 1, size+1);
			strArray[pos] = s;
			++size;
		}
	}
	
	public boolean remove(String s){
		if(size == 0)
			return false;
		//last element is still being duplicated when shifting
		//should be handled
		for(int i = 0 ; i < size; i++) {
			if(strArray[i].equals(s)) {
				System.arraycopy(strArray, i+1, strArray, i, size - 1);
				//set duplicate last element to null and decrement size by 1
				strArray[--size] = null;
				return true;
			}
		}
		return false;
	}
	
	
	private void resize(){
		System.out.println("Resizing...");
		
		String[] temp = new String[size * 2];
		System.arraycopy(strArray, 0, temp, 0, size);
		strArray = temp;
	}
	public String toString(){
		int i;
		StringBuilder sb = new StringBuilder();
		for(i = 0; i < size - 1; ++i) {
				sb.append(strArray[i] + ", ");
		}
		sb.append(strArray[size -1]);
		return "[" +  sb + "]";
	}
	public int size() {
		return size;
	}

	public static void main(String[] args){
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.insert("Richard",3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert("Tonya",0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);		
	}

}
