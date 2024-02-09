package javacodes.designpatterns.behavioural.iterator;

public class NamesIterator implements Iterator{

	String[] names;
	int index;
	
	public NamesIterator(String[] namesString) {
		this.names = namesString;
	}

	@Override
	public boolean hasNext() {
		if(index<names.length)
			return true;
		else
			return false;
	}

	@Override
	public Object next() {
		if(hasNext())
			return names[index++];
		return null;
	}
	
}
