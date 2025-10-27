package javacodes;

public class Employee {

	Integer id;
	String name;
	String position;
	
	public Employee(Integer id, String name, String position) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + "]";
	}
	
}
