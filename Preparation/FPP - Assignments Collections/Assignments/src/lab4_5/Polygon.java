package lab4_5;

public interface Polygon {
	
	//returns in an array all sides of the polygon
	//example: For a rectangle, return would be [width, width,
	// length, length]
	public double[] getArrayOfSides();
	
	//returns the sum of the values in arr
	static double sum(double[] arr) {
		double sumOfSides = 0;
		for(double side : arr) {
			sumOfSides += side;
		}
		return sumOfSides;
	}
	
	//returns the perimeter of the polygon
	default double computePerimeter() {
		return sum(getArrayOfSides());
	}
	
	
}
