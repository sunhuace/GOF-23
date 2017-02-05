package headfirst.observer.weather.subject;

import headfirst.observer.weather.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();
}
