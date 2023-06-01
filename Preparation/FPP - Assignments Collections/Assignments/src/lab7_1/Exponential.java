package lab7_1;

public class Exponential {

	double power(double x, int n) {
		if(n == 1)
			return x;
		return x * power(x, n-1);
	}
	public static void main(String[] args) {
		Exponential exp = new Exponential();
		System.out.println(exp.power(2, 10));
		
	}

}
