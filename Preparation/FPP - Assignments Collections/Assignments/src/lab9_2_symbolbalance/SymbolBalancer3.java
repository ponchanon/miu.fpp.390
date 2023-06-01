package lab9_2_symbolbalance;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer3 {
	String ODD_DELIMITER = ""+(char)0;
	String filename;
	String text;
	Stack<Character> symbols;
	public SymbolBalancer3(String filename) {
		this.filename = filename;
		readFile();
	}
	public void setText(String text) {
		this.text = text;
	}
	
	boolean symbolsBalanced(String delimiters){
		symbols = new Stack<Character>();
		
		for(int i=0; i< text.length(); ++i) {
			char ch = text.charAt(i);
			if(delimiters.indexOf(ch) % 2 == 0){
				symbols.push(ch);
			}
			if(delimiters.indexOf(ch) % 2 == 1) {
				if(symbols.isEmpty())
					return false;
				
				char top = symbols.pop();
				if(top=='[' && ch==']' || top=='{' && ch=='}' || top=='<' && ch=='>' || top=='(' && ch==')') 
					continue;
				else
					return false;
			}
		}
		return symbols.isEmpty();
	}

	public static void main(String[] args) {
		SymbolBalancer3 sb = new SymbolBalancer3("lab9_2_symbolbalance//Employee.java");
		System.out.println(sb.symbolsBalanced("[]{}<>()||"));
	}
	void readFile() {
		String prefix = System.getProperty("user.dir") + "//src//";
		try {
			Scanner sc = new Scanner(new File(prefix + filename));
			//gets the next "token", which happens to be
			//all of the text in the file (because of the odd delimiter)
			sc.useDelimiter(ODD_DELIMITER);
			text = sc.next();
			System.out.println(text);
			sc.close();
		}
		catch(FileNotFoundException ex) {
			System.err.println("File Not Found Exception "+ex.getMessage());
		}
	}
	
}



