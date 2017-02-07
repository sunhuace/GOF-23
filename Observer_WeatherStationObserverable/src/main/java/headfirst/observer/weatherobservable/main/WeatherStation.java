package headfirst.observer.weatherobservable.main;

import headfirst.observer.weatherobservable.oberver.CurrentConditionsDisplay;
import headfirst.observer.weatherobservable.oberver.ForecastDisplay;
import headfirst.observer.weatherobservable.oberver.StatisticsDisplay;
import headfirst.observer.weatherobservable.observable.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
