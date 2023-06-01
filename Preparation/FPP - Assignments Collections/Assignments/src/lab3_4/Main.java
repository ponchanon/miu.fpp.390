package lab3_4;

public class Main {

	public static void main(String[] args) {
		GeometricShapes triangle = new Triangle(3, 4);
		GeometricShapes triangle1 = new Triangle(3, 4, 5);
		GeometricShapes rectangle = new Rectangle(7, 3);
		GeometricShapes circle = new Circle(7);
		
		System.out.println("Area of Triangle is " + triangle.computeArea());
		System.out.println("Area of Triangle is " + triangle1.computeArea());
		System.out.println("Area of Rectangle is " + rectangle.computeArea());
		System.out.println("Area of Circle is " + circle.computeArea());
	}

}
