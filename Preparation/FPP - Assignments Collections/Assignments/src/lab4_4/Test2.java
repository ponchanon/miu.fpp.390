package lab4_4;

public class Test2 {
	
	public static void main(String[] args) {

		Polygon[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Rectangle(3,4)};
		//compute perimeter
		for(Polygon cc : objects) {
			System.out.println("For this " + cc.getClass().getSimpleName() + "\n\tNumber of sides = " + cc.getNumberOfSides() + "\n\tPerimeter = " + cc.computePerimeter());
		}
    
	}
}