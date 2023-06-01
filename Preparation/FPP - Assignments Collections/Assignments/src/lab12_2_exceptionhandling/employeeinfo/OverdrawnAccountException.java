package lab12_2_exceptionhandling.employeeinfo;

public class OverdrawnAccountException extends Exception {

	public OverdrawnAccountException() {
		super();
	}
	
	public OverdrawnAccountException(String msg) {
		super(msg);
	}
	
	public OverdrawnAccountException(Throwable t) {
		super(t);
	}
}
