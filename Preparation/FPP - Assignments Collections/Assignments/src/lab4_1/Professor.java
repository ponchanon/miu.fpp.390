package lab4_1;


public class Professor extends DeptEmployee {
	private int numberOfPublications;
	
	
	public Professor(String name, double salary, int year, int month, int dayOfMonth, int numberOfPublications) {
		super(name, salary, year, month, dayOfMonth);
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
}
