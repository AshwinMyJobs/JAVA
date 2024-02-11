package javacodes.designpatterns.behavioural.nullobject;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private List<String> customerName;
	
	public Database() {
		this.customerName = new ArrayList<>();
		this.customerName.add("Name1");
		this.customerName.add("Name2");
		this.customerName.add("Name3");
		this.customerName.add("Name4");
		this.customerName.add("Name5");
	}
	
	public boolean exist(String name) {
		for(String customer : customerName)
			if(customer.equals(name))
				return true;
		return false;
	}
}
