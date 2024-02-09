package javacodes.designpatterns.behavioural.iterator;

public class NamesRepository {

	String[] namesString = {"Name1","Name2","Name3","Name4","Name5","Name6"};
	
	public Iterator getIterator() {
		return new NamesIterator(namesString);
	}
}
