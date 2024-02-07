package javacodes.designpatterns.creational.singleton.abstractfactory;

public class BykeFactory implements Factory{

	@Override
	public Vehicle getVehicle(String byke) {
		if(byke.equals(Bykes.KTM.toString())) {
			return new KTM();
		}else if (byke.equals(Bykes.HONDAACTIVA.toString())) {
			return new HondaActiva();
		}else if (byke.equals(Bykes.TVSAPACHE.toString())) {
			return new TVSApache();
		}
		
		return null;
	}
}
