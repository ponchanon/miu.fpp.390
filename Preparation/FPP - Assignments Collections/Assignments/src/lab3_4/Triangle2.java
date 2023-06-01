package lab3_4;

public final class Triangle2 implements GeometricShapes {
	//final instance variables must be initialized during declaration or 
	//inside a constructor - otherwise it's a compile error
	private final double base;
	private final double height;
	private final double side1;
	private final double side2;
	private final double side3;
	
	public Triangle2(double base, double height) {
		this.base = base;
		this.height = height;
		this.side1 = base;
		this.side2 = height;
		this.side3 = Math.sqrt((base * base) + (height * height));
		
	}
	
	public Triangle2(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		//getting the biggest side and assigning to base
		this.base = (side1 > side2 && side1 > side3)? side1 : (side2 > side3)? side2 : side3;
		this.height = (2 * area) / base;;
	}
	
	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double computeArea() {
		return (0.5 * base * height);
	}

}
