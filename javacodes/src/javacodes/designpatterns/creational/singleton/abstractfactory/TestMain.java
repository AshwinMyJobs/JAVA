package javacodes.designpatterns.creational.singleton.abstractfactory;

public class TestMain {

	public static void main(String[] args) {

		Factory bykeFactory = AbstractVehicleFactory.getFactory(VehicleType.BYKE);
		String ktm = bykeFactory.getVehicle(Bykes.TVSAPACHE.toString()).getName();
		System.out.println(ktm);
		
		String thar = AbstractVehicleFactory.getFactory(VehicleType.CAR).getVehicle("THAR").getName();
		System.out.println(thar);
		
		String hondaCity = AbstractVehicleFactory.getFactory(VehicleType.CAR).getVehicle("HONDACITY").getName();
		System.out.println(hondaCity);
		
	}

}
