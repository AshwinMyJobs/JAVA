package javacodes.designpatterns.creational.singleton.abstractfactory;

public class CarFactory implements Factory{

	@Override
	public Vehicle getVehicle(String car) {
		if(car.equals(Cars.HONDACITY.toString())) {
			return new HondaCity();
		}else if(car.equals(Cars.THAR.toString())){
			return new THAR();
		}
		return null;
	}
}
