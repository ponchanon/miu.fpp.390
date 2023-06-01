package midterm.prob1_new;

public class Driver {
	
	public static void main(String[] args) {
		Figure[] objArr = {new HatMaker(),
							new HatMaker(),
							new VeeMaker(),
							new ParallelMaker(),
							new FaceMaker()};		
		
		new Driver(objArr);
	}
	
	public Driver(Figure[] figures){
		final String SPACE = " ";
		
		for(Figure f : figures){
			System.out.print(f.getFigure()+SPACE);
		}
	}

}
