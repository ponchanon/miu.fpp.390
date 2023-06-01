package lab4_3.employeeinfo;

public class AccountList {
	private final int INITIAL_LENGTH = 2;
	private Account[] strArray; 
	private int size;
	
	public AccountList() {
		strArray = new Account[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(Account s){
		if(size == strArray.length)
			resize();
		strArray[size++] = s;
	}
	
	public Account get(int i){
		if(i < 0 || i >= size)
			return null;
		
		return strArray[i];
	}
	
	public boolean find(Account s){
		for(Account key : strArray) {
			if(key.equals(s))
				return true;
		}
		return false;
	}
	
	public void insert(Account s, int pos){
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
	
	public boolean remove(Account s){
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
		//System.out.println("Resizing...");
		
		Account[] temp = new Account[size * 2];
		System.arraycopy(strArray, 0, temp, 0, size);
		strArray = temp;
	}
	public String toString(){
		int i;
		StringBuilder sb = new StringBuilder();
		for(i = 0; i < size - 1; ++i) {
				sb.append(strArray[i] + ", ");
		}
		sb.append(strArray[size - 1]);
		return "[" +  sb + "]";
	}
	
	public int size() {
		return size;
	}

}
