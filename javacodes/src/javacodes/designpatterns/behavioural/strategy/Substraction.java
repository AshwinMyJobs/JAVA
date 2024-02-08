package javacodes.designpatterns.behavioural.strategy;

import javacodes.designpatterns.creational.singleton.abstractfactory.Vehicle;

public class Substraction implements Strategy {

	@Override
	public void execute(int a, int b) {
		System.out.println(a - b);
	}

}
