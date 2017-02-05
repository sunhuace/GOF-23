package headfirst.observer.weather.subject;

import java.util.*;

import headfirst.observer.weather.observer.Observer;

public class WeatherData implements Subject {                 

	private float temperature;
	private float humidity;
	private float pressure;

	/**
	 * 主题对象 用来持有所有Observer观察者接口的对象
	 * 观察者的添加在每一个Observer实例化对象的时候添加成功的
	 */
	private ArrayList observers;

	public WeatherData() {
		observers = new ArrayList();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	// other WeatherData methods here

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
