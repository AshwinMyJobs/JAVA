package javacodes.designpatterns.behavioural.nullobject;

public class RealCustomer extends AbstractCustomer {
	
	private String customerName;
	
	public RealCustomer(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public boolean isNull() {
		return false;
	}

	@Override
	public String get() {
		return this.customerName;
	}
}
