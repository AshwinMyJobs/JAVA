package javacodes.javatechie;

import java.util.List;

public class Student {

	int id;
	String firstName;
	String lastName;
	String gender;
	String dept;
	String city;
	int rank;
	List<String> contacts;
	
	public Student(int id, String firstName,  String lastName, String gender, String dept, String city,
			int rank, List<String> contacts) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dept = dept;
		this.city = city;
		this.rank = rank;
		this.contacts = contacts;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public List<String> getContacts() {
		return contacts;
	}

	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", age=" + ", lastName=" + lastName
				+ ", gender=" + gender + ", dept=" + dept + ", city=" + city + ", rank=" + rank + ", contacts="
				+ contacts + "]";
	}
	
	
}
