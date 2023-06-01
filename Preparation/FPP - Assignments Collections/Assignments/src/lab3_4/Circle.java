package lab3_4;

public final class Circle implements GeometricShapes {
	private final double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}


	@Override
	public double computeArea() {
		return Math.PI * radius * radius;
	}

}
