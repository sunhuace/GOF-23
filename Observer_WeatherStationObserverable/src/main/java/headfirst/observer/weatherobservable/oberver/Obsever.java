package headfirst.observer.weatherobservable.oberver;

import headfirst.observer.weatherobservable.observable.Observable;

public interface Obsever {
	void update(Observable o, Object arg);
}
