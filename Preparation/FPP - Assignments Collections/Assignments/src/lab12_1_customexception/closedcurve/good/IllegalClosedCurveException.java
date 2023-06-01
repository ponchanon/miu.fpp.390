package lab12_1_customexception.closedcurve.good;

public class IllegalClosedCurveException extends Exception {
	
	public IllegalClosedCurveException() {
		super();
	}
	public IllegalClosedCurveException(String msg) {
		super(msg);
	}
	public IllegalClosedCurveException(Throwable t) {
		super(t);
	}

}
