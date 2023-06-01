package lab9_2_symbolbalance;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer2 {
	static final int OPENING = 0;
	static final int CLOSING = 1;
	
	String ODD_DELIMITER = ""+(char)0;
	String filename;
	String text;
	Stack<Character> symbols;
	char[] left;
	char[] right;
	public SymbolBalancer2(String filename) {
		this.filename = filename;
		readFile();
	}
	public void setText(String text) {
		this.text = text;
	}
	
	boolean symbolsBalanced(String delimiters){
		symbols = new Stack<Character>();
		splitDelimiters(delimiters.toCharArray());
		
		for(int i=0; i< text.length(); ++i) {
			char ch = text.charAt(i);
			if(delimType(ch) == OPENING) {
				symbols.push(ch);
			}
			if(delimType(ch) == CLOSING) {
				if(symbols.isEmpty())
					return false;
				
				char top = symbols.pop();
				if(!delimMatcher(ch, top))
					return false;
			}
		}
		return symbols.isEmpty();
	}
	
	boolean delimMatcher(char close, char open) {
		int leftIndex =0;
		int rightIndex =0;
		
		for(char c : left) {
			if(c == open)
				break;
			leftIndex++;
		}
		for(char c : right) {
			if(c == close)
				break;
			rightIndex++;
		}
		
		return leftIndex == rightIndex;
	}
	
	int delimType(char ch) {
		for(char c : left) {
			if(c == ch)
				return OPENING;
		}
		
		for(char c : right) {
			if(c == ch)
				return CLOSING;
		}
		return -1;
	}
	
	void splitDelimiters(char[] delims) {
		left = new char[delims.length/2];
		right = new char[delims.length/2];
		int j=0;
		int k=0;
		for(int i=0; i < delims.length; i++) {
			if(i %2 == 0)
				left[j++] = delims[i];
			else
				right[k++] = delims[i];
		}
	}

	public static void main(String[] args) {
		SymbolBalancer2 sb = new SymbolBalancer2("lab9_2_symbolbalance//Employee.java");
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



