package javacodes.designpatterns.creational.singleton.abstractfactory;

public class AbstractVehicleFactory {

	public static Factory getFactory(VehicleType type) {
		if( type == VehicleType.BYKE) {
			return new BykeFactory();
		}else if( type == VehicleType.CAR) {
			return new CarFactory();
		}
		return null;
	}
}