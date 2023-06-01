package lab12_1_customexception.closedcurve.good;

public class Circle extends ClosedCurve {
	double radius;
	public Circle(Double radius)throws IllegalClosedCurveException{
		this(radius.doubleValue());
	}
	public Circle(double radius) throws IllegalClosedCurveException {
		if(radius <= 0)
			throw new IllegalClosedCurveException("An IllegalClosedCurveException was thrown in a Circle instance");
		this.radius = radius;
	}
	double computeArea() {
		return (Math.PI * radius * radius);
	}
}
