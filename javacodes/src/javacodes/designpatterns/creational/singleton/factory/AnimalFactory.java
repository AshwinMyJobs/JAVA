package javacodes.designpatterns.creational.singleton.factory;

public class AnimalFactory {

	public static Animal getAnimalInstance(AnimalType animalType) {
		if(animalType == AnimalType.CAT)
			return new Cat();
		else if (animalType == AnimalType.DOG) {
			return new Dog();
		}else if (animalType == AnimalType.LION) {
			return new Lion();
		}else if (animalType == AnimalType.ELEPHANT) {
			return new Elephant();
		}
		return null;
	}
}
