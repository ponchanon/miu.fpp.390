package lab2_4;

public class Prog4 {

	public static void main(String[] args) {
		String myString = Data.records;
		
		String[] rows = myString.split(":");
		
		for(String data : rows) {
			
			String[] columns = data.split(",");
			System.out.println(columns[0]);
		}
	}

}
