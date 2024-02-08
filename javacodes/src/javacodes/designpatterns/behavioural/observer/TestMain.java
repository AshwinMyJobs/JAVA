package javacodes.designpatterns.behavioural.observer;

public class TestMain {

	public static void main(String[] args) {

		WeatherStation weatherStation = new WeatherStation();
		WeatherObserver weatherObserver = new WeatherObserver(weatherStation);
		
		weatherStation.setHumidity(10);
		weatherStation.setTemperature(10);
		weatherStation.setPressure(10);
				
	}

}
