package javacodes.designpatterns.behavioural.nullobject;

public class NullCustomer extends AbstractCustomer{

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String get() {
		return "The customer does not exist...";
	}

}
