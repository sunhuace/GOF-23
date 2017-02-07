package headfirst.observer.weatherobservable.oberver;

import headfirst.observer.weatherobservable.observable.Observable;
import headfirst.observer.weatherobservable.observable.WeatherData;
import headfirst.observer.weatherobservable.other.DisplayElement;

public class CurrentConditionsDisplay implements Obsever, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
}
