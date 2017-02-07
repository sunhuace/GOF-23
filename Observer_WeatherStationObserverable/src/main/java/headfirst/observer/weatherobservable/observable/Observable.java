package headfirst.observer.weatherobservable.observable;

import java.util.Vector;

import headfirst.observer.weatherobservable.oberver.Obsever;

public class Observable {

	private boolean changed = false;
	private Vector<Obsever> obs;

	public Observable() {
		obs = new Vector<>();
	}

	public synchronized void addObserver(Obsever o) {
		if (o == null)
			throw new NullPointerException();
		if (!obs.contains(o)) {
			obs.addElement(o);
		}
	}

	public synchronized void deleteObserver(Obsever o) {
		obs.removeElement(o);
	}

	public void notifyObservers() {
		notifyObservers(null);
	}

	public void notifyObservers(Object arg) {
		Object[] arrLocal;

		synchronized (this) {
			if (!changed) {
				return;
			}
			arrLocal = obs.toArray();
			clearChanged();
		}

		for (int i = arrLocal.length - 1; i >= 0; i--) {
			((Obsever) arrLocal[i]).update(this, arg);
		}
	}

	public synchronized void deleteObservers() {
		obs.removeAllElements();
	}

	protected synchronized void setChanged() {
		changed = true;
	}

	protected synchronized void clearChanged() {
		changed = false;
	}

	public synchronized boolean hasChanged() {
		return changed;
	}

	public synchronized int countObservers() {
		return obs.size();
	}
}
