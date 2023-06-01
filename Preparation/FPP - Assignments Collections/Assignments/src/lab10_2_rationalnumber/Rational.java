package lab10_2_rationalnumber;

public class Rational {

	private int numerator;
	private int denominator;
	
	
	
	public Rational(int numerator, int denominator) {
		if(denominator <= 0)
			throw new IllegalArgumentException("Denominator cannot be less than or equal to zero");
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	//adds the rational rat to this Rational
	public Rational add(Rational rat) {
		int gcf = getGCF(denominator, rat.denominator);
		int result = (gcf/denominator*numerator) + (gcf/rat.denominator*rat.numerator);
		
		return simplified(result, gcf);
		
	}
	
	//multiplies rat by this Rational
	public Rational multiply(Rational rat) {
		int numr = numerator * rat.numerator;
		int denom = denominator * rat.denominator;
		
		return simplified(numr, denom);
	}
	
	public Rational simplified(int n, int d) {
		int smaller = (n < d)? n:d;
		int lcm = 1;
		for(int i=1; i<=smaller; i++) {
			if(n % i == 0 && d % i ==0)
				lcm = i;
		}
		
		return new Rational(n/lcm, d/lcm);
	}
	
	public int getGCF(int n, int d) {
		int larger = (n > d)? n:d;
		int gcf = 1;
		for(int i=1; i<=larger; i++) {
			if(i % n == 0 && i % d ==0)
				gcf = i;
		}
		if(gcf == 1)
			return n*d;
		
		return gcf;
	}
	
	//returns –1 if this rational is less than rat
	//returns 0 if this rational equals (see equals
	// method discussion below) rat
	//returns 1 if this rational is greater than rat
	public int compareTo(Rational rat) {
		int res1 = numerator * rat.denominator;
		int res2 = denominator * rat.numerator;
		
		if(res1 == res2)
			return 0;
		else if(res1 < res2)
			return -1;
		else
			return 1;
	}
	
	@Override
	
	public String toString() {
		if(numerator == denominator || denominator == 1)
			return "" + (numerator/denominator);
		
		return numerator + "/" + denominator;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + denominator;
		result = prime * result + numerator;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rational other = (Rational) obj;
//		if (denominator != other.denominator)
//			return false;
//		if (numerator != other.numerator)
//			return false;
		if(!((numerator * other.denominator) == (denominator * other.numerator)))
			return false;
		return true;
	}
	public static void main(String[] args) {
		Rational r1 = new Rational(2,3);
		Rational r2 = new Rational(-17,5);
		Rational r3 = new Rational(1,3);
		Rational r4 = r1.multiply(r2).add(r3);
		Rational r5 = r1.multiply(r2.add(r3));
		int compare = r4.compareTo(r5);
		
		if(compare == 0)
			System.out.println("(2/3 * -17/5) + 1/3 is equal to 2/3 * (-17/5 + 1/3)");
		else if(compare > 0)
			System.out.println("(2/3 * -17/5) + 1/3 is greater than 2/3 * (-17/5 + 1/3)");
		else
			System.out.println("(2/3 * -17/5) + 1/3 is less than 2/3 * (-17/5 + 1/3)");

	

	}

}
