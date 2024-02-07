package javacodes.designpatterns.creational.singleton.factory;

public class TestClass {

	public static void main(String[] args) {
		
		Animal animal;
		
		animal = AnimalFactory.getAnimalInstance(AnimalType.CAT);
		animal.makeSound();
		animal = AnimalFactory.getAnimalInstance(AnimalType.DOG);
		animal.makeSound();
		animal = AnimalFactory.getAnimalInstance(AnimalType.LION);
		animal.makeSound();
		animal = AnimalFactory.getAnimalInstance(AnimalType.ELEPHANT);
		animal.makeSound();

	}

}
