package javacodes.designpatterns.creational.builder.prototype;

public class Rectangle extends Shape{

	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		super(width, height);
	}

	@Override
	public void draw() {
		System.out.println("Rectangle with width : " + width + " and height : " + height);
	}

	@Override
	public Shape cloneObject() {
		return new Rectangle(width, height);
	}

	
}