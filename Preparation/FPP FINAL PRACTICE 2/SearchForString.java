package f_practice;

public class SearchForString {
	private String[] arr;

	public SearchForString(String[] arr) {
		this.arr = arr;
	}

	public boolean search(String s) {

		return recurSearch(s, arr.length - 1);
	}

	private boolean recurSearch(String s, int uIndex) {

		if (uIndex == 0) {
			return false;
		}

		if (arr[uIndex].equals(s)) {
			return true;
		}

		return recurSearch(s, uIndex - 1);
	}
}
class main{
	public static void main(String[] args) {
		String [] arr = {"sam" , "weldu" , "Arefe"} ;

		SearchForString str = new SearchForString(arr) ;

		System.out.println(str.search("gebre"));

	}
}

